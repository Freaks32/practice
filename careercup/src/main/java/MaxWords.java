/**
 * Max Words Problem
 * https://careercup.com/question?id=5639859738771456
 * <p>
 * Let's say I have a word "I love chicken", I can break the number of characters in each word, like so: [1] [4] [7]
 * [1,4] [4,7], [1,4,7].
 * <p>
 * Now let's say I have a max = 5. The phrases with equal or fever than 5 characters are "[I], [love], and [I, love]. The longest phrase is [I,love], which contains 2 words.
 * <p>
 * Complete the Length function given. It has 2 parameters:
 * <p>
 * 1) An array of integers, named array
 * 2) A maximum number, named max.
 * <p>
 * int maxWords(int [] array, int max)
 * <p>
 * Example test case 1:
 * <p>
 * [3,1,2,3]
 * 4
 * <p>
 * Output expected : 2
 */
public class MaxWords {
    public static int maxWords(int[] array, int max) {
        return 0;
    }

    public static int maxConsecutiveWords(int[] array, int max) {
        return 0;
    }

    public static int maxCharacters(int[] array, int max) {
        if (array.length < 1) {
            throw new IllegalArgumentException("Invalid Array");
        }
        if (max < 0) {
            throw new IllegalArgumentException("Invalid Maximum");
        }

        int[][] charCounter = new int[array.length][max + 1];
        for (int i = 0; i < charCounter.length; i++) {
            charCounter[i][0] = 0;
        }

        for (int j = 1; j < charCounter[0].length; j++) {
            if (j >= array[0]) {
                charCounter[0][j] = array[0];
            } else {
                charCounter[0][j] = 0;
            }
        }

        for (int i = 1; i < charCounter.length; i++) {
            for (int j = 1; j < charCounter[i].length; j++) {
                int noChoose = charCounter[i - 1][j];
                int chooseIndex = j - array[i];
                int choose = (chooseIndex >= 0 ? charCounter[i - 1][chooseIndex] : 0) + array[i];

                if (choose > max) {
                    charCounter[i][j] = noChoose;
                } else {
                    charCounter[i][j] = Math.max(noChoose, choose);
                }
            }
        }

        return charCounter[array.length - 1][max];
    }
}
