package pl.put.poznan.miasi;

public class FunnyChain implements IChain {

    private final String operator = "#";

    public Object doWork(IOperation operation) {
        if(operator.equals(operation.getOperator())){
            try{
                return (Double.parseDouble(operation.getLeftOperand() + operation.getRightOperand()))*3;
            }
            catch(Exception e){
                return null;
            }

        }
        else{
            return null;
        }
    }
}
