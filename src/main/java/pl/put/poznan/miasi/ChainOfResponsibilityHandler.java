package pl.put.poznan.miasi;


import java.util.HashSet;
import java.util.Set;

public class ChainOfResponsibilityHandler {

    private HashSet<IChain> chains;

    public ChainOfResponsibilityHandler() {
        chains = new HashSet<IChain>();
        chains.add(new AdditionChain());
        chains.add(new SubtractionChain());
        chains.add(new MultiplicationChain());
        chains.add(new DivisionChain());
    }

    private void addChain(IChain chain) {
        chains.add(chain);
    }

    public void run(IOperation operation) {
        OperationParser operationParser = new OperationParser(operation);
        operationParser.printOperation();
        operation = operationParser.getOperation();
        Object endResult = null;
        for (IChain chain : chains) {
            Object result = chain.doWork(operation);
            if (result != null) {
                endResult = result;
                break;
            }
        }
        if (endResult != null) {
            System.out.println(endResult);
        } else {
            System.out.println("Nieznana operacja");
        }
    }

}
