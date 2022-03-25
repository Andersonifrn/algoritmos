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
public class Hora {
    
    
    public static void main(String[] args) {
        
       Hora h = new Hora(); 
       
     int hora =00;
    
    int minuto=00;
    
    int ss=00;
    
    int i=0;
    while(i<10){
        
       
           i++;
           h.tempo();
            System.out.println(""+i);
            
       
        if(i==10){
             minuto++;
             i=00;
        }
        
           System.out.println("minitos  ="+minuto);
        
         if(minuto==10){
             hora++;
             minuto=00;
             i=00;
        }
           
          System.out.println("Hora ="+hora);
         
           System.out.println("Horario "+hora+" :"+minuto+": "+i);
    }
    
    
   
    
    }
    
      //MÉTODO PARA EXECUTAR QUALQUEI AÇÃO EM UM  DETERMINADO TEMPO;
    public void tempo() {
        try {
            Thread.sleep(1000);

        } catch (InterruptedException ex) {
          
        }
    }
    
    
}

