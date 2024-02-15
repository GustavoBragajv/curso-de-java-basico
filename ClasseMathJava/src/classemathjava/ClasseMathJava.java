/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classemathjava;

import java.util.Random;

/**
 *
 * @author hbraga
 */
public class ClasseMathJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random aleatorios = new Random();
        System.out.println("Verificando o maior e menor valor entre 2 números");
        int num1 = 5;
        int num2 = 8;
        
        int maior = Math.max(num1, num2);
        int menor = Math.min(num1, num2);
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
        
        System.out.println("Verificando a raiz quadrada");
        int num3 = 64;
        System.out.println("A raiz quadrada de " + num3 + " é igual a: " + Math.sqrt(num3));
        
        System.out.println("Valor absoluto");
        double num4 = -4.5;
        System.out.println("O valor absoluto do valor " + num4 + " é: " + Math.abs(num4));
        
        System.out.println("Obtendo valores aleatórios");
        int valorescolhido = aleatorios.nextInt(1, 100);
        System.out.println("O valor aleatório escolhido foi: " + valorescolhido);
        
    }
    
}
