
package testejava;

/**
 *
 * @author ander
 */
public class Lucro {
    
    
    public static void main(String[] args) {
        
        int qtd =10;
        
        double vlunt = 2;
        
        double vlcomp =1.50;
        
        double mult=qtd*vlunt;
      //  System.out.println("VALOR DA MULTIPLICAÇÃO DO Valor de venda pela qtd "+mult);
        
        double valorDcmp=qtd*vlcomp;
       //    System.out.println("VALOR DA MULTIPLICAÇÃO DO Valor de comprar pela qtd "+valorDcmp);
           
           double total=mult-valorDcmp;
           
              System.out.println("Valor Total do Lucro dos Produtos = "+total);
        
        int mentro=9;
        int altura =8;
        
        double x =mentro*altura;
        System.out.println("metros quadrados = "+x);
        
        int m=1;
        
        double l=3*m;
        
        //fazendo as questões de Alanna
        
      double litro=18;
        
        double lataPinta=litro;
        
        int metros=3;
        
        int umLitro=metros;
        
        double PintaComUmaLata= lataPinta*umLitro;
        
       double  resulta=PintaComUmaLata*2;
       
       
       double resta =resulta-x;
        
        System.out.println("Uma Lata Pinta "+PintaComUmaLata+" Metros");
     
        System.out.println(""+2+" Lata Pinta   "+resulta+" Metros");
        
        System.out.println("Resta "+resta+" Litros de "+2+" latas Para Pinta  "+x+" Metros Quadrados");
       
    }
}
