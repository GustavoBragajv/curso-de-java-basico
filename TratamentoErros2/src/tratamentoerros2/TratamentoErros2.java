/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tratamentoerros2;

/**
 *
 * @author higor
 */
public class TratamentoErros2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
           int[] vetor = new int[4];
           
            System.out.println("Antes da Exception");
            vetor[4] = 1;
            
            System.out.println("Esse texto não será impresso");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Você tentou acessar a posição de um indice que não existe");
        }
        System.out.println("Esse texto será impresso após a exception");
    }
    
}
