package hackerrank;

import java.util.*;

public class EnoughIsEnough {

    public static void main(String[] args) {
        System.out.println("Delete Nth - Code Wars.");

        System.out.println("Input: int[]{1,1,1,3,4,5,1,1,2,7,8,9,11,11,11,11,11,2}, \nMax: 3");
        int[] result = deleteNth(new int[]{1, 2, 3, 4, 1, 1, 1, 3, 5, 6, 7, 9, 9, 9, 9, 9, 1, 2, 3, 56, 57, 87}, 3);
        System.out.println("Output for new int[]{1,2,3,4,1,1,1,3,5,6,7,9,9,9,9,9,1,2,3,56,57,87}, 3");
        String output = Arrays.toString(result);
        System.out.println("Result: " + output);
//        System.out.println("Output: " + deleteNth(
//                new int[]{1, 1, 1, 3, 4, 5, 1, 1, 2, 7, 8, 9, 11, 11, 11, 11, 11, 2},
//                3
//        ));
    }

    public static int[] deleteNthI(int[] elements, int maxOccurrences) {

        HashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

        // loop through each of the 'elements' array
        for (int index = 0; index < elements.length; index++) {
            // and for each entry, count the number of occurrences
            int totalOccurrences = 0;
            for (int element : elements) {
                if (elements[index] == element) {
                    totalOccurrences++;
                }
            }

            map.put(elements[index], totalOccurrences);
        }

        Integer[] keys = new Integer[map.size()];
        Integer[] values = new Integer[map.size()];

        int i = 0;

        try {
            for (Map.Entry mapElement : map.entrySet()) {
                Integer elementItself = (Integer) mapElement.getKey();
                // the key is the element itself, the value is the number of occurrences
                int numOccurrences = ((int) mapElement.getValue());

                if (numOccurrences > maxOccurrences) {
                    // remove it and repeat
                    map.remove(elementItself);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // get all the elements - the entry set
        int[] entries = new int[map.size()];
        int index = 0;
        for (Map.Entry<Integer, Integer> mapElement : map.entrySet()) {
            entries[index] = mapElement.getValue();
        }

        return entries;
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        if (elements.length == 0 || maxOccurrences == 0) {
            return new int[0];
        }

        final List<Integer> elemList = new ArrayList<>(elements.length);
        final ArrayList<Integer> filteredElements = new ArrayList<>();

        // get an arraylist of all the elements - elemList
        for (int e : elements) {
            elemList.add(e);
        }

        // for every element in elements array
        for (int e : elements) {
            if (filteredElements.contains(e)) { // if filteredElements contains the element
                final int currentCount = Collections.frequency(filteredElements, e); // get frequency

                // if frequency allows, add the element to filtered elements
                if (currentCount < maxOccurrences) {
                    filteredElements.add(e);
                }
            } else { // what is this code doing?
               // filteredElements.add(e);
            }
        }

        // create an array of primitive ints to hold our result - size of filteredElements
        int[] result = new int[filteredElements.size()];

        // transfer filteredElements contents to the result array of primitive ints
        for (int i = 0; i < filteredElements.size(); i++) {
            result[i] = filteredElements.get(i);
        }

        // return result array of primitive integer values
        return result;
    }
}

/*
 // now iterate through the map
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();

        Iterator<Map.Entry<Integer, Integer>> iterator = entrySet.iterator();

        int i =0;
        int index = 1;
        int value = 0;

        while(iterator.hasNext()) {
            if(index - 1 == i) {
                value = iterator.next().getValue();
                break;
            }
            iterator.next();
            i++;
        }
        System.out.println("Value at index: " + index + " : " + value);
    }
 */