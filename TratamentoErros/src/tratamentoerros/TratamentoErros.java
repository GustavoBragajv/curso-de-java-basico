/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tratamentoerros;

import java.util.ArrayList;

/**
 *
 * @author higor
 */
public class TratamentoErros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<String> carros = new ArrayList<>();
        
        carros.add("HRV");
        carros.add("Polo");
        carros.add("Cruze");
        carros.add("Argo");
        carros.add("Fusion");
        
        
        try{
            System.out.println(carros.get(10));
        } catch(IndexOutOfBoundsException e) {
            System.out.println("ERRO: Valor fora do indice do array");
        } finally {
            System.out.println("Fim do try");
        }
    }
    
}
