/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sobrecargametodos;

/**
 *
 * @author hbraga
 */
public class SobrecargaMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Sobrecarga de Métodos");
        
        int num1 = 25;
        int num2 = 5;
        
        int divisao = num1 / num2;
        somarValores(5, 7);
        
        subtrairValores(15, 7);
        
        multiplicarValores(8, 6);
        
        
        System.out.printf("A divisão entre %d e %d é igual a: %d%n", num1, num2, divisao);
    }
    
    
    public static void somarValores(int num1, int num2) {
        int soma = num1 + num2;
        System.out.printf("A soma entre %d e %d é igual a: %d%n", num1, num2, soma);
    }
    
    
    public static void subtrairValores(int num1, int num2) {
        int subtracao = num1 - num2;
        System.out.printf("A subtração entre %d e %d é igual a: %d%n", num1, num2, subtracao);
    }
    
    public static void multiplicarValores(int num1, int num2) {
        int multiplicacao = num1 * num2;
        System.out.printf("A multiplicação entre %d e %d é igual a: %d%n", num1, num2, multiplicacao);
    }
    
}
