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
public class Lampada {
    
    private boolean ligada;
    
    private double potencia;
    
    
    public void ligar(){
        this.ligada=true;
        
        System.out.println("ligada "+ligada);
    }
    
     public void desligar(){
         this.ligada=false;
         System.out.println("Desligada "+ligada);
         
         
    }
      public boolean estaLigada(){
         this.ligar();
          return true;
        
    }
      
     
     

    /**
     * @return the ligada
     */
    public boolean isLigada() {
        return ligada;
    }

    /**
     * @param ligada the ligada to set
     */
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    /**
     * @return the potencia
     */
    public double getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
 
    
     public static void main(String[] args) {
        
          Lampada lp = new Lampada();
          lp.ligar();
          lp.desligar();
          lp.estaLigada();
         
          
    }
}
