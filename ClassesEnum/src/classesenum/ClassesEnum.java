/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classesenum;

/**
 *
 * @author higor
 */
public class ClassesEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DiaSemana dia = DiaSemana.DOMINGO;
        Data data = new Data(25, 10, 1997, DiaSemana.SABADO);
        
        
        System.out.println(dia.toString() + " - " + dia.getValor());
        
        System.out.println("==============================");
        
        data.info();
        
        
        // Podem ser comparadas usando o operador de ==
        // Não podem ser instanciadas com new
        // Podem implementar interfaces
        // Pode ser declarado separadamente ou dentro de classe
    }
    
}
