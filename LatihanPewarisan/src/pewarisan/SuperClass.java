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
public class SuperClass {
    String nama;
    String sifat;
    
    
    public void tampil(){
        System.out.println("super");    
    }
    
    public void marah(){
        System.out.println("saya ini lagi marah tau gak sih");
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
