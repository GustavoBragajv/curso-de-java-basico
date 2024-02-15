/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resultadospesquisas;

/**
 *
 * @author hbraga
 */
public class ResultadosPesquisas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] respostas = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
        
        int[] frequencia = new int[6];
        
        for(int cont = 0; cont < respostas.length; cont++) {
            try{
                ++frequencia[respostas[cont]];
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                System.out.printf("    respostas[%d] = %d%n%n", cont, respostas[cont]);
            }
        }
        
        System.out.printf("%s%10s%n", "Rating", "Frequency");
        
        
        for(int c = 1; c < frequencia.length; c++) {
            System.out.printf("%6d%10d%n", c, frequencia[c]);
        }
    }
    
}
