/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tratamentoexcecao08;

import java.util.Scanner;

/**
 *
 * @author higor
 */
public class TratamentoExcecao08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a number between 0 and 10: ");
        int number = scan.nextInt();
        
        assert (number >= 0 && number <= 10) : "bad number: " + number;
        assert (number >= 0 && number <= 10) : "bad number: " + number;
        
        if(number >= 0 && number <= 10) {
            System.out.println("You entered " + number);
        } else {
            System.out.println("bad number: " + number);
        }
        
        System.out.printf("You entered %d%n", number);
    }
    
}
