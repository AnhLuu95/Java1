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
public class BTVN1_3 {

    public static void main(String[] args) {
        // Nhập vào tên, ngành học, địa chỉ, quê quán của bản thân và in ra màn hình
        Scanner scan = new Scanner(System.in);
        System.out.println("Moi ban nhap ten: ");
        String name = scan.nextLine();
        System.out.println("Moi ban nhap nganh hoc: ");
        String nganhHoc = scan.nextLine();
        System.out.println("Moi ban nhap dia chi: ");
        String diaChi = scan.nextLine();
        System.out.println("Moi ban nhap que quan: ");
        String queQuan = scan.nextLine();
        // In dữ liệu ra màn hình
        System.out.println("Ten: " + name);
        System.out.println("Nganh hoc: " + nganhHoc);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Que quan: " + queQuan);
    }
}
