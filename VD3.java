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
public class VD3 {

    // VD3. nhap 1 so nguyen n. Tinh tich cac so nguyen tu 1 - n
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Moi ban nhap so nguyen n: ");
        int n = Integer.valueOf(scan.nextLine());
        int TICH = 1;
        for (int i = 1; i < n + 1; i++) {
            TICH *= i;
        }
        System.out.println("Tich cua cac so nguyen tu 1 den n la: " + TICH);
    }
}
