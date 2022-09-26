package hackerrank;

import java.io.*;
import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    // Write your code here
    // 1 Odd/Even
    // 2 Prime
    // 3 Palindrome
    PerformOperation isOdd() {
        PerformOperation operation = (int a) -> a % 2 == 0 ? false : true;
        return operation;
    };

    PerformOperation isPrime() { // true is prime, false
        PerformOperation operation = (int a) ->  {
            if(a <= 1) {
                return false;
            }

            for (int index = 2; index < a; index++)
                if (a % index == 0)
                    return false;

            return true;
        };

        return operation;
    }

    // number that is the same with digits reversed
    PerformOperation isPalindrome() {
        PerformOperation operation = (int a) -> {
            String numberString = Integer.toString(a);
            StringBuilder stringBuilder = new StringBuilder(numberString).reverse();
            if(numberString.equals(stringBuilder.toString())){
                return true;
            } else {
                return false;
            }
        };

        return operation;
    }
}

public class LambdaExpressions {

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T--> 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}
