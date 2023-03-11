/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2;

/**
 *
 * @author M3400QA
 */

import java.util.Scanner;

public class KelasInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Nama : ");
        Person p = new Person();
        p.setName(sc.nextLine());
        System.out.println("Nama Anda Adalah "+p.getName());
    }
    
    
}
