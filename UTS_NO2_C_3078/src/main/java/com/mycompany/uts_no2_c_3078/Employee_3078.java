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

public class Employee_3078 {
    
    //Atribut
    protected int nip_3078, gaji_3078;
    protected String nama_3078;
    
    //Konstruktor
    public Employee_3078(String nama_3078, int nip_3078){
        this.nama_3078 = nama_3078;
        this.nip_3078 = nip_3078;
    }
    
    //Method Hitung Gaji 
    public int hitungGaji_3078(){
        return gaji_3078;
    }
    
    //Method Cetak Employee
    public void cetakEmployee_3078(){
        System.out.println("Nama               : " + nama_3078);
        System.out.println("NIP                : " + nip_3078);
    }
    
}