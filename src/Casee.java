


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ander
 */
public class Casee{

   private String nome;
   
  
    
    
    
    public static void main(String[] args) throws InterruptedException {

        int numDia = 3;

        String semanadia;

        switch (numDia) {
            case 1:
                semanadia = "Segunda Feira ";
                break;

            case 2:
                semanadia = "TERÇA ";
                
                break;

            case 3:
                semanadia = "QUARTA ";
           
               
                break;
            case 4:
                semanadia = "QUINATA ";
                break;
            case 5:
                semanadia = "SEXTA ";
                break;
                
                default:
                    System.out.println("Valor não é nenhum dos valores");
        }
        
    /**
     *
     */
   
        }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    }

