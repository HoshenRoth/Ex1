package assignments.ex1;
import java.util.Scanner;
/**
 * Intro2CS, Ex1 - very basic "main template"
 * Make sure your implementation of this main performs as the Ex1Sol.jar solution implement all needed functions.
 *
 */
public class Ex1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = "", num2="", quit = "quit";
        while (!num1.equals(quit) && !num2.equals(quit)) {
            System.out.println();
            System.out.println("Ex1 class solution:");
            System.out.println("Enter a string as number#1 (or \"quit\" to end the program): ");
            num1 = sc.next();
            if (!num1.equals("quit")) {
                System.out.println("Enter a string as number#2 (or \"quit\" to end the program): ");
                num2= sc.next();
                if(!num2.equals(quit)){
                    if (assignments.ex1.Ex1.isNumber(num1) && assignments.ex1.Ex1.isNumber(num2)){
                        System.out.println("Number#1 in base representation: " + assignments.ex1.Ex1.int2Number(assignments.ex1.Ex1.number2Int(num1),10));
                        System.out.println("Number#2 in base representation: " + assignments.ex1.Ex1.int2Number(assignments.ex1.Ex1.number2Int(num2),10));
                        int decimal1= assignments.ex1.Ex1.number2Int(num1);
                        int decimal2= assignments.ex1.Ex1.number2Int(num2);
                        System.out.println("The nunber#1: " + decimal1 + "is decimal");
                        System.out.println("The nunber#2: " + decimal2 + "is decimal");
                        if (assignments.ex1.Ex1.equals(num1, num2))
                            System.out.println("The two numbers: " + num1 + ", " + num2 + "are equal");
                        else
                            System.out.println("The two numbers: " + num1 + ", " + num2 + "are not equal");
                        String[] arr= {num1, num2};
                        int maxIndex= assignments.ex1.Ex1.maxIndex(arr);
                        System.out.println("The index: " + maxIndex + "is the number with the maximum value");
                    }
                    else
                        System.out.println("One or two of the received numbers are invalid");
                }

                /////////////////////
            }
        }
        System.out.println("quiting now...");
    }
}
