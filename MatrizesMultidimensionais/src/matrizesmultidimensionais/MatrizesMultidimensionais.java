/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizesmultidimensionais;

import java.util.Random;

/**
 *
 * @author hbraga
 */
public class MatrizesMultidimensionais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Declarando Matrizes Multidimensionais");
        Random aleatorios = new Random();
        int[][] valores = new int[20][20];

        
        for(int i = 0; i < valores.length; i++) {
            for(int j = 0; j < valores[i].length; j++) {
                valores[i][j] = aleatorios.nextInt(1, 10);
            }
        }
        
        
        for(int i = 0; i < valores.length; i++) {
            for(int j = 0; j < valores[i].length; j++) {
                System.out.print(valores[i][j] + " ");
            }
            System.out.println("");
        }
        
    }
    
}
