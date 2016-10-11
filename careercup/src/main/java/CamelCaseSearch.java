import java.util.ArrayList;
import java.util.List;

/**
 * Camel Case Search Problem
 * https://careercup.com/question?id=5660887265312768
 * <p>
 * List of string that represent class names in CamelCaseNotation.
 * <p>
 * Write a function that given a List and a pattern returns the matching elements.
 * <p>
 * ['HelloMars', 'HelloWorld', 'HelloWorldMars', 'HiHo']
 * <p>
 * H -> [HelloMars, HelloWorld, HelloWorldMars, HiHo]
 * HW -> [HelloWorld, HelloWorldMars]
 * Ho -> []
 * HeWorM -> [HelloWorldMars]
 */
public class CamelCaseSearch {
    String[] dictionary;

    private CamelCaseSearch(String[] dictionary) {
        this.dictionary = dictionary;
    }

    public static CamelCaseSearch getInstance(String[] dictionary) {
        return new CamelCaseSearch(dictionary);
    }

    /**
     * Simple naive approach
     */
    public List<String> find(String search) {
        List<String> output = new ArrayList<>();
        for (String string : dictionary) {
            if (checkString(search, string)) {
                output.add(string);
            }
        }
        return output;
    }

    private boolean checkString(String pattern, String item) {
        char[] chars = pattern.toCharArray();

        int itemIndex = 0;
        for (char character : chars) {
            if (Character.isUpperCase(character)) {
                itemIndex = nextUpperIndex(item, itemIndex);
            }
            if (itemIndex < 0 || character != item.charAt(itemIndex)) {
                return false;
            }
            itemIndex++;
        }
        return true;
    }

    private int nextUpperIndex(String item, int index) {
        while (index < item.length() && !Character.isUpperCase(item.charAt(index))) {
            index++;
        }
        if (index >= item.length()) {
            return -1;
        }
        return index;
    }
}
