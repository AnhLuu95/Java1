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
public class BTVN1_5 {

    // Nhập vào 1 số nguyên và kiểm tra xem đó là số chăn hay lẻ?
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Moi ban nhap so nguyen n: ");
        int soNguyen = number.nextInt();
        if (soNguyen % 2 == 0) {
            System.out.printf("So nguyen %d la so chan", soNguyen);
        } else {
            System.out.printf("So nguyen %d la so le", soNguyen);
        }
    }
}
