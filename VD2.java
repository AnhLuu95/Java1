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
public class VD2 {

    // 2. nhap 1 so nguyen n. Tinh tong cac so nguyen tu 0 - n
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Moi ban nhap so nguyen n: ");
        int n = Integer.valueOf(scan.nextLine());
        int sum = 0;
        for (int i = 0; i < n + 1; i++) {
            sum += i;
        }
        System.out.println("Tong cac so nguyen tu 0 den n la: " + sum);
    }
}
