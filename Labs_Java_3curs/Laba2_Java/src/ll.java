//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class Laba2 {
//    public static void main(String[] args){
//        int n = 0;
//
//    }
//}

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.Random;

public class ll {
    private static final int LENGTH = 6;
    private static final double MIN_RANGE = -2.0;
    private static final double MAX_RANGE = 2.0;

    public static void main(String[] args) {
        Point3D[] array = fillRandomArrayPoint(LENGTH, MIN_RANGE, MAX_RANGE);
        System.out.println("Массив точек: " + Arrays.toString(array) + "\n");

        if (LENGTH >= 3) {
            double maxPerimeter = 0;
            Triangle triangle = null;
            for (int i = 0; i < LENGTH - 2; i++) {
                for (int j = i + 1; j < LENGTH - 1; j++) {
                    for (int k = j + 1; k < LENGTH; k++) {
                        Triangle temp = new Triangle(array[i], array[j], array[k]);
                        double perimeter = temp.getPerimeter();
                        if (maxPerimeter < perimeter) {
                            //System.out.println(temp); //раскомментируй, если хочешь видеть информацию о всех треугольниках
                            maxPerimeter = perimeter;
                            triangle = temp;
                        }
                    }
                }
            }
            System.out.println("Ответ:\n" + triangle);
        } else {
            System.out.println("Ответ:\nРешения нет, т.к. точек в массиве меньше 3-х!");
        }
    }

    public static Point3D[] fillRandomArrayPoint(int length, double min, double max) {
        Point3D[] array = length > 0 ? new Point3D[length] : new Point3D[0];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                array[i] = randomPoint(min, max);
            }
        }
        return array;
    }

    public static Point3D randomPoint(double min, double max) {
        Random rand = new Random();
        double x = rand.nextDouble() * (max - min) + min;
        double y = rand.nextDouble() * (max - min) + min;
        double z = rand.nextDouble() * (max - min) + min;
        return new Point3D(x, y, z);
    }
}

class Triangle {
    Point3D a;
    Point3D b;
    Point3D c;

    public Triangle(Point3D a, Point3D b, Point3D c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double sideAB() {
        return this.a.distanceTo(this.b);
    }

    public double sideBC() {
        return this.b.distanceTo(this.c);
    }

    public double sideAC() {
        return this.a.distanceTo(this.c);
    }

    public double getPerimeter() {
        return sideAB() + sideAC() + sideBC();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Точки треугольника: ").append(String.format("%s, %s, %s;", this.a, this.b, this.c)).append("\n");
        sb.append("Длинны сторон треугольника: ").append(String.format("%.3f, %.3f, %.3f;", sideAB(), sideBC(), sideAC())).append("\n");
        sb.append("Периметр треугольника: ").append(String.format("%.3f;", getPerimeter())).append("\n");
        return sb.toString();
    }
}

class Point3D {
    private double x;
    private double y;
    private double z;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return String.format("[%.3f, %.3f, %.3f]", this.x, this.y, this.z);
    }

    public double distanceTo(Point3D point) {
        double x = Math.pow(point.getX() - this.x, 2);
        double y = Math.pow(point.getY() - this.y, 2);
        double z = Math.pow(point.getZ() - this.z, 2);
        return Math.sqrt(x + y + z);
    }
}
