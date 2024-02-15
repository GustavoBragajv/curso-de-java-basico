/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graficobarrasarray;

/**
 *
 * @author hbraga
 */
public class GraficoBarrasArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] mediaNotas = {3, 4, 1, 2, 4, 3, 5, 6, 7, 2, 9};
        
        for(int cont = 0; cont < mediaNotas.length; cont++) {
            if(cont == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", cont * 10, cont * 10 + 9);
            }
            
            
            for(int estrelas = 0; estrelas < mediaNotas[cont]; estrelas++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
