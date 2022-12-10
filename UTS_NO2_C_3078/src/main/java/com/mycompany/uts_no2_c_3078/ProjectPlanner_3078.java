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

public class ProjectPlanner_3078 extends Employee_3078{
 
    //Atribut
    int komisi_3078, totalHasilProyek_3078;
    
    //Konstruktor
    public ProjectPlanner_3078(String nama_3078, int nip_3078, int gaji_3078, int komisi_3078, int totalHasilProyek_3078){
        super(nama_3078, nip_3078);  //Pemanggilan parameter konstruktor induk kelas / Employee menggunakan super
        this.gaji_3078 = gaji_3078;
        this.komisi_3078 = komisi_3078;
        this.totalHasilProyek_3078 = totalHasilProyek_3078;
    }
    
    //Method Hitung Gaji
    public int hitungGaji_3078(){
        gaji_3078 = gaji_3078 + (komisi_3078 * totalHasilProyek_3078) - (gaji_3078 * 5/100);
        return gaji_3078;
    }
    
    //Method Cetak Project Planner
    public void cetakProjectPlanner_3078(){
        super.cetakEmployee_3078(); //Pemanggilan method cetak employee menggunakan super
        System.out.println("Komisi             : " + komisi_3078);
        System.out.println("Total hasil Proyek : " + totalHasilProyek_3078);
        System.out.println("Total gaji         : " + hitungGaji_3078());
        System.out.println("");
    }
    
}