/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pewarisan;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Disorder
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SubClass sub = new SubClass();
                
        sub.setNama("joni");
        sub.setSifat("Pemarah");
        
        
        System.out.println(""+sub.getNama());
        System.out.println(""+sub.getSifat());
        sub.tampil();
        sub.marah();
        
        SuperClass sup = new SuperClass();
        sup.tampil();
        sup.marah();
        
        
    }
    
}
