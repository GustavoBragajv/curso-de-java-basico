/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticaodowhile;

/**
 *
 * @author hbraga
 */
public class RepeticaoDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Repetição Do While");
        
        int contador = 10;
        
        System.out.println("Contando de 10 a 0");
        
        do {
            System.out.println(contador);
            contador--;
        } while(contador >= 0);
    }
    
}
