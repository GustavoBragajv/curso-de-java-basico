/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author higor
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        byte num1 = 5;
        byte num2 = 7;
        
        
        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        int divisao = num1 / num2;
        int resto = num1 % num2;
        
        System.out.printf("A soma entre %d e %d é igual a: %d%n", num1, num2, soma);
        System.out.printf("A subtração entre %d e %d é igual a: %d%n", num1, num2, subtracao);
        System.out.printf("A multiplicação entre %d e %d é igual a: %d%n", num1, num2, multiplicacao);
        System.out.printf("A divisão entre %d e %d é igual a: %d%n", num1, num2, divisao);
        System.out.printf("O resto da divisão entre %d e %d é igual a: %d%n", num1, num2, resto);
    }
    
}
