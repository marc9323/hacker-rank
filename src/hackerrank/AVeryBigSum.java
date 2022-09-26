//package hacker;
//
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//class Results {
//
//    /*
//     * Complete the 'aVeryBigSum' function below.
//     *
//     * The function is expected to return a LONG_INTEGER.
//     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
//     */
//
//    public static long aVeryBigSumOne(List<Long> ar) {
//        // Write your code here
//        long[] longArray = ar.stream().mapToLong(l -> l).toArray();
//        long result = Arrays.stream(longArray).sum();
//
//        return result;
//    }
//
//}
//
//public class AVeryBigSum {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int arCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Long> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Long::parseLong)
//                .collect(toList());
//
//        long result = Result.aVeryBigSumOne(ar);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
