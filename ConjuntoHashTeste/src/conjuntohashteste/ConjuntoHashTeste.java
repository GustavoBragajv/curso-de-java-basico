/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conjuntohashteste;

import java.util.HashSet;

/**
 *
 * @author higor
 */
public class ConjuntoHashTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet<String> carros = new HashSet<>();
        // Lembrando que cada item é unico.
        carros.add("Volvo");
        carros.add("BMW");
        carros.add("Fiat");
        carros.add("Ford");
        carros.add("Fiat");
        carros.add("Nissan");
        carros.add("Ford");
        
        System.out.println(carros);
        System.out.println(carros.contains("ford"));
        System.out.println(carros.contains("Mazda"));
        System.out.println(carros.contains("Ford"));
        
        // Para limpar todos os valores da lista podemos usar o clear().
        // Para remover algum valor da lista indicando a posição do indice podemos usar o remove().
        // Para ver todo o conteudo da sua lista podemos usar o toString().
        // Para acessar um item da lista podemos usar o get().
        // Para alterar um item da lista podemos usar o set().
        // Para adicinar um item a lista podemos usar o add().
    }
    
}
