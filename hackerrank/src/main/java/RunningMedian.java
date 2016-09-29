import java.util.Scanner;

/**
 * The median of a set of integers is the midpoint value of the data set for which
 * an equal number of integers are less than and greater than the value.
 * To find the median, you must first sort your set of integers in non-decreasing order, then:
 * <p>
 * If your set contains an odd number of elements, the median is the middle element of the sorted sample.
 * In the sorted set {1,2,3}, 2 is the median.
 * <p>
 * If your set contains an even number of elements, the median is the average
 * of the two middle elements of the sorted sample.
 * In the sorted set {1,2,3,4}, (2+3)/2 = 2.5 is the median.
 * <p>
 * Given an input stream of  integers, you must perform the following task for each  integer:
 * <p>
 * 1. Add the  integer to a running list of integers.
 * 2. Find the median of the updated list (i.e., for the first element through the  element).
 * 3. Print the list's updated median on a new line.
 * The printed value must be a double-precision number scaled to decimal place (i.e.,  format).
 * <p>
 * Input Format
 * <p>
 * The first line contains a single integer, , denoting the number of integers in the data stream.
 * Each line  of the  subsequent lines contains an integer, , to be added to your list.
 * <p>
 * Constraints
 * <p>
 * 1 <= n <= 10^5
 * 0 <= a_i <= 10^5
 * <p>
 * Output Format
 * <p>
 * After each new integer is added to the list, print the list's updated median on a new line as a single double-precision number scaled to  decimal place (i.e.,  format).
 */
public class RunningMedian {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
    }
}
