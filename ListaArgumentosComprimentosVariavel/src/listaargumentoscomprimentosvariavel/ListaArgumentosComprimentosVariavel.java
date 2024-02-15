/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaargumentoscomprimentosvariavel;

/**
 *
 * @author hbraga
 */
public class ListaArgumentosComprimentosVariavel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double d1 = 10.0;
        double d2 = 20.0;
        double d3 = 30.0;
        double d4 = 40.0;
        
        System.out.printf("d1 = %.1f%nd2 = %.1f%nd3 = %.1f%nd4 = %.1f%n%n",
                d1, d2, d3, d4);
        System.out.printf("Média de d1 e d2 é: %.1f%n", mediaNotas(d1, d2));
        System.out.printf("Média de d1 e d2 e d3 é: %.1f%n", mediaNotas(d1, d2, d3));
        System.out.printf("Média de d1 e d2 e d3 e d4 é: %.1f%n", mediaNotas(d1, d2, d3, d4));       
    }
    
    
    public static double mediaNotas(double... notas) {
        double total = 0.0;
        
        for(double d : notas) {
            total+= d;
        }
        
        return total / notas.length;
    }
    
}
