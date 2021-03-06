import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Laba3 {

    static void line(){

        // Input
        String lineText = null;
        Scanner in = new Scanner(System.in);
        System.out.print("\nInput text: ");
        lineText = in.nextLine();

        //Longest word
        String[] words = lineText.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        //Display the longest word in a sentence and Determine the number of its letters
        int max = 0;
        String maxLengthWord = null;
        for(int i = 0; i < words.length; i++){

            if(words[i].length() > max){
                max = words[i].length();
                maxLengthWord = words[i];
            }
        }
        System.out.println("\nMax length word: " + maxLengthWord + ";\tlength: " + max);

        //Put the second word in reverse order
        String reverseWord = new String();
        char[] wordTwo = words[1].toCharArray();

        for(int i = wordTwo.length -1; i >= 0; i--){
            reverseWord += wordTwo[i];

        }
        System.out.println("Reverse Second Word: " + reverseWord);
    }

    static void twoSpaces(){

        // Input
        String lineText = null;
        Scanner in = new Scanner(System.in);
        System.out.print("\nInput text: ");
        lineText = in.nextLine();

        //Convert all spaces, consecutive, one
        lineText = lineText.replaceAll("\\s+"," ");
        System.out.print("\nSuggestion without spaces: " + lineText);
    }

    static void currencyUS(){
        // Input
        int iteration = 1;
        String lineText = null;
        Scanner in = new Scanner(System.in);
        System.out.print("\nInput several or one US currency: ");
        lineText = in.nextLine();


        Pattern pattern = Pattern.compile("(\\$\\d+\\.\\d\\d)");

        String stringToBeMatched = lineText;

        Matcher matcher = pattern.matcher(stringToBeMatched);

        while (matcher.find()){
            System.out.println( iteration + ": " + matcher.group());
            iteration++;
        }

    }


    public static void main(String[] args) {

        while (true) {

            int programSearch = 0;
            Scanner in = new Scanner(System.in);
            System.out.print("\nNumber tasks: ");
            programSearch = Integer.parseInt(in.nextLine());

            switch (programSearch) {
                case (1):
                    line();
                    break;
                case (2):
                    twoSpaces();
                    break;
                case (3):
                    currencyUS();
                    break;
                default:
                    System.out.print("\nNothing selected: ");
                    break;
            }
        }
    }

}
