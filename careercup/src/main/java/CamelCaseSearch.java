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

    public List<String> find(String search) {
        return null;
    }
}
