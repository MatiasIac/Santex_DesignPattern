package test.chainOfResponsability;

import test.factoryMethod.Rule;

/**
 * Created by manuv on 22/10/2016.
 */
public class LengthValidator extends Rule {

    private int sizeLimit;

    public LengthValidator (int sizeLimit){
        name = "LENGTH VALIDATOR";
        this.sizeLimit = sizeLimit;
    }

    @Override
    public void handle(String input) {
        if (input.length() < sizeLimit){
            notifyObservers();
            goNext(input);
        }
        else{
            System.out.printf("Error. Input exceeds size limit");
        }
    }
}
