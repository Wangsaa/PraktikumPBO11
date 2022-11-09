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
public class SegiEmpat extends BangunDatar {
    private double sisi;

    public SegiEmpat(double sisi,String warna) {
        this.sisi = sisi;
        this.warna = warna;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    @Override
    public double keliling(){
        return 4 * this.sisi;
    }
    @Override
    public double luas(){
        return this.sisi * this.sisi;
    }
    @Override
    public void print(){
        System.out.println("SegiEmpat");
            System.out.println("Warna :" + warna);
            System.out.println("sisi" + sisi);
            System.out.println("Luas : "+ luas());
            System.out.println("Keliling :" + keliling());
            System.out.println();
    }
    
}
