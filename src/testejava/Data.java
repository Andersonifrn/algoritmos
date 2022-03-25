/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testejava;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ander
 */
public class Data {
    
    public static void main(String[] args) {
        
        Date data = new Date();
      
        SimpleDateFormat  formatar = new SimpleDateFormat("dd-MM-YYYY");
        String dataFormart = formatar.format(data);
       
        System.out.println(dataFormart);
    }
}
