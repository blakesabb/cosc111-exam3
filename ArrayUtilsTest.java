

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ArrayUtilsTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ArrayUtilsTest
{
	// Test the function to sum the array
    @Test
    public void TestSumArray()
    {
        int[] data = {1,2,3,4};
        assertEquals(10, ArrayUtils.sumArray(data));
    }
    
    @Test
    public void TestSumArray2()
    {
    	int[] data = {0, 5, 2, 3, 0, 5};
    	assertEquals(15, ArrayUtils.sumArray(data));
    }
    
    // Test the function to find the index of the largest value
    @Test
    public void TestFindIndexOfLargestValue()
    {
    	int[] data = {0, 6, 2, 3, 0, 5};
    	assertEquals(1, ArrayUtils.findIndexOfLargestValue(data));
    }
    
    @Test
    public void TestFindIndexOfLargestValue2()
    {
    	int[] data = {1,2,3,4,5,6};
    	assertEquals(5, ArrayUtils.findIndexOfLargestValue(data));
    }
}

