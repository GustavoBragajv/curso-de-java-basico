/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionaismultiplasselecao;

/**
 *
 * @author hbraga
 */
public class CondicionaisMultiplasSelecao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Condicionais com Multiplas Seleção");
        float nota1 = 4.5f;
        float nota2 = 3.5f;
        
        float media = (nota1 + nota2) / 2;
        
        System.out.println("Média: " + media);
        if(media >= 7) {
            System.out.println("Parabéns você foi Aprovado...");
        } else if(media >= 5) {
            System.out.println("Você ficou de recuperação, Estude mais...");
        } else {
            System.out.println("Você foi reprovado");
        }
    }
    
}
