import org.junit.Test;
import org.junit.Assert;

public class SortingTest {
    @Test
    public void convertArrayToStringTest() {
        //expect
        Sorting toString = new Sorting();

        String expected = "1\n2\n3\n4\n5";
        //actual
        int[] testArray = {1, 2, 3, 4, 5};
        String actual = toString.convertArrayToString(testArray);
        //Test
        Assert.assertEquals("String are equal", expected, actual);
    }

    @Test
    public void bubbleSortTest() {
        //expect
        Sorting sort = new Sorting();
        int[] expectedArray = {1, 2, 3, 4, 5};
        String expected = sort.convertArrayToString(expectedArray);

        //actual
        int[] testArray = {3, 4, 2, 5, 1};
        int[] actualArray = sort.bubbleSort(testArray);
        String actual = sort.convertArrayToString(actualArray);

        //test
        Assert.assertEquals("array same", expected, actual);
    }

    @Test
    public void hiToLowTest() {
        //expect
        Sorting sort = new Sorting();
        int[] expectedArray = {1, 2, 3, 4, 5};
        String expected = sort.convertArrayToString(expectedArray);

        //actual
        int[] testArray = {4, 1, 5, 2, 3};
        int[] actualArray = sort.lowToHi(testArray);
        String actual = sort.convertArrayToString(actualArray);

        //test
        Assert.assertEquals("Strings are equal", expected, actual);
    }
}
