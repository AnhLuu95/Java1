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
public class ViDu2 {

    // B2: Nhập điểm toán, lý, hóa của bản thân và in ra màn hình
    public static void main(String[] args) {
        // Nhap du lieu tu ban phim
        Scanner scan = new Scanner(System.in);
        System.out.println("Moi ban nhap diem Toan: ");
        float diemToan = scan.nextFloat();
        System.out.println("Moi ban nhap diem Ly: ");
        float diemLy = scan.nextFloat();
        System.out.println("Moi ban nhap diem Hoa: ");
        float diemHoa = scan.nextFloat();

        // IN du lieu ra man hinh
        System.out.println("Tuoi: " + diemToan);
        System.out.println("Diem Ly: " + diemLy);
        System.out.println("Diem Hoa: " + diemHoa);

    }
}
