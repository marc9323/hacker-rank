package hackerrank;

public class SumTwoIntegersEqualsValue {

    public static void main(String[] args) {
        System.out.println("Target: 10, Array: [5, 7, 1, 2, 8, 4, 3]: " +
                sumTwoIntegersEquals(new int[]{5, 7, 1, 2, 8, 4, 3}, 10));
    }

    public static boolean sumTwoIntegersEquals(int[] numbers, int value) {
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length; j++) {
                if (i + j == value) return true;
            }
        }
        return false;
    }
}
