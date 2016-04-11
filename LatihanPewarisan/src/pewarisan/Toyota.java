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
public class Toyota extends Mobil{
    public void tampilkan(){
        double besasilinder;
        String bahanbakar;
        String kategori;
        
        besasilinder=30.2;
        bahanbakar="solar";
        kategori="off road";
        
        Mobil m = new Mobil();
        
        m.inputdata("avanza", "merah", "bensin", "kendaraan");
        
        m.tampilkandata();
        
        System.out.println("slinder : "+besasilinder);
        System.out.println("jenis bahan bakar : "+bahanbakar);
        System.out.println("jenis katagori : "+kategori);  
        
        
    }
    
}
