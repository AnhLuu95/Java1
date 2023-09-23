/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi5_OnTap;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Menu_Lap {

    /*
    Xay dung menu gom co cac chuc nang sau:
Menu lap lai toi khi chon 3 thi dung
1. Nhap vao 2 so nguyen duong, tinh thuong cua 2 so nguyen day
2. Nhap vao ten, tuoi, dia chi cua ban than va in ra man hinh
3. Thoat
     */
    public static void main(String[] args) {

        System.out.println("---------------------MENU----------------------");
        System.out.println("|1. Tinh toan                                   |");
        System.out.println("|2. Thong tin                                  |");
        System.out.println("|3. Thoat                                      |");
        System.out.println("------------------------------------------------");
        Scanner scan = new Scanner(System.in);
        int menu;
        do {
            System.out.print("Moi ban chon menu: ");
            menu = Integer.valueOf(scan.nextLine());
            switch (menu) {
                case 1: {
                    System.out.println("Moi ban den voi chuong trinh so 1");
                    System.out.print("Moi nhap so thu nhat: ");
                    int num1 = Integer.valueOf(scan.nextLine());
                    System.out.print("Moi nhap so thu hai: ");
                    int num2 = Integer.valueOf(scan.nextLine());
                    float thuong = (float)num1 / num2;
                    System.out.println("Thuong cua 2 so la: " + thuong);
                    break;
                }
                case 2: {
                    System.out.println("Moi ban den voi chuong trinh so 2");
                    System.out.println("Nhap thong tin ban than");
                    System.out.print("Nhap ten: ");
                    String name = scan.nextLine();
                    System.out.print("Nhap tuoi: ");
                    int age = Integer.valueOf(scan.nextLine());
                    System.out.print("Nhap dia chi: ");
                    String address = scan.nextLine();
                    System.out.println("In ra thong tin ban than");
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
                    System.out.println("Ban chon sai. Moi ban chon lai(1,2,3");
                    break;
                }

            }
        } while (menu != 3);

    }
}
