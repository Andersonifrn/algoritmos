/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testejava;

/**
 *
 * @author ander
 */
public class Carro {
    
    String nome;
    String marca;
    int ano;
    
    Carro(String nome,String marca,int ano){
        this.nome=nome;
        this.marca=marca;
        this.ano=ano;
    }

    Carro(String f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
