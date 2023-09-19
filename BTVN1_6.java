/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BTVN1_6 {
    // Nhập vào 1 số nguyên n và tính tổng từ 1 tới n

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Moi ban nhap so nguyen n: ");
        int number = scan.nextInt();
        int sum = 0;
        int i;
        for (i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("Tong la:" + sum);

    }
}
