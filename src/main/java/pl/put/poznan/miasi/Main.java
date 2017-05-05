package pl.put.poznan.miasi;

public class Main {

    public static void main(String [] args) {
        Operation operation = new Operation("2/3");
        ChainOfResponsibilityHandler chainOfResponsibilityHandler = new ChainOfResponsibilityHandler();
        chainOfResponsibilityHandler.run(operation);
    }

}
