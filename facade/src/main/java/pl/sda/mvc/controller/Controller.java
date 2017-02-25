package pl.sda.mvc.controller;

import pl.sda.mvc.model.Model;

import java.util.List;
import java.util.Random;

/**
 * Created by RENT on 2017-02-25.
 */
public class Controller {

    public int getFibValue(int n) {
        Random random = new Random();
        return random.nextInt(20000);
    }

    public double average() {
        double sum = 0;

        List<Integer> values = Model.getValues();

        for (int value : values) {
            sum = sum + value;
        }
        return sum / values.size();
    }
}
