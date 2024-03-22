/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expressoeslambdateste;

import java.util.ArrayList;

/**
 *
 * @author higor
 */
public class ExpressoesLambdaTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> valores = new ArrayList<Integer>();
        valores.add(4);
        valores.add(6);
        valores.add(45);
        valores.add(79);
        valores.forEach((n) -> {System.out.println(n);});
    }
    
}
