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
public class BTVN1_4 {

    // Nhập vào tên, tuổi, địa chỉ của bản thân và in ra màn hình
    public static void main(String[] args) {
        //Nhập dữ liệu từ bàn phím
        Scanner scan = new Scanner(System.in);
        System.out.println("Moi ban nhap ten: ");
        String name = scan.nextLine();
        System.out.println("Moi ban nhap tuoi: ");
        int tuoi = scan.nextInt();
        scan.nextLine();
        System.out.println("Moi ban nhap dia chi: ");
        String diaChi = scan.nextLine();
        //In dữ liệu ra màn hình:
        System.out.printf("Ten: %s Tuoi: %d Dia chi: %s", name, tuoi, diaChi);

        // System.out.println("Tuoi: " + tuoi);
        // System.out.println("Dia chi: " + diaChi);
    }
}
