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
public class Conta {
    
 
    private double saldo;
    
    private double salario;
    
    
    public void sacar(double sacar){
        this.setSaldo(getSaldo() - sacar);
        
    }

     public void depositar(double depositar){
         this.setSalario(getSalario() + depositar);
     }
  
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSalario() {
        return salario;
    }

  
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    public int idade(int id,int nasc){
        
        return id-nasc;
    }
    
    public static void main(String[] args) {
        Conta cont = new Conta();
        cont.depositar(1750);
        System.out.println("Saldo em conta é :"+cont.getSaldo());
        cont.sacar(750);
         System.out.println("Saldo em conta é :"+cont.getSaldo());
         cont.salario=200;
         System.out.println("Valor do salário é ;"+cont.getSalario());
          cont.sacar(21);
          System.out.println("Valor do Saque é : "+cont.saldo);
        int x= cont.idade(1993, 2021);
         System.out.println("Minha idade é = "+x+" Anos");
    }
}
