/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesenumb;

/**
 *
 * @author higor
 */
public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;
    
    
    public Cliente() {
        super();
    }
    
    
    public Cliente(String nome, TipoCliente tipoCliente) {
        this.setNome(nome);
        this.setTipo(tipoCliente);
    }
    
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public String getNome() {
        return this.nome;
    }
    
    
    public void setTipo(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    
    
    public TipoCliente getTipoCliente() {
        return this.tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + 
                ", tipoCliente=" + tipoCliente + '}';
    }
    
}
