package shopback;

import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

/**
 * Created by malam on 7/29/16.
 */
public class StringPermTester {

    public int factorial(int n) {
        if (n == 1)
            return 1;
        return n * (n - 1);
    }

    @Test
    public void testPermutations() {
        String input = "ABC";
        String[] expected = {"ABC", "ACB", "BAC", "BCA", "CAB", "CBA"};

        System.out.println("Testing - " + input);
        List<String> result = StringPerm.permutation(input);
        String[] resultArray = new String[result.size()];
        resultArray = result.toArray(resultArray);

        Assert.assertEquals(result.size(), factorial(input.length()));
        Assert.assertArrayEquals(resultArray, expected);
    }

    @Test
    public void testPermutationWithDuplicates() {
        String input = "AACC";
        String[] expected = {"AACC", "ACAC", "ACCA", "CAAC", "CACA", "CCAA"};

        System.out.println("Testing - " + input);
        List<String> result = StringPerm.permutation(input);
        String[] resultArray = new String[result.size()];
        resultArray = result.toArray(resultArray);

        Assert.assertArrayEquals(resultArray, expected);
    }

}
