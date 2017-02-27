package pl.sda.mvc.controller;

import pl.sda.fibonacci.Fibonacci;
import pl.sda.fibonacci.impl.FibonacciIterational;
import pl.sda.mvc.model.ModelFacade;

import java.util.List;
import java.util.Random;


public class Controller {

    public long getFibValue(int n) {
        Fibonacci fib = new FibonacciIterational();
        long value = fib.getN(n);
        ModelFacade.addValueThroughFaced(value);
        return value;

    }

    public double average() {
        double sum = 0;

        List<Long> values = ModelFacade.getValuesThroughFaced();

        for (long value : values) {
            sum = sum + value;
        }
        return sum / values.size();
    }
}
