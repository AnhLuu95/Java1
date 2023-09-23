/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn3_buoi5;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BT2_Mang {

    /*
    *
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("So luong phan tu cua mang: ");
        int n = Integer.valueOf(scan.nextLine());
        int[] a = new int[n];
        // 1. Nhap cac phan tu vao mang
        System.out.println("Nhap phan tu cho mang: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu a[" + i + "]:");
            a[i] = Integer.valueOf(scan.nextLine());
        }
        // 2. In cac phan tu ra man hinh
        System.out.println("Mang da nhap la: ");
        for (int i = 0; i < n; i++) {
            System.out.println("" + a[i]);
        }
        // 3. Tinh tich cua cac phan tu o vi tri le
        int tich = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                tich *= a[i];
            }
        }
        System.out.println("Tich = " + tich);
        // 4. Dem xem co bao nhieu phan tu la so nguyen am trong mang
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                count++;
            }
        }
        System.out.println("So phan tu la so nguyen am trong mang la: " + count);
        // 5. Tinh tong cac phan tu o vi tri chan ma chia het cho 3
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                sum += a[i];
            }
        }
        System.out.println("Tong la: " + sum);
    }
}
