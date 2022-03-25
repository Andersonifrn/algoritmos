
package testejava;

import java.util.Random;


public class Fruta {
    
    public static void main(String[] args) {
        
       // Scanner sc = new Scanner (System.in);
        
        Random random = new Random();
            
        
        System.out.println("Digite o código da fruta");
      
        boolean teste=true;
       
       while(teste){
           
        int escolha=random.nextInt(30);
      
          
       switch(escolha){
           case 21:
               System.out.println("Uva tem esse codigo "+escolha);
           break;
           case 29:
               System.out.println("Abacaxi tem esse codigo "+escolha);
           break;
           case 25:
               System.out.println("Limão tem esse codigo "+escolha);
           break;
           case 20:
               System.out.println("Mamão tem esse codigo "+escolha);
           break;
           default:
               System.out.println("Opção invalida!");
           if(escolha==0){
               teste=false;
           }
               
         }
       
       }
    }
    
}
