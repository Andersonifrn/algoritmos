
package testejava;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class TesteCarro {
    
    public static void main(String[] args) {
        
      
        
      
        ArrayListCarro al = new ArrayListCarro();
        
        
        
       String n=   JOptionPane.showInputDialog(null,"Digite Nome");
        String x=   JOptionPane.showInputDialog(null,"Digite Marca");
        
        al.cadrastro.add(new Carro(n,x,1979));
    
        
        for (int i = 0; i <al.cadrastro.size(); i++) {
               
                JOptionPane.showMessageDialog(null, " Nome "+al.cadrastro.get(i).nome);
                JOptionPane.showMessageDialog(null, " Marca  "+al.cadrastro.get(i).marca);
                 JOptionPane.showMessageDialog(null, "Ano "+al.cadrastro.get(i).ano);
                  JOptionPane.showMessageDialog(null, "Quantidade  "+al.cadrastro.size());
               
               
               
        }
    }
    
}
