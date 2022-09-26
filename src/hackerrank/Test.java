package hackerrank;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
//        System.out.println("Passed the first test!\nMany more to come!");
//        System.out.println("Sum of all up to and including 3: " + sumAll(6));
//        doSum();
        System.out.println("sumArrayI [2, 4, 9, 10.3]: " + sumArrayI(new double[]{2, 4, 9, 10.3}));
        System.out.println("sumArray [ 2, 4, 9, 10.3]: " + sumArray(new double[]{2, 4, 9, 10.3}));
        System.out.println("sumArrayIII [2.2, 3.2, 9, 10.456]: " + sumArrayIII(new double[]{2.2, 3.2, 9, 10.456}));
    }

    public static int sumAll(int max) {
        int total = 0;

        for(int index = 1; index <= max; index++) {
            total += index;
        }

        return total;
    }

    public static int sumAllII(int max) {
        return max * (max + 1) / 2;
    }

    public static void doSum() {
//        long start1 = System.currentTimeMillis();
//        int total = sumAll(1000000000);
//        System.out.println("Total: " + total);
//        long end1 = System.currentTimeMillis();
//
//        long time = end1 - start1;
//        long seconds = time / 10000;
        Instant inst1 = Instant.now();
        long total = sumAll(100);
        System.out.println("Total: " + total);
        Instant inst2 = Instant.now();

       // long duration = Duration.between(inst1, inst2) / 1_000;
        System.out.println("Elapsed Time: " + Duration.between(inst1, inst2).toString());

        System.out.println("Race and Care are anagrams: " + isAnagram("Race", "Care"));
    }


    public static boolean isAnagram(String wordOne, String wordTwo) {
        wordOne = wordOne.toLowerCase();
        wordTwo = wordTwo.toLowerCase();

        // check length
        if(wordOne.length() == wordTwo.length()) {
            // convert strings to char array
            char[] charArray1 = wordOne.toCharArray();
            char[] charArray2 = wordTwo.toCharArray();

            // sort the char array -
            // when sorted, each will contain all the elements of the other
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // if sorted char arrays are the same
            return Arrays.equals(charArray1, charArray2);
        }

        return false;
    }

    public static double sumArrayI(double[] numbers) {
        if(numbers.length > 0) {
            double total = 0;
            for(double number : numbers)
                total += number;
            return total;
        }

        return 0.0;
    }

    public static double sumArray(double[] numbers) {
        if(numbers.length > 0)
            return Arrays.stream(numbers).sum();

        return 0;
    }

    public static double sumArrayIII(double[] numbers) {
        return (numbers.length > 0) ? Arrays.stream(numbers).sum() : 0;
    }
}
