package hackerrank;

public class CamelCaseMethod {

    public static void main(String[] args) {
        System.out.println(camelCase("fuck"));
    }

    public static String camelCase(String str) {
        // your code here
        String[] words = str.split("[\\W_]+");
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            if(i == 0) {
                word = word.isEmpty() ? word : word.toLowerCase();
            } else {
                word = word.isEmpty() ? word :
                                Character.toUpperCase(word.charAt(0)) +
                                        word.substring(1).toLowerCase();
            }
            builder.append(word);
        }
        return builder.toString();
    }

    public static String capitalize(String str) {
        if(str == null || str.isEmpty()) {
            return str;
        }

        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

}
