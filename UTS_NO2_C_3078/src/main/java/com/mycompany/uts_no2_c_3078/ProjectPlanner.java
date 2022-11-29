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

public class ProjectPlanner extends Employee{
    
    int komisi, totalHasilProyek;
    
    public ProjectPlanner(String nama, int nip, int gaji, int komisi, int totalHasilProyek){
        super(nama, nip);
        this.komisi = komisi;
        this.totalHasilProyek = totalHasilProyek;
    }
    
    public int hitungGaji(){
        gaji = gaji + (komisi * totalHasilProyek) - (5/100 * gaji);
        return gaji;
    }
    
    public void cetakProjectPlanner(){
        super.cetakEmployee();
        System.out.println("Komisi             : " + komisi);
        System.out.println("Total hasil Proyek : " + totalHasilProyek);
        System.out.println("Total gaji         : " + hitungGaji());
    }
}
