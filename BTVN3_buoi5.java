/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvn3_buoi5;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BTVN3_buoi5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int menu;
        do {
            System.out.println("---------------------MENU------------------------");
            System.out.println("|1. Tinh toan                                   |");
            System.out.println("|2. Nhap thong tin ca nhan                      |");
            System.out.println("|3. Tinh tong le                                |");
            System.out.println("|4. Tinh tich chan                              |");
            System.out.println("|5. Thoat                                       |");
            System.out.println("------------------------------------------------");
            System.out.print("Moi ban chon menu: ");
            menu = Integer.valueOf(scan.nextLine());
            switch (menu) {
                case 1: {
                    System.out.println("Moi ban den voi chuong trinh so 1");
                    System.out.print("Moi nhap diem Toan: ");
                    float diemToan = Float.valueOf(scan.nextLine());
                    System.out.print("Moi nhap diem Ly: ");
                    float diemLy = Float.valueOf(scan.nextLine());

                    System.out.print("Moi nhap diem Ly: ");
                    float diemHoa = Float.valueOf(scan.nextLine());

                    float diemTrungBinh = (diemToan + diemLy + diemHoa) / 3;
                    System.out.println("Diem trung binh cua 3 mon toan, ly, hoa la: " + diemTrungBinh);
                    break;
                }
                case 2: {
                    System.out.println("Moi ban den voi chuong trinh so 2");
                    System.out.println("Nhap thong tin vat nuoi");
                    System.out.print("Nhap ma: ");
                    String ma = scan.nextLine();
                    System.out.print("Nhap can nang: ");
                    float canNang = Float.valueOf(scan.nextLine());
                    System.out.print("Nhap chieu cao: ");
                    float chieuCao = Float.valueOf(scan.nextLine());
                    System.out.print("Nhap giong loai: ");
                    String giongLoai = scan.nextLine();
                    System.out.println("In ra thong tin giong loai");
                    System.out.println("Ma: " + ma);
                    System.out.println("Can Nang: " + canNang);
                    System.out.println("Chieu Cao: " + chieuCao);
                    System.out.println("Giong Loai: " + giongLoai);
                    break;
                }
                case 3: {
                    System.out.println("Moi ban den voi chuong trinh so 3");
                    System.out.print("Moi ban nhap so nguyen n: ");
                    int n = Integer.valueOf(scan.nextLine());
                    int sum = 0;
                    for (int i = 1; i < n + 1; i++) {
                        if (i % 2 == 1) {
                            sum += i;
                        }
                    }
                    System.out.println("Tong cua cac so le tu 1- n la: " + sum);
                    break;
                }
                case 4: {
                    System.out.println("Moi ban den voi chuong trinh so 4: ");
                    System.out.print("Moi ban nhap so nguyen n: ");
                    int n = Integer.valueOf(scan.nextLine());
                    int tich = 1;
                    for (int i = 1; i < n + 1; i++) {
                        if (i % 2 == 0) {
                            tich *= i;
                        }
                    }
                    System.out.println("Tich cua cac so chan tu 1- n la: " + tich);
                    break;
                }
                case 5: {
                    System.out.println("Thoat");
                    break;
                }
                default: {
                    System.out.println("Ban chon sai. Moi ban chon lai(1,2,3");
                    break;
                }

            }
        } while (menu != 5);
    }

}
