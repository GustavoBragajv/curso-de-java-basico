/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expressoeslambdateste2;

/**
 *
 * @author higor
 */
public class ExpressoesLambdaTeste2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Halo", exclaim);
        printFormatted("Halo", ask);
    }
    
    interface StringFunction {
        String run(String str)
    } 
    
    public static void printFormatted(String str, StringFunction format){
        String result = format.run(str);
        System.out.println(result);
    }
}
