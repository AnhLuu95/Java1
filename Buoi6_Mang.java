/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buoi6_mang;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Buoi6_Mang {

    /**
     * Mảng là tập hợp chứa tất cả các phần tử cùng kiểu chữ
     * Có 2 loại mảng: 
     *  - Mảng cố định (cố định size n): chỉ được cho phép maxping n phần tử
     *  - Mảng động (size là động): không cần quan tâm hay nhập vào size
     * VD: -3, 9, 6, 7 => giá trị của các phần tử trong mảng
     * Vị trí tương ứng: 0, 1, 2, ..., 
     * Vị trí trong mảng luôn luôn bắt đầu bằng 0 và kết thúc là n - 1
     * Mảng:
     * -    giá trị
     * -    vị trí
     * Gía trị ở vị trí đầu tiên: arr[0]
     * Gía trị ở vị trí cuối cùng: arr[n-1]
     * Gía trị ở vị trí i bất kỳ: arr[i]
     */
    
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        // B1: Nhap so luong phan tu trong mang
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n= Integer.valueOf(scan.nextLine());
        // B2: Khai bao mang arr[n]
        int arr[] = new int[n];
        // B3: Nhap phan tu cua mang
        // Cac phan tu trong mang nhap tu ban phim => lap di lap lai
        System.out.println("Moi nhap cac phan tu trong mang: ");
        for (int i = 0; i < n; i++) {
            // Nhap cac so tu ban phim
            System.out.print("arr["+i+"]: ");
            arr[i]= Integer.valueOf(scan.nextLine());
        }
        // B4: In ra man hinh
        System.out.println("In mang ra man hinh");
        for (int i = 0; i < n; i++) {
            System.out.printf(arr[i]+ "\t");
        }
            System.out.println("");
    }
    
}
