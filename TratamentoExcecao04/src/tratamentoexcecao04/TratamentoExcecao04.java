/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tratamentoexcecao04;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author higor
 */
public class TratamentoExcecao04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        while(true) {
            try {
                System.out.print("Please enter an integer numerator: ");
                int numerator = scan.nextInt();
                System.out.print("Please enter an integer denominator: ");
                int denominator = scan.nextInt();
                
                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n", numerator,
                        denominator, result);
                break;
            } catch (InputMismatchException inputMismatchException) {
                System.out.printf("%nException: %s%n", inputMismatchException);
                scan.nextLine();
                System.out.printf("You must enter integers. Please try again.%n%n");
            }catch (ArithmeticException arithmeticException) {
                System.out.printf("%nException: %s%n", arithmeticException);
                System.out.printf("Zero is an invalid denominator. Please try"
                        + "again.%n%n");
            }
        }
    }
    
    
    public static int quotient(int numerator, int denominator) throws ArithmeticException {
        return numerator / denominator;
        }
}
