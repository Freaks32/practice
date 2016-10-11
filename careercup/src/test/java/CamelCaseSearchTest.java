import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Test for CamelCaseSearch Problem
 */
public class CamelCaseSearchTest {
    private static String[] dictionary1 = new String[]{
            "HelloMars", "HelloWorld", "HelloWorldMars", "HiHo"
    };

    @Test
    public void find() throws Exception {
        CamelCaseSearch camelCaseSearch = CamelCaseSearch.getInstance(dictionary1);

        List<String> expected1 = new ArrayList<>(
                Arrays.asList("HelloMars", "HelloWorld", "HelloWorldMars", "HiHo"));
        Assert.assertEquals(expected1, camelCaseSearch.find("H"));
        List<String> expected2 = new ArrayList<>(
                Arrays.asList("HelloWorld", "HelloWorldMars"));
        Assert.assertEquals(expected2, camelCaseSearch.find("HW"));
        List<String> expected3 = new ArrayList<>();
        Assert.assertEquals(expected3, camelCaseSearch.find("Ho"));
        List<String> expected4 = new ArrayList<>(Collections.singletonList("HelloWorldMars"));
        Assert.assertEquals(expected4, camelCaseSearch.find("HeWorM"));
    }
}