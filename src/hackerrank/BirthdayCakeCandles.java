package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class BirthdayCakeCandles {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        Integer[] candlesArray = candles.toArray(new Integer[candles.size()]);
        Arrays.sort(candlesArray);

        // The array is sorted so we can just grab the last element and know
        // that it is the max.
        // All that remains is to count how many of that max value are
        // present in the array.
        int size = candlesArray.length;
        int max = candlesArray[size - 1];

        int counter = 0;
        for(Integer candle : candlesArray) {
            if(candle == max) {
                counter++;
            }
        }

        //System.out.println(counter);
        return counter;

    }

}


// SET MAX to array[0]
// FOR i = 1 to array length - 1
//   IF array[i] > MAX THEN
//     SET MAX to array[i]
//   ENDIF
// ENDFOR

// ALTERNATIVELY:
//    int n = in.nextInt();
//    int max = 0;
//    int sum = 0;
//    int num;
//        for(int i =0; i < n; i++){
//        num = in.nextInt();
//        if(num > max){
//        sum = 1;
//        max = num;
//        }else if(num == max){
//        sum++;
//        }
//        }
//        System.out.println(sum);

