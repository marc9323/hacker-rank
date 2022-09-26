package hackerrank;// TODO:  http://mohandess.ir/array-diff/  multiple solutions listed here

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ArrayDiff {

    public static void main(String[] args) {
        int[] tempArray = arrayDiff(new int[]{1, 2}, new int[]{1});
        int[] secondTest = arrayDiff(new int[]{1, 2, 2}, new int[]{1});

        System.out.println(Arrays.toString(tempArray));
        System.out.println(Arrays.toString(secondTest));

//        System.out.println("");
//
//        for (int num : secondTest) {
//            System.out.println(num + " , ");
//        }
    }

//    public static int[] arrayDiff(int[] a, int[] b) {
//        // for every value present in b, remove that value from a
//       // List<Integer> tempList = new ArrayList<Integer>();
//        for (int index = 0; index < a.length; index++) {
//            for(int j = 0; j < b.length; j++) {
//                // if b value is present in a
//                if(a[index] == b[j]) {
//                    // remove from a - remove element at this index
//                    a = removeTheElement(a, index);
//                    System.out.println(Arrays.toString(a));
//                }
//            }
//
//        }
//        System.out.println("Length of b: " + b.length);
//        System.out.println("Length of a: " + a.length);
//        return a;
//    }


    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> list = new ArrayList<>();
        loop:
        for (int num : a) {
            for (int i : b) if (num == i) continue loop;
            list.add(num);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}


//    public static int[] removeTheElement(int[] arr, int index) {
//        // if the array is empty or the index is not in range
//        // return original array
//        if(arr == null || index < 0 || index >= arr.length) {
//            return arr;
//        }
//
//        // create another array of size one less
//        int[] anotherArray = new int[arr.length - 1];
//
//        // copy the elements except the index from the original array
//        // to the other array
//        for(int i = 0, k = 0; i < arr.length; i++) {
//            // if the index is the removal element index
//            if(i == index) {
//                continue;
//            }
//
//            // if the index is not the removal element index
//            anotherArray[k++] = arr[i];
//        }
//
//        // return the resultant array
//        return anotherArray;
//    }
//}


/*
 boolean test = Arrays.asList(b).contains(a[index]);
            // now just remove from a
            if(!test) { // b does not contain
                tempList.add(a[index]);
            }

             System.out.println("Contents of tempList: ");
        for(Integer primitive : tempList) {
            System.out.println(primitive);
        }

        int[] primitive = tempList.stream()
                .mapToInt(Integer::intValue)
                .toArray();

 */