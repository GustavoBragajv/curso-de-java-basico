/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumtest;

/**
 *
 * @author hbraga
 */
public enum Book {
    JHTP("Java how to Program", "2015"),
    CHTP("C how to Program", "2013"),
    IW3HTP("Internet & World Wide Web how to Program", "2012"),
    CPPHTP("C++ how to Program", "2014"),
    VBHTP("Visual Basic how to Program", "2014"),
    CSHARPHTP("Visual C# how to Program", "2014");
    
    private final String title;
    private final String copyrightYear;
    
    
    Book(String title, String copyrightYear){
        this.title = title;
        this.copyrightYear = copyrightYear;
    }
    
    
    public String getTitle(){
        return title;
    }
    
    
    public String getCopyrightYear() {
        return copyrightYear;
    }
}
