/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursaocondicaoparada;

import java.io.FilenameFilter;

/**
 *
 * @author higor
 */
public class RecursaoCondicaoParada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resultado = sum(5, 10);
        System.out.println(resultado);
    }
    
    
    public static int sum(int inicio, int fim){
        if(fim > inicio) {
            return fim + sum(inicio, fim - 1);
        }else {
            return fim;
        }
    }
    
}
