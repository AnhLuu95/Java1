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
public class BTVN1_7 {
    // Nhập vào 1 số nguyên và kiểm tra đó có phải là số lẻ chia hết cho 5 không?

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Moi ban nhap so nguyen n: ");
        int number = scan.nextInt();
        if (number % 5 == 0 && number % 2 == 1) {
            System.out.printf("So nguyen %d la so le chia het cho 5", number);
        } else {
            System.out.println("So nguyen khong thoa man");
        }
    }
}
