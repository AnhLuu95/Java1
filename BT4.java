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
public class BT4 {

    /*
    B2: Tao 1 menu gom cac chuc nang sau:
        1: Tinh tong cua 2 so nguyen nhap tu ban phim
        2: Nhap tu ban phim thong tin ca nhan cua ban than+ in ra man hinh (ten, tuoi, diaChi)
        3. Thoat
     */
    public static void main(String[] args) {
        System.out.println("------------------------MENU-----------------------");
        System.out.println("|1. Tinh tong cua 2 so nguyen lap tu ban phim     |");
        System.out.println("|2. Thong tin ca nhan                             |");
        System.out.println("|3. Thoat                                         |");
        System.out.println("---------------------------------------------------");
        Scanner scan = new Scanner(System.in);

        System.out.println("Moi ban nhap menu: ");
        int menu = Integer.valueOf(scan.nextLine());
        switch (menu) {
            case 1: {
                System.out.println("Nhap so thu nhat: ");
                int num1 = Integer.valueOf(scan.nextLine());
                System.out.println("Nhap so thu hai: ");
                int num2 = Integer.valueOf(scan.nextLine());
                int sum = num1 + num2;
                System.out.println("Tong cua 2 so nguyen vua nhap: " + sum);
                break;
            }
            case 2: {
                System.out.println("Moi ban nhap thong tin ca nhan ");
                System.out.println("Nhap ten: ");
                String name = scan.nextLine();
                System.out.println("Nhap tuoi: ");
                int age = Integer.valueOf(scan.nextLine());
                System.out.println("Nhap dia chi: ");
                String address = scan.nextLine();
                System.out.println("In ra thong tin ca nhan");
                System.out.println("Ten: " + name);
                System.out.println("Tuoi: " + age);
                System.out.println("Dia chi: " + address);
                break;
            }
            case 3: {
                System.out.println("Thoat");
                break;
            }
            default: {
                System.out.println("Ban chon sai. Moi ban nhap lai(1,2,3)");
                break;
            }
        }
    }
}
