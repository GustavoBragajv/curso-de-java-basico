/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodosparametros;

/**
 *
 * @author hbraga
 */
public class MetodosParametros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Passando parâmetros para métodos");
        
        System.out.println("Somando valores");
        
        somarValores(5, 7);
        
    }
    
    
    public static void somarValores(int num1, int num2) {
        int soma = num1 + num2;
        System.out.printf("A soma entre %d e %d é igual a: %d%n", num1, num2, soma);
    }
    
}
