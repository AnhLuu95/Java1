/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvn1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BTVN1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // B1: Nhập tên, địa chỉ của bản thân và in ra màn hình
    
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
