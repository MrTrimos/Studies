import java.util.Calendar;
import java.util.Scanner;

public class Laba2 {

    static void mouths(){
        int month;
        Scanner in = new Scanner(System.in);
        System.out.print("\nInput mouth: ");
        month = Integer.parseInt(in.nextLine());

        int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.print("Age: " + monthArray[month]);
    }

    static void sumNumber(){

        int iteration = 10;

        int[] number = new int[iteration + 1];
        Scanner in = new Scanner(System.in);
        System.out.print("\nInput number: ");
        for(int i = 0; i < iteration; i++){
            System.out.print( "\nElem of 10: ");
            number[i] = Integer.parseInt(in.nextLine());
        }

        int gran = 0;
        boolean resh = true;
        int rethult;
        for (int i = 0; i < iteration; i++) {
            if (number[i] > 0 && gran > 5) {
                gran++;
            } else if(number[i] < 0){
                resh = false;
            }
        }

        if (resh == true){
            rethult = number[0] + number[1] + number[2] + number[3] + number[4];
        } else {
            rethult = number[5] + number[6] + number[7] + number[8] + number[9];
        }

        System.out.print("\nAdd: " + rethult);
    }

    static void searchNumber(){
        // cin 5 number
        int iteration = 5;

        int[] searchNumbers = new int[iteration + 1];
        Scanner in = new Scanner(System.in);
        System.out.print("\nInput number: ");
        for(int i = 0; i < iteration; i++){
            System.out.print( "\nElem of 5: ");
            searchNumbers[i] = Integer.parseInt(in.nextLine());
        }

        // Position of second positive number
        boolean secondNumber = true;
        for(int i = 1; i < iteration; i++){
            if(searchNumbers[i] > 0 && secondNumber){
                System.out.print("\n Second positive number: " + searchNumbers[i]);
                secondNumber = false;
                break;
            }
            else if  (!secondNumber) {
                System.out.print("\n Not second positive number");
            }
        }

        //Minimum and its position in the array
        int min = searchNumbers[0], indexNumber = 0;
        for (int i = 0; i < searchNumbers.length - 1; i++){
            if(searchNumbers[i] < min){
                min = searchNumbers[i];
                indexNumber = i;
            }
        }
        System.out.print("\n Min number index:" + indexNumber);
        System.out.print("\n Min number:" + min);
    }

    static void coutNumber(){
        int[] numbers = new int[99];
        int num = 0;
        int iteration = 0;
        int result = 0;

        boolean stop = true;
        Scanner in = new Scanner(System.in);
        System.out.print("\nInput number: ");

        while(stop){
            System.out.print( "\nElem: ");
            num = Integer.parseInt(in.nextLine());

            if(num < 0){
                System.out.print( "\nStop");
                break;
            }   else {
                numbers[iteration] = num;
            }
            iteration++;
        }

        for (int i = 0; i < numbers.length - 2; i++) {
            result += numbers[i];
        }
        System.out.print( "\nResult: " + result);
    }

    static class Car{
        String name;
        int year;
        float engineCapacity;

        Car(String name, int year, float engineCapacity){
            this.name = name;
            this.year = year;
            this.engineCapacity = engineCapacity;
        }

        void displayInto(){
            System.out.println("Name: "+ name + "\tYear: "+ year + "\tEngine Capacity: " + engineCapacity);
        }
    }

    public static void main(String[] args) {

        while (true) {

            int programSearch = 0;
            Scanner in = new Scanner(System.in);
            System.out.print("\nNumber tasks: ");
            programSearch  = Integer.parseInt(in.nextLine());

            switch (programSearch) {
                case (1):
                    mouths();
                    break;
                case (2):
                    sumNumber();
                    break;
                case (3):
                    searchNumber();
                    break;
                case (4):
                    coutNumber();
                    break;
                case (5):
                    Car BMW_I3 = new Car("BMW_I3 ",2000,4.5f);
                    BMW_I3.displayInto();

                    Car Audi_A4 = new Car("Audi_A4",2020,6.5f);
                    Audi_A4.displayInto();

                    Car Audi_ETron = new Car("Audi_ETron",2022,4.1f);
                    Audi_ETron.displayInto();

                    Car taycanTurbo = new Car("taycanTurbo",2020,4.5f);
                    taycanTurbo.displayInto();
                    break;
                default:
                    System.out.print("\nNothing selected: ");
                    break;
            }
        }

    }
}
