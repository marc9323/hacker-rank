package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class LargestFiveDigitNumber {

    public static void main(String[] args) {
        System.out.println("Largest 5 consecutive substrings: " + LargestFiveDigitNum("1234567890"));
        System.out.println("Largest 5 consecutive substrings: " + LargestFiveDigitNumII("123987453937494756298999745454846"));
    }

    public static int LargestFiveDigitNum(final String digits) {
        // how to get all the five digit substrings
        int largest = Integer.MIN_VALUE;

        for (int index = 0; index < digits.length() - 4; index++) {
            int number = Integer.parseInt(digits.substring(index, index + 5));
            largest = Math.max(number, largest);
        }

        return largest;
    }

    public static int LargestFiveDigitNumI(final String digits) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int index = 0; index < digits.length() - 4; index++) {
            list.add(Integer.parseInt(digits.substring(index, index + 5)));
        }

        return Collections.max(list);
    }

    public static int LargestFiveDigitNumII(final String digits) {
        return IntStream.range(0, digits.length() - 4)
                .mapToObj(i -> digits.substring(i, i + 5))
                .mapToInt(Integer::parseInt)
                .max()
                .orElse(0);
    }
}
