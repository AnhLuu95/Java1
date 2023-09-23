/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi6_mang;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Buoi6_LuyenTap {

    public static void main(String[] args) {
        System.out.println("Moi nhap so luong phan tu cua mang n: ");
        Scanner scan = new Scanner(System.in);
        int n = Integer.valueOf(scan.nextLine());
        int arr[] = new int[n];
        System.out.println("Moi ban nhap gia tri phan tu cho mang: ");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]: ");
            arr[i] = Integer.valueOf(scan.nextLine());
        }
        //1. In phan tu ra man hinh
        System.out.println("In cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + "\t");
        }
        System.out.println("");
        //2. Tinh tong cac phan tu trong mang
        int tong = 0;
        for (int i = 0; i < n; i++) {
            tong += arr[i];
        }
        System.out.println("Tong cac phan tu trong mang = " + tong);
        //3. Tinh tich cac phan tu trong mang
        int tich = 1;
        for (int i = 0; i < n; i++) {
            tich *= arr[i];
        }
        System.out.println("Tich= " + tich);
        //4. Dem xem co bao nhieu phan tu chia het cho 3 o trong mang
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0) {
                count++;
            }
        }
        System.out.println("So luong phan tu chia het cho 3 o trong mang la: " + count);
        //5. Dem xem co bao nhieu phan tu chia het cho 5 va o vi tri le trong mang
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 1 && arr[i] % 5 == 0) {
                count1++;
            }
        }
        System.out.println("So luong phan tu chia het cho 5 va o vi tri le trong mang: " + count1);
        //6. Tinh tong cac phan tu o vi tri chan
        int tong1 = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                tong1 += arr[i];
            }
        }
        System.out.println("Tong cac phan tu o vi tri chan la: " + tong1);
        //7. Tinh tich cac phan tu o vi tri chan ma chia het cho 2
        int tich1 = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && arr[i] % 2 == 0) {
                tich1 *= arr[i];
            }
        }
        System.out.println("Tich cac phan tu o vi tri chan ma chia het cho 2: " + tich1);
        //8. Tim so lon nhat trong mang
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("So lon nhat trong mang: " + max);
        //9. Tim so be nhat trong mang
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("So be nhat trong mang: " + min);
    }

}
