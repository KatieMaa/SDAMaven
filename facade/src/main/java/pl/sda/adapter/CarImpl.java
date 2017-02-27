package pl.sda.adapter;

/**
 * Created by RENT on 2017-02-27.
 */
public class CarImpl implements Car {
    @Override
    public void drive() {
        System.out.println("I'm driving");
    }

    @Override
    public void horn() {
        System.out.println("I'm honking");
    }
}
