/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package varargs;

import java.util.Random;

/**
 *
 * @author higor
 */
public class Varargs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random valoresAleatorios = new Random();
        int[] listaValores = new int[7];
        for(int i = 1; i <= 6; i++) {
            listaValores[i] = valoresAleatorios.nextInt(1, 201);
            System.out.println(listaValores[i]);
        }
        System.out.println("==========================");
        System.out.println(somarValores(listaValores));
    }
    
    
    public static int somarValores(int ...soma) {
        int resultado = 0;
        for(int x : soma) {
           resultado += x;
        }
        return resultado;
    }
    
}
