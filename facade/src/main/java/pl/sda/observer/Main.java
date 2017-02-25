package pl.sda.observer;


import pl.sda.facade.SortFacade;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Observer observer = new Observer();
        SortFacade sortFacade = new SortFacade(observer);

        int[] input = new int[]{345, 56, 12, 15, 123, 99, -1, -7};

        int[] result = sortFacade.sortUsingCountSort(input);
        System.out.println(Arrays.toString(result));
    }
}
