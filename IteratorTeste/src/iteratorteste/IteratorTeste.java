/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iteratorteste;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author higor
 */
public class IteratorTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ArrayList<String> carros = new ArrayList<>();
        ArrayList<Integer> valores = new ArrayList<Integer>();
        Random valoresAleatorios = new Random();
        
        //carros.add("Volvo");
        //carros.add("Ford");
        //carros.add("BMW");
        //carros.add("Fiat");
        
        
        //Iterator<String> iterador = carros.iterator();
        //System.out.println(iterador.next());

        /*
        System.out.println("Percorrendo a coleção");
        while(iterador.hasNext()) {
            System.out.println(iterador.next());
        }
        */

        // Removendo valores da coleção
        valores.add(5);
        valores.add(4);
        valores.add(90);
        valores.add(45);
        valores.add(3);
        valores.add(79);
        
        Iterator<Integer> it = valores.iterator();
        while(it.hasNext()) {
            Integer i = it.next();
            if(i < 10) {
                it.remove();
            }
        }
        System.out.println(valores);
    }
    
}
