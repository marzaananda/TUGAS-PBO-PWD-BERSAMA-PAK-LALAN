/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        System.out.println("silahkan masukan tahun lahir mu");

        int tahun;

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        tahun = input.nextInt();
        if (tahun % 4 == 0) {
            System.out.println("tahun " + tahun + " adalah kabisat");
        } else {
            System.out.println("bukan kabisat");
        }
    }
}
