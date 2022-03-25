
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ander
 */
class  label {
    
    
    
    public void bb(Casee n){
         Casee p = new Casee();
         p.getNome();
         
    }
     public static void set(){
          try {
         String y="";
              String a="A",n="N",d="D",e="E",r="R",s="S",o="O",nn="N";
              
              
            int x=0;
            while(x<10){
                 Thread.sleep(1000);
                 
                // nome.chars();
                 x++;
                  
                  
                  if(x==1){
                      y=y+n;
                      System.out.println(""+y);
                  }else{
                      if(x==2){
                                y=y+d;
                                System.out.println(""+y);
                      }
                  }
                  System.out.println("string "+y);
                System.out.println(x);
               
                   
                
                
            }
            
           
        } catch (InterruptedException ex) {
            Logger.getLogger(Conta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void main(String[] args) {
     
        label.set();
    }
    
    
    
}
