/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvn2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BTVN2 {

    /*
    
     */
    public static void main(String[] args) {
        System.out.println("--------------------------------MENU------------------------------");
        System.out.println("|1. Tinh toan                                                     |");
        System.out.println("|2. Nhap thong tin ca nhan                                        |");
        System.out.println("|3. Kiem tra hoc luc                                              |");
        System.out.println("|4. Kiem tra so                                                   |");
        System.out.println("|5. Tinh tong                                                     |");
        System.out.println("|6. Tinh tich                                                     |");
        System.out.println("|7. Tinh tong le                                                  |");
        System.out.println("|8. Thoat                                                         |");
        System.out.println("-------------------------------------------------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Moi ban chon menu: ");
        int menu = Integer.valueOf(scan.nextLine());
        switch (menu) {
            case 1: {
                System.out.println("Moi ban den voi chuong trinh so 1");
                System.out.print("Nhap so thu nhat: ");
                float num1 = Float.valueOf(scan.nextLine());
                System.out.print("Nhap so thu hai: ");
                float num2 = Float.valueOf(scan.nextLine());
                System.out.print("Nhap so thu ba: ");
                float num3 = Float.valueOf(scan.nextLine());
                float tong = num1 + num2 + num3;
                float hieu = num1 - num2 - num3;
                float tich = num1 * num2 * num3;
                float thuong = Float.valueOf(num1 / num2 / num3);
                System.out.println("In tong, hieu, tich thuong cua 3 so vua nhap tren la: ");
                System.out.println("Tong: " + tong);
                System.out.println("Hieu: " + hieu);
                System.out.println("Tich: " + tich);
                System.out.println("Thuong: " + thuong);
                break;
            }

            case 2: {
                System.out.println("Moi ban den voi chuong trinh so 2");
                System.out.println("Moi ban nhap thong tin sinh vien");
                System.out.println("Nhap ten: ");
                String name = scan.nextLine();
                System.out.println("Nhap tuoi: ");
                int age = Integer.valueOf(scan.nextLine());
                System.out.println("Nhap que quan: ");
                String queQuan = scan.nextLine();
                System.out.println("Nhap can nang: ");
                float canNang = Float.valueOf(scan.nextLine());
                System.out.println("Nhap ky hoc: ");
                String kyHoc = scan.nextLine();
                System.out.println("Nhap chuyen nganh: ");
                String chuyenNganh = scan.nextLine();
                System.out.println("Nhap so nha: ");
                int soNha = Integer.valueOf(scan.nextLine());
                System.out.println("Nhap ten phuong: ");
                String tenPhuong = scan.nextLine();
                System.out.println("Nhap ten xa: ");
                String tenXa = scan.nextLine();
                System.out.println("Nhap dia chi: ");
                String diaChi = scan.nextLine();

                System.out.println("In thong tin sinh vien");
                System.out.println("Ten: " + name);
                System.out.println("Tuoi: " + age);
                System.out.println("Que quan: " + queQuan);
                System.out.println("Can nang: " + canNang);
                System.out.println("Ky hoc: " + kyHoc);
                System.out.println("Nganh hoc: " + chuyenNganh);
                System.out.println("So nha: " + soNha);
                System.out.println("Ten phuong: " + tenPhuong);
                System.out.println("Ten xa: " + tenXa);
                System.out.println("Dia chi: " + diaChi);
                break;
            }

            case 3: {
                System.out.println("Moi ban den voi chuong trinh so 3");
                System.out.println("Nhap diem toan: ");
                float diemToan = Float.valueOf(scan.nextLine());
                System.out.println("Nhap diem ly: ");
                float diemLy = Float.valueOf(scan.nextLine());
                System.out.println("Nhap diem hoa: ");
                float diemHoa = Float.valueOf(scan.nextLine());
                float diemTrungBinh = (diemToan + diemLy + diemHoa) / 3;
                System.out.println("Diem Trung Binh cua 3 mon la: " + diemTrungBinh);
                if (diemTrungBinh > 0 && diemTrungBinh < 5) {
                    System.out.println("Hoc luc yeu");
                } else if (diemTrungBinh < 7) {
                    System.out.println("Hoc luc trung binh");
                } else if (diemTrungBinh < 8) {
                    System.out.println("Hoc luc kha");
                } else if (diemTrungBinh < 9) {
                    System.out.println("Hoc luc gioi");
                } else if (diemTrungBinh < 10) {
                    System.out.println("Hoc luc xuat sac");
                } else {
                    System.out.println("Ban nhap sai. Moi ban nhap lai");
                }
                break;
            }

            case 4: {
                System.out.println("Moi ban den voi chuong trinh so 4");
                System.out.println("Moi ban nhap so nguyen n: ");
                int number = Integer.valueOf(scan.nextLine());
                if (number % 2 == 1 && number % 3 == 0) {
                    System.out.println("La so le va chia het cho 3");
                } else {
                    System.out.println("Moi ban nhap lai so nguyen khac");
                }
                break;
            }

            case 5: {
                System.out.println("Moi ban den voi chuong trinh so 5");
                System.out.println("Moi ban nhap so nguyen n: ");
                int n = Integer.valueOf(scan.nextLine());
                int i;
                int sum = 0;
                for (i = 0; i <= n; i++) {
                    sum = sum + i;
                }
                System.out.println("Tong cac so tu 0 den n la: " + sum);
                break;
            }

            case 6: {
                System.out.println("Moi ban den voi chuong trinh so 6");
                System.out.println("Moi ban nhap so nguyen n: ");
                int n = Integer.valueOf(scan.nextLine());
                int i;
                int TICH = 1;
                for (i = 1; i <= n; i++) {
                    TICH = TICH * i;
                }
                System.out.println("Tich cac so tu 1 den n la: " + TICH);
                break;
            }

            case 7: {
                System.out.println("Moi ban den voi chuong trinh so 7");
                System.out.println("Moi ban nhap n: ");
                int n = Integer.valueOf(scan.nextLine());
                int i;
                int tongSoLe = 0;
                for (i = 0; i <= n; i++) {
                    if (i % 2 == 1) {
                        tongSoLe = tongSoLe + i;
                    }
                }
                System.out.println("Tong cac so le tu 0 den n la: " + tongSoLe);
                break;
            }
            case 8: {
                System.out.println("Thoat");
                break;
            }

            default: {
                System.out.println("Ban chon sai. Moi ban chon lai(1,2,3,4,5,6,7,8)");
                break;
            }

        }
    }

}
