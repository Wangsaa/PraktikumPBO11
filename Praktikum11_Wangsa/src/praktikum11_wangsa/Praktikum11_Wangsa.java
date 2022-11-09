/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum11_wangsa;

/**
 *
 * @author Praktikan
 */
public class Praktikum11_Wangsa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BangunDatar lingkaran = new Lingkaran (10,"merah");
        BangunDatar SegiTiga = new SegiTiga (13,5,"Biru");
        BangunDatar SegiEmpat = new SegiEmpat (5, "Hitam");
        
        BangunDatar[] bangunDatar = new BangunDatar[3];
        bangunDatar[0] = lingkaran;
        bangunDatar[1] = SegiTiga;
        bangunDatar[2] = SegiEmpat;
        
        for (int i = 0 ; i < 3 ; i++){
//            System.out.println("Bangun Datar :" + (i+1));
//            System.out.println("Warna :" + bangunDatar[i].getWarna());
//            System.out.println("Luas : "+ bangunDatar[i].luas());
//            System.out.println("Keliling :" + bangunDatar[i].keliling());
//            System.out.println();
            bangunDatar[i].print();
        }
    }
    
}
