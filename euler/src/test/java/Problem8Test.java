import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.util.Scanner;

/**
 * Created by Brian on 8/27/2016.
 */
public class Problem8Test {
    @Test
    public void largestAdjacentProduct() throws Exception {
        String inputNumber = new Scanner(new File("src/test/resources/problem8/testInputNumber.txt")).next();
        int numAdjacentDigits = 4;

        long product = Problem8.largestAdjacentProduct(inputNumber, numAdjacentDigits);
        Assert.assertEquals(5832L, product);
    }

    @Test
    public void largestAdjacentProductBasic() throws Exception {
        String inputNumber = "1357986420";
        int numAdjacentDigits = 2;

        long product = Problem8.largestAdjacentProduct(inputNumber, numAdjacentDigits);
        Assert.assertEquals(72L, product);
    }
}