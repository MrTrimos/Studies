import java.util.HashSet;
import java.util.*;

public class main {

    public static Random random = new Random();

    public static int iteratin = 5;
    public static int min = 1;
    public static int max = 20;
    public static int diff = max - min;

    public static HashSet<Integer> Array_one = new HashSet<Integer>();
    public static HashSet<Integer> Array_two = new HashSet<Integer>();
    public static HashSet<Integer> AddTwoArray = new HashSet<Integer>();

    public static HashSet<Integer> IntersectionsTwoArray = new HashSet<Integer>();

    public static void Array1(){
        for(int i = 0; i <= iteratin; i++) {
            Array_one.add(random.nextInt(diff + 1) + min);
        }
    }

    public static void Array2(){
        for(int i = 0; i <= iteratin; i++) {
            Array_two.add(random.nextInt(diff + 1) + min);
        }
    }

    public static void AddArray(){
        AddTwoArray.addAll(Array_one);
        AddTwoArray.addAll(Array_two);
    }

    public static void IntersectionsArray(){
        IntersectionsTwoArray.addAll(Array_one);
        IntersectionsTwoArray.retainAll(Array_two);
    }

    public static void Cout(){
        //Array1
        System.out.println("Array1:");
        for (int i : Array_one){
            System.out.print(i + "  ");
        }
        //Array2
        System.out.println("\n\nArray2:");
        for (int i : Array_two){
            System.out.print(i + "  ");
        }
        //AddTwoArray
        System.out.println("\n\nAddArray:");
        for (int i : AddTwoArray){
            System.out.print(i + "  ");
        }
        //Intersections
        System.out.println("\n\nIntersectionsArray on: " + IntersectionsTwoArray);
        System.out.println("\nCheck if Array1 and Array2 are even: " + Array_one.containsAll(Array_two));
    }

    public static void main(String[] args) {
        Array1();
        Array2();
        AddArray();
        IntersectionsArray();
        Cout();
    }


}
