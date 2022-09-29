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

class MiniMaxSumI {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    // minimum and maximum from summing four
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        // just sort, sum, subtract least/greatest, output result

        int n=arr.size();
        long[] myList = new long[n];
        // just put them all in an array, make it long to prevent overflow from large
        for(int i=0;i<n;i++){
            myList[i] = (long)arr.get(i);
        }

        // sort the list of longs
        // for(int p=0;p<=n-1;p++){
        //     for(int q=p+1;q<=n-1;q++){
        //         long temp=0;
        //         if(myList[p]>myList[q]){
        //             temp=myList[p];
        //             myList[p]=myList[q];
        //             myList[q]=temp;
        //         }
        //     }
        // }

        Arrays.sort(myList);

        long sum=0;
        for(int i=0;i<=n-1;i++){
            sum+=myList[i];
        }

        // the list is sorted in numerical value... ascending... 1, 2, 3, etc...
        // System.out.println("Sum: " + sum + " , myList[0]: " + myList[0]);
        long max = sum - myList[0]; // the total of all elements summed minus the first(least)
        // System.out.println("Sum: " + sum + " , myList[n-1]: " + myList[n - 1]);
        long min = sum - myList[n-1]; // total of all elements summed minus the greatest, last

        System.out.println(min + " " + max);
    }



}

public class MiniMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        MiniMaxSumI.miniMaxSum(arr);

        bufferedReader.close();
    }
}
