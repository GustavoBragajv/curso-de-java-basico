/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringjava;

/**
 *
 * @author hbraga
 */
public class StringJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome = "  Higor Gustavo  ";
        
        System.out.println("O seu nome tem: " + nome.length() + " letras");
        System.out.println("O seu nome com todas as letras maiúsculas fica: " + nome.toUpperCase());
        System.out.println("O seu nome com todas as letras minúsculas fica: " + nome.toLowerCase());
        System.out.println("Tirando todos os espaços antes e depois do nome: " + nome.trim());
        System.out.println("");
    }
    
}
