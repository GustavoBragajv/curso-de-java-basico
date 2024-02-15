/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classesenumb;

/**
 *
 * @author higor
 */
public class ClassesEnumB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cliente1 = new Cliente("Higor Gustavo", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Bradesco", TipoCliente.PESSOA_JURIDICA);
        
        System.out.println(cliente1);
        System.out.println("==================");
        
        System.out.println(cliente2);
    }
    
}
