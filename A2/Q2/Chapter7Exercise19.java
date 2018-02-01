// Alexandra Montgomery
// Assignment 2 -  Chapter 7 Exercise 19 

import java.util.Scanner;

public class Chapter7Exercise19 {

    static int size = 100;   // setting size to 100, will be redefined later

    public static void main(String[] args) {   // main


        Scanner input = new Scanner(System.in);  
        System.out.println("First number is size of list...");  // printing first number is size of list
        System.out.print("Enter list: ");   // printing enter list
        size = input.nextInt();  // setting the size equal to first number given
        int[] numbers = new int[size];  // setting equal to the size given above
        for (int i = 0; i < size; i++) {  
            numbers[i] = input.nextInt();
        }
        if (isSorted(numbers)) System.out.print("The list is already sorted.\n");   // if the list is sorted is printing a response
        else System.out.print("The list is not sorted.\n");   // else printing that response

    }

    public static boolean isSorted(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {   // comparing numbers

            if (numbers[i] > numbers[i + 1]) return false;  // returning false if the first number is greater than the second

        }
        return true;   
    }
    
    public static void printArray(int[] array, int numberPerLine) {  // method for printing the results

                for (int i = 0; i < array.length; i++) {  

                    System.out.printf("%4d ", array[i]);
                    if ((i + 1) % numberPerLine == 0) System.out.println("");
                }
    }
}