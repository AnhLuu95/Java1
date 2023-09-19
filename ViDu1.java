/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_KieuDuLieuvaNhapXuat;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ViDu1 {

    // B1: Nhập tên, địa chỉ của bản thân và in ra màn hình
    public static void main(String[] args) {
        //Nhập dữ liệu từ bàn phím
        Scanner menu = new Scanner(System.in);
        System.out.println("Moi ban nhap ten: ");
        String name = menu.nextLine();
        System.out.println("Moi ban nhap dia chi: ");
        String diaChi = menu.nextLine();

        //In dữ liệu ra màn hình:
        System.out.println("Ten: " + name);
        System.out.println("Dia chi: " + diaChi);
    }

}
