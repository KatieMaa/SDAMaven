package pl.sda.facade;

import pl.sda.sort.Sort;
import pl.sda.sort.impl.InsertSort;

import java.util.Arrays;

/**
 * Created by RENT on 2017-02-25.
 */
public class Main {
    public static void main(String[] args) {

        int[] tab = new int[] {553, 55, 33, 1};
        SortFacade sort = new SortFacade();
        int[] result = sort.sortThroughFacade(tab);
        System.out.println(Arrays.toString(result));

    }
}
