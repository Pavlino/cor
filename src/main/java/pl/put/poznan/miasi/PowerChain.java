package pl.put.poznan.miasi;

public class PowerChain implements IChain  {

    private final String operator = "^";

    public Object doWork(IOperation operation) {
        if (operator.equals(operation.getOperator())) {
            try {
                return Math.pow(Double.parseDouble(operation.getLeftOperand()), Double.parseDouble(operation.getRightOperand()));
            } catch (Exception e) {
                return null;
            }
        } else {
            return null;
        }
    }

}
