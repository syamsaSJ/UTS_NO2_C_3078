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

        SalariedEmployee S = new SalariedEmployee("Cinta", 21103078, 3000000);
        CommissionEmployee C = new CommissionEmployee("Andi", 21103078, 3500000, 1000000, 20);
        ProjectPlanner P = new ProjectPlanner("Budi", 2130223, 4000000, 2000000, 120);
        
        System.out.println("== DATA PEGAWAI PERUSAHAAN ==");
        S.cetakSalariedEmployee();
        System.out.println("");
        C.cetakCommisionEmployee();
        System.out.println("");
        P.cetakProjectPlanner();
        System.out.println("");
        
    }
}
