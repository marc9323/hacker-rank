package hackerrank;
// get the maximum number of consecutive ones in a binary string

import java.util.Scanner;

public class Day10BinaryMaxOnes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine().trim());

        char[] binaryString = Integer.toBinaryString(n).toCharArray();

        int maxCount = 0;
        int tempCount = 0;

        for(int index = 0; index < binaryString.length; index++) {
            tempCount = (binaryString[index] == '1') ? tempCount + 1 : 0;
            if(tempCount > maxCount) {
                maxCount = tempCount;
                tempCount = 0;
            }
        }

        System.out.println("Max Count: " + maxCount);
    }
}
