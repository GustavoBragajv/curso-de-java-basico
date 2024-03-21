/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmaptest;

import java.util.HashMap;

/**
 *
 * @author higor
 */
public class HashMapTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String, String> capitalPaises = new HashMap<String, String>();
        
        capitalPaises.put("Germany", "Berlin");
        capitalPaises.put("England", "London");
        capitalPaises.put("Norway", "Oslo");
        capitalPaises.put("Brasil", "Brasilia");
        capitalPaises.put("Argentina", "Buenos Aires");
        System.out.println(capitalPaises);
        System.out.println("");
        
        //System.out.println("País \t\t Capital");
        for(String paises : capitalPaises.keySet()) {
            System.out.println("País: " + paises + "\tCapital: " + capitalPaises.get(paises));
        }
        
    // Para limpar todos os valores da lista podemos usar o clear().
    // Para remover algum valor da lista indicando a posição do indice podemos usar o remove().
    // Para ver todo o conteudo da sua lista podemos usar o toString().
    // Para acessar um item da lista podemos usar o get().
    // Para alterar um item da lista podemos usar o set().
    // Para adicinar um item a lista podemos usar o put().
       

    }
    
}
