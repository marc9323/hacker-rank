package hackerrank;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


// TODO:  This code passes on HackerRank but not here...  java 8 and java 11 fail...
public class BubbleSort {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        // Write your code here
        int[] primitives = a.stream()
                .mapToInt(Integer::intValue)
                .toArray();



        bufferedReader.close();

        bubbleSort(n, primitives);
    }

    public static void bubbleSort(int n, int[] arr) {
        int numberOfSwaps = 0;
        for(int i = 0; i < n; i++) {

            for(int j = 0; j < n - 1; j++) {
                // swap adjacent elements if they are in decreasing order
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j]; // greater
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    numberOfSwaps++;
                }
            }

            // if no elements were swapped during a traversal, array sorted
            if(numberOfSwaps == 0) {
                break;
            }
        }

        // output number of swaps, first element, and last element
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[n - 1]);

    }
}