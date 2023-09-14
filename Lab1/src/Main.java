import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static boolean checkvowels(String word) {
        /**
         *  This function is used to check words.
         *  If count of vowels = count of consonants in it.
         **/
        int count_vowels = 0;
        int count_consonants = 0;
        String word_lower = word.toLowerCase();
        for (char letter : word_lower.toCharArray()) {
            if ("aeiouy".contains(String.valueOf(letter))) {
                count_vowels++;
            } else {
                count_consonants++;
            }
        }
        return count_vowels == count_consonants;

    }

    public static boolean checklatin(String word) {
        /**
         *  This function is used to check words .
         *  If word consists of only latin characters.
         **/
        return word.matches("^[a-zA-Z]+$");
    }

    public static void main(String[] args) {
        /**
         *  This is main function of my program
         *  There are console inputs/outputs and calls for other functions.
         **/
        Scanner input = new Scanner(System.in, "Cp1251");
        String[] str;
        ArrayList<String> result = new ArrayList<>();
        StringBuilder finals = new StringBuilder();


        System.out.println("Введіть строку.");
        str = input.nextLine().split("[\"'/,.:;\\s]+");


        for (String word : str) {
            if (checklatin(word) && checkvowels(word)) {
                result.add(word);
                finals.append(word).append(" ");
            }
        }


        System.out.println(result);
        System.out.println(finals);
    }
}