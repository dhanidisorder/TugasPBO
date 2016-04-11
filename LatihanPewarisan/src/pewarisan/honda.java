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
public class honda extends Mobil{
    
    public void tampilkan(){
        double besaesilinder=6.5;
        String bahanbakar ="pertamax";
        String katagori ="sport";
        
        Mobil m = new Mobil();
        
        m.inputdata("CVR", "SILVER", "HONDA", "KEDARAAN RODA GILA");
        m.tampilkandata();
        
        System.out.println("silinder : "+besaesilinder);
        System.out.println("jenis bahan bakar : "+bahanbakar);
        System.out.println("jenis katagori : "+katagori);
                
    }
    
    
}
