/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package enkapsulasi;

/**
 *
 * @author Disorder
 */
public class NewClass {

private String nama;
private String npm;
private String kelas;

public void manusia(String n, String npm, String kelas) {
this.nama = n;
this.npm = npm;
this.kelas = kelas;
}
public String tampilkanNama() {
return nama;
}
public String tampilkanNpm() {
return npm;
}
public String tampilkanKelas() {
return kelas;
}
}