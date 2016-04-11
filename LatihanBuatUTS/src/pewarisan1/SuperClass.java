/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pewarisan1;

/**
 *
 * @author Disorder
 */
public class SuperClass {
    String nama;
    String sifat;

    public void tampil() {
        System.out.println("suka musik ska dan punk rock");
        
    }
    
    public void pintar() {
        System.out.println("penikmat musik maskulin, dinamis dan berjiwa muda");
        
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSifat() {
        return sifat;
    }

    public void setSifat(String sifat) {
        this.sifat = sifat;
    }
  
}
