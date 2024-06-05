package Strings;

public class StringClass {
    public static void main(String[] args) {
        String [] color = {"Black", "White", "Red", "Blue"};

        for (int i = 0; i< color.length; i++) {
            System.out.println(color[i]);
        }

        stringlength("jkerhtiueruehg");

        charNumber("oirwlkcjmejhgewtg", 'e');
    }

    // Create a method which takes 2 param(String and char)
    // Print total number of that char present in that string


    public static void charNumber (String str, char character) {
    int countchar = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character)
            countchar++;
        }
        System.out.println("Total number of character is : " + countchar);
    }




    public static void stringlength(String str) {
        System.out.println("String length is :"+ str.length());
    }
}
