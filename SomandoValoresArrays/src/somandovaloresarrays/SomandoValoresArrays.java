/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package somandovaloresarrays;

import java.security.SecureRandom;

/**
 *
 * @author hbraga
 */
public class SomandoValoresArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SecureRandom aleatorios = new SecureRandom();
        int[] valoresAleatorios = new int[10];
        int total = 0;
        
        for(int cont = 0; cont < valoresAleatorios.length; cont++) {
            valoresAleatorios[cont] = aleatorios.nextInt(20);
        }
        
        for(int cont = 0; cont < valoresAleatorios.length; cont++) {
            System.out.print(valoresAleatorios[cont] + " ");
            
            total += valoresAleatorios[cont];
        }
        System.out.println("");
        System.out.println("A soma de todos os valores do Array é: " + total);
        System.out.println("");
        
    }
    
}
