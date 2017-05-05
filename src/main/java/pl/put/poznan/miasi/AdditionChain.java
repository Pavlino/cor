package pl.put.poznan.miasi;

public class AdditionChain implements IChain  {

    private final String operator = "+";

    public Object doWork(IOperation operation) {
        if (operator.equals(operation.getOperator())) {
            return Double.parseDouble(operation.getLeftOperand()) + Double.parseDouble(operation.getRightOperand());
        } else {
            return null;
        }
    }

}
