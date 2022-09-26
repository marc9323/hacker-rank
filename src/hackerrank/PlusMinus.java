package hackerrank;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(-2);
        arr.add(-3);
        arr.add(0);

        plusMinus(arr);
    }

    public static void plusMinus(List<Integer> arr) {
        // 1.  how many elements are there in the array?
        int numberOfElements = arr.size();

        int numberOfPositiveElements = 0;
        int numberOfNegativeElements = 0;
        int numberOfZeroElements = 0;

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(6);

        for(Integer element : arr) {
            if(element == 0) {
                numberOfZeroElements++;
            }
            if(element > 0) {
                numberOfPositiveElements++;
            }
            if(element < 0) {
                numberOfNegativeElements++;
            }
        }

        double proportionPositive = (double)numberOfPositiveElements / numberOfElements;
        double proportionNegative = (double)numberOfNegativeElements / numberOfElements;
        double proportionZero = (double)numberOfZeroElements / numberOfElements;

//        System.out.println(numberOfPositiveElements / numberOfElements);
//        System.out.println((3/6));
//        System.out.println(proportionPositive);
        System.out.println(df.format(proportionPositive));
        System.out.println(df.format(proportionNegative));
        System.out.println(df.format(proportionZero));

    }
}
