/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticaoforeach;

/**
 *
 * @author hbraga
 */
public class RepeticaoForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Repetição For Each");
        
        int[] valores = {5, 13, 27, 38, 41, 56, 62, 79, 84, 95, 110};
        
        System.out.println("Mostrando os valores do Array de números com o foreach");
        for(int valor : valores) {
            System.out.println(valor);
        }
    }
    
}
