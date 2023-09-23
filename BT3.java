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
public class BT3 {

    // int, String => Truyen ten bien kieu so nguyen hoac ky tu
    // Switch(ten_bien){
    // case gia_tri_1:{
    //      Code
    //      break;
    // }
    // case gia_tri_2: {
    //      Code
    //      break;
    // }
    //...
    // default: {
    //   break;
    // }
    //  }
    public static void main(String[] args) {
        /*
        B1: Nhap vao 1 thang kieu so nguyen
        Kiem tra day la thang nao trong nam
        B2: Tao 1 menu gom cac chuc nang sau:
        1: Tinh tong cua 2 so nguyen nhap tu ban phim
        2: Nhap tu ban phim thong tin ca nhan cua ban than+ in ra man hinh (ten, tuoi, diaChi)
        3. Thoat
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Moi ban nhap thang: ");
        int thang = Integer.valueOf(scan.nextLine());
        switch (thang) {
            case 1: {
                System.out.println("Day la thang 1");
                break;
            }
            case 2: {
                System.out.println("Day la thang 2");
                break;
            }
            case 3: {
                System.out.println("Day la thang 3");
                break;
            }
            case 4: {
                System.out.println("Day la thang 4");
                break;
            }
            case 5: {
                System.out.println("Day la thang 5");
                break;
            }
            case 6: {
                System.out.println("Day la thang 6");
                break;
            }
            case 7: {
                System.out.println("Day la thang 7");
                break;
            }
            case 8: {
                System.out.println("Day la thang 8");
                break;
            }
            case 9: {
                System.out.println("Day la thang 9");
                break;
            }
            case 10: {
                System.out.println("Day la thang 10");
                break;
            }
            case 11: {
                System.out.println("Day la thang 11");
                break;
            }
            case 12: {
                System.out.println("Day la thang 12");
                break;
            }
            default: {
                System.out.println("Khong phai thang trong nam");
                break;
            }

        }
    }
}
