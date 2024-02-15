/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchcasejava;

import java.awt.BorderLayout;

/**
 *
 * @author hbraga
 */
public class SwitchCaseJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int semana = 0;
        switch (semana) {
            case 0:
                System.out.println("Hoje é DOMINGO");
                break;
            case 1:
                System.out.println("Hoje é SEGUNDA-FEIRA");
                break;
            case 2:
                System.out.println("Hoje é TERÇA-FEIRA");
                break;
            case 3:
                System.out.println("Hoje é QUARTA-FEIRA");
                break;
            case 4:
                System.out.println("Hoje é QUINTA-FEIRA");
                break;
            case 5:
                System.out.println("Hoje é SEXTA-FEIRA");
                break;
            case 7:
                System.out.println("Hoje é SÁBADO");
                break;
            default:
                System.out.println("Dia da semana inválido, tente novamente.");
                break;
        }
    }
    
}
