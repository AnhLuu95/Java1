/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi4_ReNhanh;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BT2 {
    // B2: Nhap vao 1 so, kiem tra so >5 hay =5 hay <5

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Moi ban nhap so: ");
        int number = Integer.valueOf(scan.nextLine());
        int number1 = number - 5;
        if (number1 < 0) {
            System.out.println("So vua nhap < 5");
        } else if (number1 == 0) {
            System.out.println("So vua nhap = 5");
        } else {
            System.out.println("So vua nhap > 5");
        }
        
    }
}
