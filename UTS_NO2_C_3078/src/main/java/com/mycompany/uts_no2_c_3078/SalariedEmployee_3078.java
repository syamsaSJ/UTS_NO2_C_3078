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

public class SalariedEmployee_3078 extends Employee_3078{
    
    //Atribut
    int upahMingguan_3078, gaji_3078;
    
    //Konstruktor
    public SalariedEmployee_3078(String nama_3078, int nip_3078, int upahMingguan_3078){
        super(nama_3078, nip_3078); //Pemanggilan parameter konstruktor induk kelas / Employee menggunakan super
        this.upahMingguan_3078 = upahMingguan_3078;
    }
    
    //Method Hitung Gaji
    public int hitungGaji_3078(){
        gaji_3078 = upahMingguan_3078;
        return gaji_3078;
    }
    
    //Method Cetak Salaried Employee
    public void cetakSalariedEmployee_3078(){
        super.cetakEmployee_3078(); //Pemanggilan method cetak employee menggunakan super
        System.out.println("Upah Mingguan      : " + hitungGaji_3078());
        System.out.println("");
    }
    
}