/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expressoesregularesteste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author higor
 */
public class ExpressoesRegularesTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Pattern patternn = Pattern.compile("Programador", Pattern.CASE_INSENSITIVE);
        Matcher matcherr = patternn.matcher("Eu serei um bom PROGRAMADOR um dia");
        boolean matchFoundd = matcherr.find();
        if(matchFoundd) {
            System.out.println("Match Found");
        } else {
            System.out.println("Match not Found");
        }

    }
    
}
