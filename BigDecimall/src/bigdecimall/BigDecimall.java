/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bigdecimall;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author higor
 */
public class BigDecimall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Quando usar o BigDecimal");
        System.out.println("Quando precisarmos de precisão em valores");
        System.out.println("principalmente em valores monetarios.");
        
        BigDecimal valor1 = new BigDecimal("15.25");
        BigDecimal valor2 = new BigDecimal("25.36");
        
        System.out.println("Soma: " + valor1.add(valor2));
        
        
        // Ficar atento quanto a divisão no bigdecimal, pois quando o resultado
        // da divisão retornar uma dizima periodica o mesmo será lançado uma
        // exceção.. para contornar isso podemos fazer igual esta abaixo.
        
        BigDecimal valor3 = new BigDecimal("1");
        BigDecimal valor4 = new BigDecimal("3");
        // nesse caso seria lançado uma exceção...
        System.out.println("Corrigindo para não ter a exceção....");
        
        System.out.println(valor3.divide(valor4, 5, RoundingMode.HALF_EVEN));
    }
    
}
