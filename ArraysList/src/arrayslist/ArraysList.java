/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayslist;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author hbraga
 */
public class ArraysList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> nomes = new ArrayList<>();
        
        // como adicionar elementos no array
        
        
        // Para saber o tamanho do arrayList podemos usar o size()
        nomes.add("Higor Gustavo");
        nomes.add("Ana Carolina");
        nomes.add("Gabriel Martins");
        nomes.add("Felipe Henrique");
        
        for(String nome : nomes) {
            System.out.print(nome + ", ");
        }
        
        System.out.println("");
        
        // Para buscar um elemento pelo indice podemos usar o indexOf()
        
        int index = nomes.indexOf("Gabriel Martins");
        System.out.printf("O colaborador Gabriel Martins se encontra na %d° posição da lista.%n", index);
        
        
        // Para verificar se a lista está vazia ou cheia podemos usar o isEmpty().
        
        System.out.println(nomes.isEmpty());
        
        // Para verificar se a lista contém algum elemento podemos usar o contains().
        
        System.out.println(nomes.contains("Felipe Henrique"));
        
        
        
        System.out.println("");
        System.out.println("");
        
        List<Integer> valores = new ArrayList<>(10);
        SecureRandom valoresAleatorios = new SecureRandom();
        int cont = 0;
        
        while(valores.size() < 10) {
            int aleatorios = valoresAleatorios.nextInt(1, 21);
            System.out.print(aleatorios + " ");
            
            if(valores.contains(aleatorios)) {
                //System.out.printf("Valor %d já encontrado na lista", aleatorios);
            } else {
                //System.out.printf("Valor %d cadastrado com sucesso", aleatorios);
                valores.add(aleatorios);
            }
            
            cont++;
        }

        
        
        System.out.println("");
        for(int va : valores) {
            System.out.print(va + " ");
        }
        System.out.println("");
    }
    
    
    
    // Para limpar os valores da lista podemos usar o clear().
    // Para remover algum valor da lista indicando a posição do indice podemos usar o remove().
    // Para todo o conteudo da sua lista podemos usar o toString().
    
}
