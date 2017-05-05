package pl.put.poznan.miasi;

import org.apache.commons.lang.math.NumberUtils;

public class OperationParser {

    private String leftOperand;
    private String rightOperand;
    private String operator;
    private String tempOperationString;
    private IOperation operation;

    public OperationParser(IOperation operation) {
        leftOperand = parseLeftOperand(operation);
        operator = parseOperator(tempOperationString);
        rightOperand = parseRightOperand(tempOperationString);
        this.operation = operation;
        this.operation.setLeftOperand(leftOperand);
        this.operation.setRightOperand(rightOperand);
        this.operation.setOperator(operator);
    }

    private String parseLeftOperand(IOperation operation) {
        String leftOperand = "";
        String operationString = operation.getOperationString();
        for (int i = 1; i < operationString.length(); i++) {
            String str = operationString.substring(0, i);
            if (NumberUtils.isNumber(str)) {
                leftOperand = str;
            } else {
                tempOperationString = operationString.substring(i-1);
                break;
            }
        }
        return leftOperand;
    }

    private String parseOperator(String operationString) {
        if (operationString.charAt(0) == ' ') {
            tempOperationString = operationString.substring(2);
            return "" + operationString.charAt(1);
        } else {
            tempOperationString = operationString.substring(1);
            return "" + operationString.charAt(0);
        }
    }

    private String parseRightOperand(String operationString) {
        if (operationString.charAt(0) == ' ') {
            operationString = operationString.substring(1);
        }
        return operationString;
    }

    public void printOperation() {
        System.out.println(leftOperand + " " + operator + " " + rightOperand);
    }

    public IOperation getOperation() {
        return operation;
    }

}
