/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tratamentoexcecaocustomizada;

/**
 *
 * @author higor
 */
public class LoginInvalidoException extends Exception{
    
    public LoginInvalidoException() {
        super("Login inválido");
    }
    
    
    public LoginInvalidoException(String message) {
        super(message);
    }
    
}
