package refresh;

import java.util.*;
import java.io.*;

public class Refresh {

    /**
     * Prints "Hello World!" to the console
     */
    public static void exercise1() {
        System.out.println("Hello World!");
    }

    /**
     * Print the square root of 23 to the console
     */
    public static void exercise2() {
        System.out.println(Math.sqrt(23));
    }

    /**
     * Print numbers 1 through 10 with a loop, 
     * each on its own line to the console.
     */
    public static void exercise3() {
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    /**
     * Calculate the sum of the numbers 1 through 95 
     * with a loop, and print the number to the console,
     * followed by a carriage return.
     */
    public static void exercise4() {
        int sum = 0;
        for(int i = 1; i <= 95; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    /**
     * Prints the sum of two double parameters to the console,
     * followed by a carriage return.
     *
     * @param x first double parameter
     * @param y first double parameter
     */
    public static void exercise5(double x, double y) {
        System.out.println(x+y);
    }

    /**
     * Returns the sum of two double parameters.
     *
     * @param x first double parameter
     * @param y first double parameter
     * @return sum of x and y
     */
    public static double exercise6(double x, double y) {
        return x+y; 
    }

    /**
     * Use nested loops to print a 10 by 10 
     * square of asterisks
     */
    public static void exercise7() {
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Prints a rectangle of asterisks with size determined by parameters
     *
     * @param width number of columns worth of asterisks to print
     * @param height number of rows worth of asterisks to print
     */
    public static void exercise8(int width, int height) {
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }    

    /**
     * Define a class that represents a Rectangle in terms of
     * width and height. You probably have never seen a static
     * class defined inside of another class before, so this may
     * look a bit unusual, but the components inside of the class
     * should be defined the same way as if you were defining them
     * inside of a standalone file named Rectangle.java. Here are
     * more detailed requirements:
     *
     * - A constructor that takes width and height to initialize the Rectangle
     * - A method getWidth() that returns the width
     * - A method getHeight() that returns the height
     * - A method getArea() that returns the area
     */
    public static class Rectangle { // exercise9
        private double width, height;

        public Rectangle(double w, double h) {
            width = w;
            height = h;
        }

        public double getWidth() { return width; }
        public double getHeight() { return height; }
        public double getArea() { return width*height; }
    }    

    /**
     * Compute the sum of the elements in the array and print the sum
     * to the console.
     *
     * @param arr array of integers
     */
    public static void exercise10(int[] arr) {
        int sum = 0;
        for(int x : arr) {
            sum += x;
        }
        System.out.println(sum);
    }

    /**
     * Prints all letters of the String vertically,
     * with one letter per line to the console.
     *
     * @param str String to print vertically
     */
    public static void exercise11(String str) {
        for(int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    /**
     * Use a Scanner to read two integers typed by the user 
     * to the console (and pressing enter after each) and 
     * print out the result of multiplying them.
     */
    public static void exercise12() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(a*b);
        scan.close();
    }

    /**
     * Compute the sum of all elements in the list and return it
     *
     * @param list List of integers
     * @return sum of elements in the list
     */
    public static int exercise13(ArrayList<Integer> list) {
        int sum = 0;
        for(int x : list) {
            sum += x;
        }
        return sum;
    }

    /**
     * Recursive function that computes the factorial of n.
     * The factorial of 0 is 1, and the factorial of any
     * larger number n is n multiplied by the factorial of (n-1)
     *
     * @param n value to compute factorial of
     * @return factorial of n
     */
    public static int exercise14(int n) {
        if(n == 0) return 1;
        else return n * exercise14(n - 1);
    }

    
    /**
     * Loop through array and print all even numbers,
     * each on their own line to the console.
     *
     * @param array array of integers
     */
    public static void exercise15(int[] array) {
        for(int x : array) {
            if(x % 2 ==0) System.out.println(x);
        }
    }

    /**
     * Loop through array and print all Strings with even length,
     * each on their own line to the console.
     *
     * @param strings array of Strings
     */
    public static void exercise16(String[] strings) {
        for(String s : strings) {
            if(s.length() % 2 == 0) {
                System.out.println(s);
            }
        }
    }

    /**
     * Create and return an ArrayList of Strings that contains
     * all elements from the String array that have odd length,
     * stored in the same order.
     *
     * @param strings array of Strings
     */
    public static ArrayList<String> exercise17(String[] strings) {
        ArrayList<String> result = new ArrayList<>();
        for(String s : strings) {
            if(s.length() % 2 == 1)
                result.add(s);
        }
        return result;
    }

    /**
     * Print the contents of a text file to the console line by line
     *
     * @param fileName Full name of a file stored in the working directory of the project
     */
    public static void exercise18(String fileName) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(fileName));
        while(scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
        scan.close();
    }

    /**
     * Compute and return the maximum element of a non-empty array of doubles.
     *
     * @param numbers Array of doubles with at least one value
     * @return maximum element of the input array
     */
    public static double exercise19(double[] numbers) {
        double max = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
            max = Math.max(max,numbers[i]);
        }
        return max;
    }

    /**
     * Compute and return the minimum element of a non-empty 
     * ArrayList of Integers.
     *
     * @param numbers ArrayList of Integers with at least one value
     * @return minimum element of the input list
     */
    public static int exercise20(ArrayList<Integer> numbers) {
        int min = numbers.get(0);
        for(int i = 1; i < numbers.size(); i++) {
            min = Math.min(min,numbers.get(i));
        }
        return min;
    }

    /**
     * Save the word "TEST" to a new text file named "output.txt"
     */
    public static void exercise21() throws FileNotFoundException {
        PrintStream ps = new PrintStream(new File("output.txt"));
        ps.println("TEST");
        ps.close();
    }
}
