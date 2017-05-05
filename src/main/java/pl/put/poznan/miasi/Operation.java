package pl.put.poznan.miasi;

public class Operation implements IOperation {

    private String operationString;
    private String leftOperand;
    private String rightOperand;
    private String operator;

    public Operation(String operationString) {
        this.operationString = operationString;
    }

    public String getOperationString() {
        return operationString;
    }

    public String getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(String leftOperand) {
        this.leftOperand = leftOperand;
    }

    public String getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(String rightOperand) {
        this.rightOperand = rightOperand;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
