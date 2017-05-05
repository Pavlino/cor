package pl.put.poznan.miasi;

public interface IOperation {
    String getOperationString();
    String getLeftOperand();
    String getRightOperand();
    String getOperator();
    void setLeftOperand(String operand);
    void setRightOperand(String operand);
    void setOperator(String operator);
}
