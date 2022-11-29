/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.uts_no2_c_3078;

/**
 * @author Syamsa Shahira Julyinda
 * NIM : 21103078
 * KELAS : S1SI-05-C
 */

public class CommissionEmployee extends Employee{
    
    int komisi, totalPenjualan;
    
    public CommissionEmployee(String nama, int nip, int gaji, int komisi, int totalPenjualan){
        super(nama, nip);
        this.komisi = komisi;
        this.totalPenjualan = totalPenjualan;
    }
    
    public int hitungGaji(){
        gaji = gaji + (komisi * totalPenjualan);
        return gaji;
    }
    
    public void cetakCommisionEmployee(){
        super.cetakEmployee();
        System.out.println("Komisi             : " + komisi);
        System.out.println("Total penjualan    : " + totalPenjualan);
        System.out.println("Total gaji         : " + hitungGaji());
    }
    
}
