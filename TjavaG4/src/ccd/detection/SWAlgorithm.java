package ccd.detection;

import ccd.model.Sequence;

import java.util.ArrayList;
import java.util.List;

/**
 * SW FOR CCD
 *
 * 发现的问题:
 * 1.s(矩阵行)的长度必须小于t(矩阵列)的长度
 *
 * 2.第一次回溯过程正常, 接下来回溯过程有点残缺,会影响到准确率, 之后完善补一补
 *
 * 3.覆盖问题
 *
 * */
public class SWAlgorithm {
    public static int[][] M_matrix;//得分矩阵
    //回溯方向
    public static final int TL = 0;//左上
    public static final int BL = 1;//左下
    public static final int TR = 2;//右上
    public static final int BR = 3;//右下
    //待检测字符串的长度-矩阵大小
    public static int s_size;
    public static int t_size;
    public static List<TraceBack> tbList = new ArrayList<TraceBack>();//回溯结果集合

    public static void executeSW(Sequence s, Sequence t, int threshold){
        s_size = s.getBody().size();
        t_size = t.getBody().size();
        if(s_size <= t_size){
            M_matrix = GenMatrix.genMatrix(s,t,threshold);
        }else{//s长度不能小于t长度,s和t直接互换位置不行:M_matrix = GenMatrix.genMatrix(t,s,threshold);
            Sequence u = s;
            s = t;
            t = u;
            M_matrix = GenMatrix.genMatrix(s,t,threshold);
        }
        s_size = s.getBody().size();
        t_size = t.getBody().size();
        //List<MatchString> matchStringList;
        //List<MaxIndex> maxIndexList = new ArrayList<MaxIndex>();
        TraceBack tb = new TraceBack();
        MaxIndex maxIndex = findMaxIndex(M_matrix,0,0,s_size,t_size).get(0);
        int startRow = maxIndex.row;
        int startCol = maxIndex.col;
        tb.traceBack(M_matrix,s,t,startRow,startCol);
        int endRow = tb.getEndRow();
        int endCol = tb.getEndCol();

        int filterSize = tb.matchList.matchLS.size();//过滤掉短字符
        if(filterSize >= threshold){
            tbList.add(tb);
        }

        recallMatrix(M_matrix, s, t, 0, 0, endRow-1, endCol-1, 1, 1, threshold, TL);
        recallMatrix(M_matrix, s, t, startRow+1, 0, s_size, endCol-1, 1, 1, threshold, BL);
        recallMatrix(M_matrix, s, t, 0, startCol+1, endRow+1, t_size, 1, 1, threshold, TR);
        recallMatrix(M_matrix, s, t, startRow+1, startCol+1, s_size, t_size, 1, 1, threshold, BR);
    }

    /**
     * M_matrix:得分矩阵
     * s,t:待检测字符串
     * startRow,startCol:矩阵左上角元素坐标
     * endRow,endCol:矩阵右下角元素坐标
     * //finishRow,finishCol:回溯结束位置-暂时没用到
     * threshold:阈值
     * trackDirection:回溯方向
     * */
    public static void recallMatrix(int [][] M_matrix, Sequence s, Sequence t, int startRow, int startCol, int endRow, int endCol,
                                    int finishRow, int finishCol, int threshold, int trackDirection){
        TraceBack traceBack;
        MaxIndex maxIndex;
        List<MaxIndex> maxIndexList;
        //switch
        if(trackDirection == TL){//左上
            if(endRow-1 <= 0 || endCol-1 <= 0){ return;}
            maxIndexList = findMaxIndex(M_matrix,0,0,endRow-1,endCol-1);
        }else if(trackDirection == BL){//左下
            if(startRow-1 <= 0 || endCol-1 <= 0){ return;}
            maxIndexList = findMaxIndex(M_matrix,startRow+1,0,s_size,endCol-1);
        }else if(trackDirection == TR){//右上
            if(startRow+1 >= s_size || startCol+1 >= t_size){ return;}//startRow+1 >= s_size 右面条件
            maxIndexList = findMaxIndex(M_matrix,0,startCol+1,endRow-1,t_size);
        }else if(trackDirection == BR){//右下
            if(startRow+1 >= s_size || startCol+1 >= t_size){ return;}
            maxIndexList = findMaxIndex(M_matrix,startRow+1,startCol+1,s_size,t_size);
        }else{
            System.out.println("error direction"); return;
        }

        for (int i = 0; i < maxIndexList.size() ; i++) {
            //存在覆盖问题
            traceBack = new TraceBack();
            traceBack.setStopRow(startRow);
            traceBack.setStopCol(startCol);
            if(maxIndexList.size() == 0){
                break;
            }else {
                maxIndex = maxIndexList.get(i);
                startRow = maxIndex.row;//最大值元素的行号和列号
                startCol = maxIndex.col;
                traceBack.traceBack(M_matrix, s, t, startRow, startCol);
                endRow = traceBack.getEndRow();//获取回溯终止元素坐标
                endCol = traceBack.getEndCol();

                int filterSize = traceBack.matchList.matchLT.size();//过滤掉短字符
                if (filterSize >= threshold) {
                    tbList.add(traceBack);
                }

                if(trackDirection == TL){//左上*
                    if(endRow-1 > 0 || endCol-1 > 0){
                        recallMatrix(M_matrix, s, t, 0, 0, endRow-1, endCol-1, finishRow, finishCol, threshold, TL);
                    }else{
                        continue;
                    }
                }else if(trackDirection == BL){//左下
                    if(endRow-1 > 0 || endCol-1 > 0){
                        recallMatrix(M_matrix, s, t, endRow, 0, endRow-1, endCol-1, finishRow, finishCol, threshold, BL);
                    }else{
                        continue;
                    }
                }else if(trackDirection == TR){//右上
                    if(startRow+1 < s_size || startCol+1 < t_size){
                        recallMatrix(M_matrix, s, t, 0, startCol+1, endRow+1, t_size, finishRow, finishCol, threshold, TR);
                    }else{
                        continue;
                    }
                }else if(trackDirection == BR){//右下*
                    if(startRow+1 < s_size || startCol+1 < t_size){
                         recallMatrix(M_matrix, s, t, startRow+1, startCol+1, s_size, t_size, finishRow, finishCol, threshold, BR);
                    }else{
                        continue;
                    }
                }else{
                    System.out.println("error direction"); return;
                }
            }
        }
    }

    /**
     * 获取矩阵中的最大值的row,col
     * 最大值可能有多个(多个相同的最大值,把这些值放到一个list中存储)
     */
    public static List<MaxIndex> findMaxIndex(int[][] H, int startRow, int startCol, int endRow, int endCol){
        List<MaxIndex> maxIndexList = new ArrayList<MaxIndex>();
        int max = H[0][0];
        //找到最大值是多少
        for(int i = startRow; i <= endRow; i++){
            for(int j = startCol; j <= endCol; j++){
                if(H[i][j] > max){
                    max = H[i][j];
                }
            }
        }
        //最大值所在矩阵中的坐标
        MaxIndex maxIndex;
        for(int i = startRow; i <= endRow; i++){
            for(int j = startCol; j <= endCol; j++){
                if(H[i][j] == max){
                    maxIndex = new MaxIndex();
                    maxIndex.row = i;
                    maxIndex.col = j;
                    maxIndexList.add(maxIndex);
                }
            }
        }
        return maxIndexList;
    }
}
