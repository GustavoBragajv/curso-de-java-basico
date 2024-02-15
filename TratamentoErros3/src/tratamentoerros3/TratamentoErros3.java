/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tratamentoerros3;

import java.util.Scanner;

/**
 *
 * @author higor
 */
public class TratamentoErros3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Entre com um número decimal");
        try{
            double num = lerNumero();
            System.out.println("Você digitou " + num);
        }catch(Exception e) {
            System.out.println("Entrada inválida");
            e.printStackTrace();
        }
        
    }
    
    
    public static double lerNumero() throws Exception{
        Scanner teclado = new Scanner(System.in);
        
        double num = teclado.nextDouble();
        return num;
        
        // Sempre que eu quiser disparar uma exception basta usar o
        // throw new e o nome da exceção a ser gerada.
    }
    
}
