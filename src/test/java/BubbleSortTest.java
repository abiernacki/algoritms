import bubblesort.BubbleSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void testSort1(){

        //given
        int[] tab = {0,1,-1,3,5,2};

        //when
        BubbleSort bubbleSort = new BubbleSort();
        int[] result = bubbleSort.sort(tab);

        //then
        int[] expect = {-1,0,1,2,3,5};
        assertArrayEquals(expect,result);
    }


}