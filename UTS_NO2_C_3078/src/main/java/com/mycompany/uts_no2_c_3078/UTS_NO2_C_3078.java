/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no2_c_3078;

/**
 * @author Syamsa Shahira Julyinda
 * NIM : 21103078
 * KELAS : S1SI-05-C
 */

public class UTS_NO2_C_3078 {

    public static void main(String[] args) {

        //Perujukan instance kelas ke instance lain
        SalariedEmployee_3078 S_3078;
        CommissionEmployee_3078 C_3078;
        ProjectPlanner_3078 P_3078;
        
        //Pembuatan objek dan pengisian data melalu konstruktor
        S_3078 = new SalariedEmployee_3078("Adi Sucipto", 20201212, 1000000);
        C_3078 = new CommissionEmployee_3078("Andi Fernanda", 20191313, 3500000, 100000, 20);
        P_3078 = new ProjectPlanner_3078("Budi Fernandes", 20181414, 3600000, 200000, 25);
        
        //Pemanggilan data pegawai dari setiap kelas
        System.out.println("\n===== DATA PEGAWAI PERUSAHAAN =====");
        
        System.out.println("\n----- Salaried Employee -----");
        S_3078.cetakSalariedEmployee_3078();
        
        System.out.println("----- Commission Employee -----");
        C_3078.cetakCommisionEmployee_3078();
        
        System.out.println("----- Project Planner -----");
        P_3078.cetakProjectPlanner_3078();
        
    }
    
}