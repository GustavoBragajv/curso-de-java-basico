/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package argumentoslinhacomandos;

/**
 *
 * @author higor
 */
public class ArgumentosLinhaComandos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        if(args.length != 3) {
            System.out.printf("Erro: Por favor, digite novamente o comando inteiro, incluindo%n" +                                    
                "um tamanho de array, valor inicial e incremento.%n");
        } else {
            int tamanhoArray = Integer.parseInt(args[0]);
            int[] valores = new int[tamanhoArray];
            
            int valorInicial = Integer.parseInt(args[1]);
            int incremento = Integer.parseInt(args[2]);
            
            for(int cont = 0; cont < valores.length; cont++) {
                valores[cont] = valorInicial + incremento * cont;
            }
            
            System.out.printf("%s%8s%n", "Index", "Valor");
            
            for(int i = 0; i < valores.length; i++) {
                System.out.printf("%5d%8d%n", i, valores[i]);
            }
        }
    }
    
}
