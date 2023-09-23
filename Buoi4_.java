/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buoi4_ReNhanh;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Buoi4_ {

    /**
     * if(dieu kien 1){ 
     *      Code 
     * }else if(dieu kien 2){
     *      Code 
     * }else{
     *      Code 
     * }
     */
    public static void main(String[] args) {
        // B1: nhap vao 1 so, kiem tra so chan hay le

        Scanner scan = new Scanner(System.in);
        System.out.println("Moi ban nhap so: ");
        int number = Integer.valueOf(scan.nextLine());
        if (number % 2 == 0) {
            System.out.println("La So chan");
        } else {
            System.out.println("La So le");
        }
    }
}
