/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mostrandovaloresparesarrays;

/**
 *
 * @author hbraga
 */
public class MostrandoValoresParesArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] valoresPares = new int[10];
        
        for(int cont = 0; cont < valoresPares.length; cont++) {
            valoresPares[cont] = 2 + 2 * cont;
        }
        
        System.out.printf("%s%8s%n", "Index", "Value");
        
        
        for(int cont = 0; cont < valoresPares.length; cont++) {
            System.out.printf("%5d%8d%n", cont, valoresPares[cont]);
        }
    }
    
}
