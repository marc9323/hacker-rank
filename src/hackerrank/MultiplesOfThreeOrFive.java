package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class MultiplesOfThreeOrFive {

    public static void main(String[] args) {

    }

    public static int multiplesOf3or5(int n) {
        if(n <= 0) return 0;

        List<Integer> tempList = new ArrayList<Integer>();
        for(int index = 0; index < n; index++) {
            // this is not necessary - it could only ever be added once anyway!
            if(index % 3 == 0 && index % 5 == 0) {
                tempList.add(index);
            } else if(index % 3 == 0 || index % 5 ==0) {
                tempList.add(index);
            }
        }

        int accumulator = 0;
        for(Integer value : tempList) {
            accumulator += value;
        }

        return accumulator;
    }

    public static int multiplesOf3or5II(int number) {
        return IntStream.range(0, number)
                .filter(n -> (n % 3 == 0) || (n % 5 == 0))
                .sum();
    }
}
