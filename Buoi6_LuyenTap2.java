/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi6_mang;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Buoi6_LuyenTap2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int menu;
        do {
            System.out.println("---------------------MENU-------------------");
            System.out.println("|1. Thong tin ban than                      |");
            System.out.println("|2. Mang                                    |");
            System.out.println("|0. Thoat                                   |");
            System.out.println("---------------------------------------------");
            System.out.print("Moi ban chon menu: ");
            menu = Integer.valueOf(scan.nextLine());
            switch (menu) {
                case 1: {
                    System.out.println("Moi ban den voi chuong trinh so 1");
                    System.out.println("Nhap thong tin ban than");
                    System.out.print("Nhap ten: ");
                    String ten = scan.nextLine();
                    System.out.print("Nhap tuoi: ");
                    int tuoi = Integer.valueOf(scan.nextLine());
                    System.out.print("Nhap dia chi: ");
                    String diaChi = scan.nextLine();
                    System.out.print("Nhap ky hoc: ");
                    String kyHoc = scan.nextLine();
                    System.out.print("Nhap nganh hoc: ");
                    String nganhHoc = scan.nextLine();
                    System.out.println("In ra thong tin ban than");
                    System.out.println("Ten: " + ten);
                    System.out.println("Tuoi: " + tuoi);
                    System.out.println("Dia chi: " + diaChi);
                    System.out.println("Ky hoc: " + kyHoc);
                    System.out.println("Nganh hoc: " + nganhHoc);
                    break;
                }
                case 2: {
                    System.out.println("Moi ban den voi chuong trinh so 2");
                    System.out.print("Moi nhap so luong phan tu cua mang: ");
                    int n = Integer.valueOf(scan.nextLine());

                    int arr[] = new int[n];
                    System.out.println("Moi nhap gia tri cac phan tu vao trong mang: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print("arr[" + i + "]: ");
                        arr[i] = Integer.valueOf(scan.nextLine());
                    }

                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        sum += arr[i];
                    }
                    System.out.print("Tong cac phan tu trong mang: " + sum);
                    System.out.println("");
                    break;
                }
                case 0: {
                    System.out.println("Thoat");
                    break;
                }

                default: {
                    System.out.println("");
                    break;
                }
            }
        } while (menu != 0);

    }
}
