/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expressoeslambdateste1;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;

/**
 *
 * @author higor
 */
public class ExpressoesLambdaTeste1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> valores = new ArrayList<Integer>();
        Random valoresAleatorios = new Random();
        for(int i = 0; i < 10; i++) {
            int aleatorios = valoresAleatorios.nextInt(1, 20);
            valores.add(aleatorios);
        }
        
        Consumer<Integer> method = (n) -> {System.out.print(n + " ");};
        valores.forEach(method);
        System.out.println("");
    }
    
}
