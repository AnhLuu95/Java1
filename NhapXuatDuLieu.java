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
public class NhapXuatDuLieu {

    /*
    Trong C nhập dữ liệu từ bàn phím dùng Scanf
    Trong Java nhập dữ liệu từ bàn phím dùng Scaner
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  //  Cú pháp khai báo Scanner
        // Nhập từ bàn phím
        // Có 2 cách để nhập String
        // C1: .next =>Khi gặp khoảng cách thì không đọc được
        // C2: .nextLine => 
        
        //Nhập tên từ bàn phím
        //       System.out.print("Moi ban nhap ten: ");
        //      String name= scan.next();
//     System.out.print("Moi ban nhap ten1: ");
        //      String name1= scan.nextLine();
        //in ra màn hình
        //       System.out.println("Ten1: "+ name);
        //    System.out.println("Ten2: "+ name1);
     
        int number= scan.nextInt();
        float number1= scan.nextFloat();
        double number2= scan.nextDouble();
        long number3= scan.nextLong();
        
        // B1: Nhập tên, địa chỉ, ngành học của bản thân và in ra màn hình
        // B2: Nhập tuổi, cân nặng, chiều cao của bản thân và in ra màn hình
        // B3: Nhập tên, tuổi, địa chỉ, kỳ học và ngành học của nyc và in ra màn hình
    }
}
