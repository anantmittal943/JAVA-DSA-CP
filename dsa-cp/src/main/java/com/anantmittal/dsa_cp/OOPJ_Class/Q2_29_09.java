package com.anantmittal.dsa_cp.OOPJ_Class;

import java.util.Scanner;

public class Q2_29_09 {
    public static void main(String[] args) {
        System.out.println("1. Menu\n2. Book Pizza\n3. Payment\n4. Exit");
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("1. pizza_1\n2. pizza_2\n3. pizza_3\n4. pizza_4\n");
                break;
            case 2:
                System.out.println("Book Pizza");
                break;
            case 3:
                System.out.println("Payments");
                System.out.println("try multi line");
                break;
            case 4:
            default:
                break;
        }
        sc.close();
    }
}
