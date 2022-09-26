package hackerrank;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.Long.parseLong;

public class StringIncrementer {

    public static void main(String[] args) {
        String result = incrementStringI("16000000000000000003391");
        System.out.println(result);
    }

    public static String incrementString(String str) {
     //   matches("^.*\\d$"))
        String stringUpToFirstZero;
        int indexOfZero = str.indexOf("0");
        if(indexOfZero != -1) {
            stringUpToFirstZero = str.substring(0, indexOfZero);
        } else { // use index of first digit
            stringUpToFirstZero = "";
        }

        List<Character> digitsList = new ArrayList<Character>();
        int zeroCount = 0;
        if(str.matches("^.*\\d$")) { // string ends with a digit
            System.out.println("String ends with a digit");

            // extract the number and increment it
            int index = str.length() - 1;

            // count the leading zeroes 'while' we are at it

            while(Character.isDigit(str.charAt(index))) { // (index-- ?)
               // starting from the end of the string, test if digit
               // and if it is a digit, add it to digitsList
                if(str.charAt(index) == '0') {
                    zeroCount++;
                    System.out.println("Zero Count: " + zeroCount);
                }
                digitsList.add(str.charAt(index));
                System.out.println("Added: " + str.charAt(index));

                if(index < 1) {
                    break;
                }
                index--;
            }
        }

        //

        String digitsString = new String();
        Collections.reverse(digitsList);
        for(Character c : digitsList) {
            digitsString = digitsString + c;
        }
        System.out.println("Digits String: " + digitsString);

        // cast digitsString to integer and add 1
        int numberToIncrement = Integer.parseInt(digitsString) + 1;
        System.out.println("number incremented: " + numberToIncrement);
        // so now we need to add back the zeroes
        StringBuilder zeroPadding = new StringBuilder();
        for(int i = 0; i < zeroCount; i++) {
            zeroPadding.append("0");
        }

        String zeroPaddingString = zeroPadding.toString();
        String numberIncrementedString = Integer.toString(numberToIncrement);
        String numericSuffix = zeroPaddingString + numberIncrementedString;

        System.out.println("numeric suffix: " + numericSuffix +
                "\nstring up to zero: " + stringUpToFirstZero);

        System.out.println("Result: " + stringUpToFirstZero + numericSuffix);
        return zeroPadding + str;
    }

    // TODO:  My initial intuition to work backwards from the end of the string
    // may have been correct after all.

    public static String incrementStringI(String str) {
        NumberFormat nf = NumberFormat.getInstance();
        StringBuilder number = new StringBuilder();
        StringBuilder chars = new StringBuilder();
        StringBuilder zeroes = new StringBuilder();

        for (int index = 0; index < str.length(); index++) {
            if(Character.isDigit(str.charAt(index))) {
                number.append(str.charAt(index)); // get the numbers
            } else {
                chars.append(str.charAt(index)); // get the characters
            }


        }
        // if there is no numeric suffix to begin with
        if(number.length() == 0) return str + "1"; // append a 1 to the string
        nf.setMinimumIntegerDigits(number.length()); // solves zeroes padding issue
        nf.setGroupingUsed(false);


        try {
            return chars.append(nf.format(
                    Long.parseLong(number.toString()) + 1)).toString();
        } catch(NumberFormatException e) {
            e.printStackTrace();
            return null;
        }



    }

    public static String incrementStringIV(String str) {
        System.out.println(str);
        NumberFormat nf = NumberFormat.getInstance();
        StringBuilder number = new StringBuilder();
        StringBuilder chars = new StringBuilder();
        StringBuilder zeroes = new StringBuilder();

        for (int index = str.length() - 1; index < 1; index--) {
            System.out.println(str.charAt(index));
            if(Character.isDigit(str.charAt(index))) {
                number.append(str.charAt(index)); // get the numbers
            } else {
                chars.append(str.charAt(index)); // get the characters
            }


        }
        // if there is no numeric suffix to begin with
        if(number.length() == 0) return str + "1"; // append a 1 to the string
        
        // if there are multiple trailing zeroes, replace the final 0 with a 1
        if(number.charAt(number.length() - 1) == 0) {
            number.insert(number.length() - 1, "1");
        }
        nf.setMinimumIntegerDigits(number.length()); // solves zeroes padding issue
        nf.setGroupingUsed(false);


        return intParsingMethod(nf, chars, number);

//             return chars.append(nf.format(
//                     Long.parseLong(number.toString()) + 1)).toString();



    }

    public static String intParsingMethod(NumberFormat nf, StringBuilder chars, StringBuilder number) throws NumberFormatException{
        chars.append(nf.format(
                Long.parseLong(number.toString()) + 1)).toString();
        return chars.toString();
    }

    public static String incrementStringIII(String str) {
        if(str.matches("^.*\\d$")){ // string ends with a digit, work backward, get number

        }
        return str;
    }
}
