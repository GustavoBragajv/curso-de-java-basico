/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interest;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 *
 * @author hbraga
 */
public class Interest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BigDecimal principal = new BigDecimal(1000.0);
        BigDecimal rate = new BigDecimal(0.05);
        
        
        System.out.printf("%s%20s%n", "Year", "Amout on deposit");
        
        for(int year = 1; year <= 10; year++) {
            BigDecimal amount = 
                    principal.multiply(rate.add(BigDecimal.ONE).pow(year));
            
            System.out.printf("%4d%20s%n", year, 
                    NumberFormat.getCurrencyInstance().format(amount));
        }
    }
    
}
