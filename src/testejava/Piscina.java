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
public class Piscina {
    
    private double comprimento;
    private double largura;
    private double profundidade;

    /**
     * @return the comprimento
     */
    public double getComprimento() {
        return comprimento;
    }

    /**
     * @param comprimento the comprimento to set
     */
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    /**
     * @return the largura
     */
    public double getLargura() {
        return largura;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(double largura) {
        this.largura = largura;
    }

    /**
     * @return the profundidade
     */
    public double getProfundidade() {
        return profundidade;
    }

    /**
     * @param profundidade the profundidade to set
     */
    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }
    
   public double comprimento(double comprir){
     return  this.comprimento=comprir;
   }
    
   public double largura(double larga){
       return this.largura=larga;
       
   }
    public double profundidade(double profun){
      return this.profundidade=profun;
   }
    
    public double volume(){
     double x= this.comprimento(comprimento);
     double a= this.largura(largura);
     double w= this.profundidade(profundidade);
        
       double total=x*a*w; 
        return total;
    }
    
    
    
    public static void main(String[] args) {
        
        Piscina pis = new Piscina();
        pis.comprimento(3);
        pis.largura(7);
        pis.profundidade(1.40);
       
        System.out.println(" valor do volume da Piscina é = "+pis.volume());
        
        

 }
}