package pl.sda.singletonFactory;

import pl.sda.sort.Sort;
import pl.sda.sort.factory.SortTypeEnum;

import java.util.Arrays;

/**
 * Created by RENT on 2017-02-25.
 */
public class Main {
    public static void main(String[] args) {
        SingletonFactory factory = SingletonFactory.getInstance();

        Sort sort = factory.produce(SortTypeEnum.BUBBLE);

        int[] sortedArray = sort.sort(new int[]{232, 45, 32, 67, 1, 8, 66});
        System.out.println(Arrays.toString(sortedArray));
    }
}
