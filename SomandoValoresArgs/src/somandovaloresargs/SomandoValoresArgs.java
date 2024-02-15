/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package somandovaloresargs;

/**
 *
 * @author hbraga
 */
public class SomandoValoresArgs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int soma =0;
        
        if(args.length <= 0) {
            System.out.printf("%s%n", "Sem valores para somar");
            return;
        }
        
        for(String n:args) {
            int valor = Integer.valueOf(n);
            soma += valor;
        }
        
        System.out.printf("A soma dos valores é: %d%n", soma);
    }
    
}
