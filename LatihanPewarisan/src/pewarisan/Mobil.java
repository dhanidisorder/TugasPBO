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
public class Mobil {
    String merek;
    String warna;
    String bahanbakar;
    String jenis;

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBahanbakar() {
        return bahanbakar;
    }

    public void setBahanbakar(String bahanbakar) {
        this.bahanbakar = bahanbakar;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
     public void tampilkandata(){
         System.out.println("merek mobil : "+getMerek());
         System.out.println("warna mobil : "+getWarna());
         System.out.println("bahan bakar : "+getBahanbakar());
         System.out.println("jenis mobil : "+getJenis());
         
     }
    
    public void  inputdata(String m, String w, String bb, String j){
        setMerek(m);
        setWarna(w);
        setBahanbakar(bb);
        setJenis(j);
    }
    
}
