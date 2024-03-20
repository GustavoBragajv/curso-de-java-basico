/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursao;

/**
 *
 * @author higor
 */
public class Recursao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resultado = sum(10);
        System.out.println(resultado);
    }
    
    
    public static int sum(int valor) {
        if(valor > 0) {
            return valor + sum(valor - 1);
        }else {
            return 0;
        }
        
    }
    
}
