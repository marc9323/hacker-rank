package hackerrank;

public class DNAToRNA {

    private DNAToRNA() {}

    public static void main(String[] args) {
        System.out.println("DNA: GCATACGTACGCGT to RNA Equivalent: " + convertDNAToRNA("GCATACGTACGCGT"));

    }

    public static String convertDNAToRNA(String dna) {
        char[] dnaCharArray = dna.toCharArray();

        for(int index = 0; index < dna.length(); index++) {
            if(dnaCharArray[index] == 'T')
                dnaCharArray[index] = 'U';
        }


//        for(char character : dnaCharArray)
//            System.out.print(character);

     //   String rnaString = new String(dnaCharArray); // dnaCharArray.toString();

        return new String(dnaCharArray);
    //    return rnaString;
    }

    public static String dnaToRnaI(String dna) {
        return dna.replaceAll("T", "U");
    }

    public static String dnaToRnaII(String dna) {
        return dna.replace("T", "U");
    }


}


/*
String Methods:
replace()
replaceAll()
valueOf(array arr) returns String representation of a specific subarray of the char array argument
substring()
charAt()
compareTo(String anotherString) - compare lexicographically
compareToIgnoreCase(String str)
concat(String str)
contains(CharSequence s)
 */