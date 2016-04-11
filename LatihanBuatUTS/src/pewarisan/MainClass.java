/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pewarisan;

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
        SubClass su = new SubClass();
        
        su.setNama("Nama : Ahmad Khairullah Ramadhani");
        su.setSifat("NPM : 14312432");
        
        System.out.println(" "+su.getNama());
        System.out.println(" "+su.getSifat());
        
        su.tampil();
        su.pintar();
        
        SuperClass Sup = new SuperClass();
        Sup.tampil();
        Sup.pintar();
        
        
    }
    }
    
