package test.chainOfResponsability;

import test.factoryMethod.Rule;

/**
 * Created by manuv on 30/10/2016.
 */
public class IntegerValidation extends Rule {
    private final String INTEGER_REGEX = "[-]?[0-9]+";

    public IntegerValidation(){
        name = "INTEGER VALIDATOR";
    }

    @Override
    public void handle(String input) throws Exception {
        System.out.println("-----");
        System.out.println("Analyzing in: " + name + ". input = [" + input + "]");
        notifyObservers();
        if (isInteger(input)) {
            goNext(input);
        } else {
            throw new Exception("Error. Input is not an Integer value");
        }
    }

    private boolean isInteger(String input){
        return input.matches(INTEGER_REGEX);
    }
}
