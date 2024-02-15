/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package passandoarraymetodos;

/**
 *
 * @author hbraga
 */
public class PassandoArrayMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] valores = {1, 2, 4, 6, 7};
        
        System.out.printf("Efeitos da passagem de referência para todo o array:%n" +
                           "Os valores da matriz original são:%n");
        
        for(int v : valores) {
            System.out.printf("    %d", v);
        }
        
        modificarValores(valores);
        
        System.out.printf("%n%nOs valores do array modificado são:%n");
        
        for(int v : valores) {
            System.out.printf("    %d", v);
        }
        
        System.out.printf("%n%nEfeitos da passagem do valor do elemento do array:%n" +
                            "array[3] antes de modificarElement: %d%n", valores[3]);
        
        modificarElementos(valores[3]);
        
        System.out.printf("array[3] após modificarElement: %d%n", valores[3]);
            
    }
    
    
    public static void modificarValores(int[] valores2) {
        for(int cont = 0; cont < valores2.length; cont++) {
            valores2[cont] *= 2;
        }
    }
    
    
    public static void modificarElementos(int elementos) {
        elementos *= 2;
        System.out.printf("Valor do elemento em modificarElement: %d%n", elementos);
    }
        
    
}
