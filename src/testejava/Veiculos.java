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
public class Veiculos {
    
    private int velocidade ;
    
    private int combustivel =5;
    
    private boolean ligado;

    /**
     * @return the velocidade
     */
    public int getVelocidade() {
        return velocidade;
    }

    /**
     * @param velocidade the velocidade to set
     */
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    /**
     * @return the combustivel
     */
    public int getCombustivel() {
        return combustivel;
    }

    /**
     * @param combustivel the combustivel to set
     */
    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }

    /**
     * @return the ligado
     */
    public boolean isLigado() {
        return ligado;
    }

    /**
     * @param ligado the ligado to set
     */
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    
    
    public void ligar(){
      
        this.ligado=true;
        
        System.out.println("Ligado = "+ligado);
      
    }
    
    public void desligar(){
      
        this.ligado=false;
        
        System.out.println("Carro Desligado = "+ligado);
      
    }
     public void acelerar(){
      
       int x= this.velocidade=10;
       int a= this.combustivel=combustivel-1;
        
        System.out.println("velocidade em "+x+" km/hr");
        System.out.println("Quantidade de combustível = "+a+" Litros");
    }
    public void parar(){
      this.desligar();
      int g=  this.velocidade=velocidade-velocidade;
     
        
        System.out.println("velocidade está em  "+g+" km/Hr");
      
    }
    
    
    public static void main(String[] args) {
        
        Veiculos v = new Veiculos();
        v.ligar();
        v.desligar();
        v.acelerar();
        v.parar();
    }
}
 
 