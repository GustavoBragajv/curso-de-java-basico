/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumtest;

import java.util.EnumSet;

/**
 *
 * @author hbraga
 */
public class EnumTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("All books: ");
        
        for(Book book : Book.values()) {
            System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getCopyrightYear());
        }
        
        System.out.printf("%nDisplay a range of enum constanst:%n");
        
        for(Book book: EnumSet.range(Book.JHTP, Book.CPPHTP)) {
            System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getCopyrightYear());
        }
    }
    
}
