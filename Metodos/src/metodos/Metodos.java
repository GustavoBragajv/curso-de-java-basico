/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodos;

/**
 *
 * @author hbraga
 */
public class Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Métodos na mesma classe Principal");
        
        System.out.println("Está mensagem está dentro do método principal");
        
        System.out.println("=================================");
        
        Mensagem();
        
    }
    
    
    public static void Mensagem() {
        System.out.println("Está mensagem está fora do método principal");
    }
    
}
