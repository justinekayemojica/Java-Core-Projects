/*
*   Created by: JMOJICA 060123
*
*   Simple Calculator:
*   Command-line calculator that can perform basic arithmetic operations
*   such as addition, subtraction, multiplication, and division. The program
*   take user input for two numbers and the desired operation, and then display the
*   result.
*
 */

package SimpleCalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        int operation = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("\t\t\tSIMPLE CALCULATOR");
        System.out.printf("%-20s %-20s\n%-20s %-20s\n","[1] - Addition",
                "[2] - Subtraction","[3] - Multiplication","[4] - Division");
        System.out.println("Enter [0] to exit");

        do{
            try{
                System.out.print("Perform operation (1,2,3,4) : ");
                operation = input.nextInt();
                if(operation<0 || operation >4) throw new InputMismatchException();
                else if(operation!=0)System.out.println("Enter Numbers");
                switch(operation){
                    case 1 -> System.out.println("Sum: "+ addition(input.nextDouble(),input.nextDouble()));
                    case 2 -> System.out.println("Difference: "+ subtraction(input.nextDouble(),input.nextDouble()));
                    case 3 -> System.out.println("Product: "+ multiplication(input.nextDouble(),input.nextDouble()));
                    case 4 -> System.out.println("Quotient: "+ division(input.nextDouble(),input.nextDouble()));
                    case 0 -> System.out.println("... closing simple calculator");
                }

            }catch(InputMismatchException exc){
                System.out.println("Invalid Value, Please Enter a valid value.");
                continue;
            }

        } while(operation!=0);

        input.close();
    }

    public static double addition(double num1, double num2){
        return num1+num2;
    }

    public static double subtraction(double num1, double num2){
        return num1-num2;
    }

    public static double multiplication(double num1, double num2){
        return num1*num2;
    }

    public static double division(double num1, double num2){
        return num1/num2;
    }
}
