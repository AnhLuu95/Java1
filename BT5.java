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
public class BT5 {

    public static void main(String[] args) {
        /*
        Tạo 1 menu và thực hiện các chức năng sau.

        1. Nhập tên, tuổi, địa chỉ, ngành học, trường học, kỳ học của bàn thân từ bàn phím và in ra màn hình

        2. Nhập vào 2 số từ bàn phím. Tính tổng, hiệu tích thương của 2 số đấy.

        0. Thoát
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("--------------------------MENU------------------------");
        System.out.println("|1. Thong tin sinh vien                               |");
        System.out.println("|2. Tinh tong, hieu, tich, thuong                     |");
        System.out.println("|3. Thoat                                             |");
        System.out.println("-------------------------------------------------------");
        System.out.println("Moi ban chon menu: ");
        int menu = Integer.valueOf(scan.nextLine());
        switch (menu) {
            case 1: {
                System.out.println("Moi ban nhap thong tin sinh vien");
                System.out.println("Nhap ten: ");
                String name = scan.nextLine();
                System.out.println("Nhap tuoi: ");
                int age = Integer.valueOf(scan.nextLine());
                System.out.println("Nhap dia chi: ");
                String address = scan.nextLine();
                System.out.println("Nhap nganh hoc: ");
                String nganhHoc = scan.nextLine();
                System.out.println("Nhap truong hoc: ");
                String truongHoc = scan.nextLine();
                System.out.println("Nhap ky hoc: ");
                String kyHoc = scan.nextLine();
                System.out.println("In thong tin sinh vien");
                System.out.println("Ten: " + name);
                System.out.println("Tuoi: " + age);
                System.out.println("Dia chi: " + address);
                System.out.println("Nganh hoc: " + nganhHoc);
                System.out.println("Truong hoc: " + truongHoc);
                System.out.println("Ky hoc: " + kyHoc);
                break;
            }
            case 2: {
                System.out.println("Moi ban nhap so thu nhat: ");
                int num1 = Integer.valueOf(scan.nextLine());
                System.out.println("Moi ban nhap so thu hai: ");
                int num2 = Integer.valueOf(scan.nextLine());
                int tong = num1 + num2;
                int hieu = num1 - num2;
                int tich = num1 * num2;
                int thuong = num1 / num2;
                System.out.println("Tong: " + tong);
                System.out.println("Hieu: " + hieu);
                System.out.println("Tich: " + tich);
                System.out.println("Thuong:" + thuong);
                break;
            }
            case 0: {
                System.out.println("Thoat");
                break;
            }
            default: {
                System.out.println("Ban nhap sai. Moi ban nhap lai(1,2,0)");
                break;
            }

        }

    }
}
