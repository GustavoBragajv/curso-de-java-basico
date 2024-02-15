/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package packagedatatest;

/**
 *
 * @author hbraga
 */
public class PackageDataTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PackageData packageData = new PackageData();
        
        System.out.printf("After instantiation:%n%s%n", packageData);
        
        packageData.number = 77;
        packageData.string = "Goodbye";
        
        
        System.out.printf("%nAfter changing values: %n%s%n", packageData);
    }
    
}

class PackageData {
    int number;
    String string;
    
    public PackageData() {
        number = 0;
        string = "Hello";
    }
    
    
    public String toString() {
        return String.format("number: %d; string: %s", number, string);
    }
}
