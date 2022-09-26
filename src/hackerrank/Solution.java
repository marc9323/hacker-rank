package hackerrank;

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

class MixingProteins {

    /*
     * Complete the 'pmix' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */
    public static String codeForInterval(String s, int k) {
        String result = "";
        for(int interval = 0; interval <= k; interval++) {
            result = pmix(s, k);
        }
        System.out.println(result);
        return result;
    }

    public static String pmix(String s, int k) {
//        if(k <= 0) {
//            return;
//        }

        String result = "";
        char[][] valueTable = new char[4][4];

        valueTable[0][0] = 'A';
        valueTable[0][1] = 'B';
        valueTable[0][2] = 'C';
        valueTable[0][3] = 'D';

        valueTable[1][0] = 'B';
        valueTable[1][1] = 'A';
        valueTable[1][2] = 'D';
        valueTable[1][3] = 'C';

        valueTable[2][0] = 'C';
        valueTable[2][1] = 'D';
        valueTable[2][2] = 'A';
        valueTable[2][3] = 'B';

        valueTable[3][0] = 'D';
        valueTable[3][1] = 'C';
        valueTable[3][2] = 'B';
        valueTable[3][3] = 'A';

        // lookup table for indexing into valueTable
        Map<Character, Integer> lookUp = new HashMap<Character, Integer>();
        lookUp.put('A', 0);
        lookUp.put('B', 1);
        lookUp.put('C', 2);
        lookUp.put('D', 3);

        // Write your code here
        int length = s.length();
        System.out.println("Protein Input: " + s);
        System.out.println("Protein Input Length: " + s.length());
        System.out.println("Number of Seconds to iterate: " + k);

        char[] proteins = s.toCharArray();
        char current, next;

        for(int index = 0; index < length; index++) {
            // get the current element and the very next element
            if(index == (length - 1)) { // if we are at end of array
                current = proteins[index];
                next = proteins[0];
            } else {
                current = proteins[index];
                next = proteins[index + 1];
            }

            System.out.println("Current: " + current);
            System.out.println("Next: " + next);

            System.out.println("Current Lookup Value: " + lookUp.get(current));
            Integer lookupCurrent = lookUp.get(current);
            Integer lookupNext = lookUp.get(next);

            Character newValue = valueTable[lookupCurrent][lookupNext];

            result += newValue;

        }

        System.out.println(result);
        --k;

        if(k < 0) return result;

        if(k == 0) return result;
        return pmix(result, k);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int n = Integer.parseInt(firstMultipleInput[0]);
//
//        int k = Integer.parseInt(firstMultipleInput[1]);
//
//        String s = bufferedReader.readLine();

       // String result = MixingProteins.pmix(s, k);
        // N = length, K = number of seconds

        String result = MixingProteins.pmix("AAAAD", 15);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
