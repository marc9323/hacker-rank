package hackerrank;

import java.util.Scanner;

public class Staircasse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        staircase(scanner.nextInt());
    }

    public static void staircase(int n) {
        // Write your code here
        for (int row = 0; row < n; row++) {
            for(int col = 0; col < n; col++) {
                if(col < n - row - 1) { // gives us number of spaces to print
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }

            }
            System.out.println();

        }

    }
}
