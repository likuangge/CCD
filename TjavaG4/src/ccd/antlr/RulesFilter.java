package ccd.antlr;

import java.util.ArrayList;
import java.util.List;

public class RulesFilter {



    public static List<Integer> rulesFilter(){
        List<Integer> rulesfilter = new ArrayList<Integer>();
        rulesfilter.add(RULE_literal);
        rulesfilter.add(RULE_type);
        rulesfilter.add(RULE_numericType);
        rulesfilter.add(RULE_integralType);
        rulesfilter.add(RULE_floatingPointType);
        rulesfilter.add(RULE_referenceType);
        rulesfilter.add(RULE_classOrInterfaceType);
        rulesfilter.add(RULE_classType);
        rulesfilter.add(RULE_classType_lf_classOrInterfaceType);
        rulesfilter.add(RULE_interfaceType);
        rulesfilter.add(RULE_typeVariable);
        rulesfilter.add(RULE_arrayType);
        rulesfilter.add(RULE_typeParameter);
        rulesfilter.add(RULE_typeParameterModifier);
        rulesfilter.add(RULE_typeBound);
        rulesfilter.add(RULE_additionalBound);
        rulesfilter.add(RULE_typeArguments);
        rulesfilter.add(RULE_typeArgumentList);
        rulesfilter.add(RULE_typeArgument);
        rulesfilter.add(RULE_wildcard);
        rulesfilter.add(RULE_wildcardBounds);
        rulesfilter.add(RULE_typeName);
        rulesfilter.add(RULE_ambiguousName);
        rulesfilter.add(RULE_typeDeclaration);
        rulesfilter.add(RULE_methodName);
        rulesfilter.add(RULE_expressionName);
        rulesfilter.add(RULE_compilationUnit);
        rulesfilter.add(RULE_classMemberDeclaration);
        rulesfilter.add(RULE_fieldModifier);
        rulesfilter.add(RULE_typeParameterList);
        rulesfilter.add(RULE_methodBody);
        rulesfilter.add(RULE_methodHeader);
        rulesfilter.add(RULE_formalParameters);
        rulesfilter.add(RULE_formalParameterList);
        rulesfilter.add(RULE_block);
        rulesfilter.add(RULE_enumBody);
        rulesfilter.add(RULE_switchBlockStatementGroup);
        rulesfilter.add(RULE_continueStatement);
        rulesfilter.add(RULE_enhancedForStatementNoShortIf);
        rulesfilter.add(RULE_statement);
        rulesfilter.add(RULE_localVariableDeclaration);
        rulesfilter.add(RULE_blockStatements);
        rulesfilter.add(RULE_whileStatement);
        rulesfilter.add(RULE_arrayInitializer);
        rulesfilter.add(RULE_blockStatement);
        rulesfilter.add(RULE_formalParameter);
        rulesfilter.add(RULE_switchLabels);
        rulesfilter.add(RULE_methodModifier);
        rulesfilter.add(RULE_variableModifier);
        rulesfilter.add(RULE_result);
        rulesfilter.add(RULE_methodDeclaration);
        rulesfilter.add(RULE_breakStatement);
        rulesfilter.add(RULE_returnStatement);
        rulesfilter.add(RULE_enhancedForStatement);
        rulesfilter.add(RULE_localVariableDeclarationStatement);
        rulesfilter.add(RULE_methodReference);
        rulesfilter.add(RULE_whileStatementNoShortIf);
        rulesfilter.add(RULE_forStatementNoShortIf);
        rulesfilter.add(RULE_enumBodyDeclarations);
        rulesfilter.add(RULE_expression);
        rulesfilter.add(RULE_doStatement);
        rulesfilter.add(RULE_andExpression);
        rulesfilter.add(RULE_ifThenStatement);
        rulesfilter.add(RULE_ifThenElseStatementNoShortIf);
        rulesfilter.add(RULE_forStatement);
        rulesfilter.add(RULE_expressionStatement);
        rulesfilter.add(RULE_ifThenElseStatement);
        rulesfilter.add(RULE_switchStatement);
        rulesfilter.add(RULE_fieldAccess);





        return rulesfilter;
    }

    public static final int
            RULE_literal = 0, RULE_type = 1, RULE_primitiveType = 2, RULE_numericType = 3,
            RULE_integralType = 4, RULE_floatingPointType = 5, RULE_referenceType = 6,
            RULE_classOrInterfaceType = 7, RULE_classType = 8, RULE_classType_lf_classOrInterfaceType = 9,
            RULE_classType_lfno_classOrInterfaceType = 10, RULE_interfaceType = 11,
            RULE_interfaceType_lf_classOrInterfaceType = 12, RULE_interfaceType_lfno_classOrInterfaceType = 13,
            RULE_typeVariable = 14, RULE_arrayType = 15, RULE_dims = 16, RULE_typeParameter = 17,
            RULE_typeParameterModifier = 18, RULE_typeBound = 19, RULE_additionalBound = 20,
            RULE_typeArguments = 21, RULE_typeArgumentList = 22, RULE_typeArgument = 23,
            RULE_wildcard = 24, RULE_wildcardBounds = 25, RULE_packageName = 26, RULE_typeName = 27,
            RULE_packageOrTypeName = 28, RULE_expressionName = 29, RULE_methodName = 30,
            RULE_ambiguousName = 31, RULE_compilationUnit = 32, RULE_packageDeclaration = 33,
            RULE_packageModifier = 34, RULE_importDeclaration = 35, RULE_singleTypeImportDeclaration = 36,
            RULE_typeImportOnDemandDeclaration = 37, RULE_singleStaticImportDeclaration = 38,
            RULE_staticImportOnDemandDeclaration = 39, RULE_typeDeclaration = 40,
            RULE_classDeclaration = 41, RULE_normalClassDeclaration = 42, RULE_classModifier = 43,
            RULE_typeParameters = 44, RULE_typeParameterList = 45, RULE_superclass = 46,
            RULE_superinterfaces = 47, RULE_interfaceTypeList = 48, RULE_classBody = 49,
            RULE_classBodyDeclaration = 50, RULE_classMemberDeclaration = 51, RULE_fieldDeclaration = 52,
            RULE_fieldModifier = 53, RULE_variableDeclaratorList = 54, RULE_variableDeclarator = 55,
            RULE_variableDeclaratorId = 56, RULE_variableInitializer = 57, RULE_unannType = 58,
            RULE_unannPrimitiveType = 59, RULE_unannReferenceType = 60, RULE_unannClassOrInterfaceType = 61,
            RULE_unannClassType = 62, RULE_unannClassType_lf_unannClassOrInterfaceType = 63,
            RULE_unannClassType_lfno_unannClassOrInterfaceType = 64, RULE_unannInterfaceType = 65,
            RULE_unannInterfaceType_lf_unannClassOrInterfaceType = 66, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType = 67,
            RULE_unannTypeVariable = 68, RULE_unannArrayType = 69, RULE_methodDeclaration = 70,
            RULE_methodModifier = 71, RULE_methodHeader = 72, RULE_result = 73, RULE_methodDeclarator = 74,
            RULE_formalParameterList = 75, RULE_formalParameters = 76, RULE_formalParameter = 77,
            RULE_variableModifier = 78, RULE_lastFormalParameter = 79, RULE_receiverParameter = 80,
            RULE_throws_ = 81, RULE_exceptionTypeList = 82, RULE_exceptionType = 83,
            RULE_methodBody = 84, RULE_instanceInitializer = 85, RULE_staticInitializer = 86,
            RULE_constructorDeclaration = 87, RULE_constructorModifier = 88, RULE_constructorDeclarator = 89,
            RULE_simpleTypeName = 90, RULE_constructorBody = 91, RULE_explicitConstructorInvocation = 92,
            RULE_enumDeclaration = 93, RULE_enumBody = 94, RULE_enumConstantList = 95,
            RULE_enumConstant = 96, RULE_enumConstantModifier = 97, RULE_enumBodyDeclarations = 98,
            RULE_interfaceDeclaration = 99, RULE_normalInterfaceDeclaration = 100,
            RULE_interfaceModifier = 101, RULE_extendsInterfaces = 102, RULE_interfaceBody = 103,
            RULE_interfaceMemberDeclaration = 104, RULE_constantDeclaration = 105,
            RULE_constantModifier = 106, RULE_interfaceMethodDeclaration = 107, RULE_interfaceMethodModifier = 108,
            RULE_annotationTypeDeclaration = 109, RULE_annotationTypeBody = 110, RULE_annotationTypeMemberDeclaration = 111,
            RULE_annotationTypeElementDeclaration = 112, RULE_annotationTypeElementModifier = 113,
            RULE_defaultValue = 114, RULE_annotation = 115, RULE_normalAnnotation = 116,
            RULE_elementValuePairList = 117, RULE_elementValuePair = 118, RULE_elementValue = 119,
            RULE_elementValueArrayInitializer = 120, RULE_elementValueList = 121,
            RULE_markerAnnotation = 122, RULE_singleElementAnnotation = 123, RULE_arrayInitializer = 124,
            RULE_variableInitializerList = 125, RULE_block = 126, RULE_blockStatements = 127,
            RULE_blockStatement = 128, RULE_localVariableDeclarationStatement = 129,
            RULE_localVariableDeclaration = 130, RULE_statement = 131, RULE_statementNoShortIf = 132,
            RULE_statementWithoutTrailingSubstatement = 133, RULE_emptyStatement = 134,
            RULE_labeledStatement = 135, RULE_labeledStatementNoShortIf = 136, RULE_expressionStatement = 137,
            RULE_statementExpression = 138, RULE_ifThenStatement = 139, RULE_ifThenElseStatement = 140,
            RULE_ifThenElseStatementNoShortIf = 141, RULE_assertStatement = 142, RULE_switchStatement = 143,
            RULE_switchBlock = 144, RULE_switchBlockStatementGroup = 145, RULE_switchLabels = 146,
            RULE_switchLabel = 147, RULE_enumConstantName = 148, RULE_whileStatement = 149,
            RULE_whileStatementNoShortIf = 150, RULE_doStatement = 151, RULE_forStatement = 152,
            RULE_forStatementNoShortIf = 153, RULE_basicForStatement = 154, RULE_basicForStatementNoShortIf = 155,
            RULE_forInit = 156, RULE_forUpdate = 157, RULE_statementExpressionList = 158,
            RULE_enhancedForStatement = 159, RULE_enhancedForStatementNoShortIf = 160,
            RULE_breakStatement = 161, RULE_continueStatement = 162, RULE_returnStatement = 163,
            RULE_throwStatement = 164, RULE_synchronizedStatement = 165, RULE_tryStatement = 166,
            RULE_catches = 167, RULE_catchClause = 168, RULE_catchFormalParameter = 169,
            RULE_catchType = 170, RULE_finally_ = 171, RULE_tryWithResourcesStatement = 172,
            RULE_resourceSpecification = 173, RULE_resourceList = 174, RULE_resource = 175,
            RULE_primary = 176, RULE_primaryNoNewArray = 177, RULE_primaryNoNewArray_lf_arrayAccess = 178,
            RULE_primaryNoNewArray_lfno_arrayAccess = 179, RULE_primaryNoNewArray_lf_primary = 180,
            RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary = 181, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary = 182,
            RULE_primaryNoNewArray_lfno_primary = 183, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary = 184,
            RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary = 185,
            RULE_classInstanceCreationExpression = 186, RULE_classInstanceCreationExpression_lf_primary = 187,
            RULE_classInstanceCreationExpression_lfno_primary = 188, RULE_typeArgumentsOrDiamond = 189,
            RULE_fieldAccess = 190, RULE_fieldAccess_lf_primary = 191, RULE_fieldAccess_lfno_primary = 192,
            RULE_arrayAccess = 193, RULE_arrayAccess_lf_primary = 194, RULE_arrayAccess_lfno_primary = 195,
            RULE_methodInvocation = 196, RULE_methodInvocation_lf_primary = 197, RULE_methodInvocation_lfno_primary = 198,
            RULE_argumentList = 199, RULE_methodReference = 200, RULE_methodReference_lf_primary = 201,
            RULE_methodReference_lfno_primary = 202, RULE_arrayCreationExpression = 203,
            RULE_dimExprs = 204, RULE_dimExpr = 205, RULE_constantExpression = 206,
            RULE_expression = 207, RULE_lambdaExpression = 208, RULE_lambdaParameters = 209,
            RULE_inferredFormalParameterList = 210, RULE_lambdaBody = 211, RULE_assignmentExpression = 212,
            RULE_assignment = 213, RULE_leftHandSide = 214, RULE_assignmentOperator = 215,
            RULE_conditionalExpression = 216, RULE_conditionalOrExpression = 217,
            RULE_conditionalAndExpression = 218, RULE_inclusiveOrExpression = 219,
            RULE_exclusiveOrExpression = 220, RULE_andExpression = 221, RULE_equalityExpression = 222,
            RULE_relationalExpression = 223, RULE_shiftExpression = 224, RULE_additiveExpression = 225,
            RULE_multiplicativeExpression = 226, RULE_unaryExpression = 227, RULE_preIncrementExpression = 228,
            RULE_preDecrementExpression = 229, RULE_unaryExpressionNotPlusMinus = 230,
            RULE_postfixExpression = 231, RULE_postIncrementExpression = 232, RULE_postIncrementExpression_lf_postfixExpression = 233,
            RULE_postDecrementExpression = 234, RULE_postDecrementExpression_lf_postfixExpression = 235,
            RULE_castExpression = 236;

}
