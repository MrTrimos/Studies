import java.util.Scanner;
import java.util.regex.*;

public class laba5 {

    public static void main(String[] args){

        int iteration = 1;
        String[] regex = new String[]{"(\\d+\\.\\d\\d) USD",
                "(\\d+\\.\\d\\d) EUR",
                "(\\d+\\.\\d\\d) HRN"};

        for (String i: regex) {
            Pattern pattern = Pattern.compile(i);

            String stringToBeMatched = "Potato: 2.75 USD" +
                    "Mid: 22.00 EUR" +
                    "Grilled chicken: 6.50 HRN" +
                    "Lime: 0.002 USD";

            Matcher matcher = pattern.matcher(stringToBeMatched);

//            if(i == regex[1]){ System.out.println("safs");continue;}

            while (matcher.find()){
                System.out.println( iteration + ": " + matcher.group());
                iteration++;
            }
        }
    }
}
