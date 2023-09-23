/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi5_OnTap;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class VD1 {
    
    public static void main(String[] args) {
        // VD1. nhap 1 so nguyen n. In cac so tu 0 - n
        Scanner scan= new Scanner(System.in);
        System.out.print("Moi ban nhap so nguyen n: ");
        int n= Integer.valueOf(scan.nextLine());
        
        for (int i = 0; i < n+1; i++) {
            System.out.println(i);
        }
            
        }
        
}
