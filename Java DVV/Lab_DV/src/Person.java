import java.util.Calendar;
import java.util.Scanner;
public class Person {

    private static String name;
    private static int birthYear = 2001;


     static void age(int birthYear ){
         Calendar now = Calendar.getInstance();
         int year = now.get(Calendar.YEAR);
         year = year - birthYear;
         System.out.print("Age: " + year);
    }

    static void input(){
        Scanner in = new Scanner(System.in);
        System.out.print("\nInput name: ");
        name = in.nextLine();
    }

    static void output(String name){
        System.out.print("Name User: " + name);
    }

    static void changeName(){
        Scanner in = new Scanner(System.in);
        System.out.print("\nRename user: ");
        name = in.nextLine();
    }

    public static void main(String[] args) {
         age(birthYear);
         input();
         output(name);
         changeName();
         output(name);
    }
}
