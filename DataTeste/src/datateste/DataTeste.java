/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datateste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author higor
 */
public class DataTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDate minhaData = LocalDate.now();
        LocalTime minhaHora = LocalTime.now();
        LocalDateTime minhaDataHora = LocalDateTime.now();
        DateTimeFormatter minhaDataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(minhaData);
        System.out.println("");
        System.out.println(minhaHora);
        System.out.println("");
        System.out.println("Data antes da formatação");
        System.out.println(minhaDataHora);
        System.out.println("");
        System.out.println("Data depois da formatação");
        
        String formatarData = minhaDataHora.format(minhaDataFormatada);
        System.out.println(formatarData);
    }
    
}
