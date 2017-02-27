package pl.sda.decorator;

import org.junit.Assert;
import org.junit.Test;
import pl.sda.sort.Sort;
import pl.sda.sort.impl.BubbleSort;

/**
 * Created by RENT on 2017-02-27.
 */
public class DecoratorTest {

    @Test
    public void testDecorator() {

        //given
        int[] arrayToSort = {55, 33, 454, -87, -23, 8};
        SortDecoratorWithReverse decoratedSort = new SortDecoratorWithReverse(new BubbleSort());

        //when
        int[] result = decoratedSort.sort(arrayToSort);

        //then
        Assert.assertEquals(454, result[0]);
        Assert.assertEquals(-87, result[result.length - 1]);
    }
}
