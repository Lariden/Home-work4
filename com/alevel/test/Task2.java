package com.alevel.test;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Замолните массив 10 целыми числами");
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scan.nextInt();


        }
        System.out.println("Ваш массив");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + ", ");
        }
        System.out.println("\nЧтобы узнать минимальное,или максимальное,введите min,max");
        Scanner sc = new Scanner(System.in);
        String getSc = sc.nextLine();
        if (getSc.equals("max")) {
            System.out.println("Максимальный элемент:" + " " + max(mas));
        } else if (getSc.equals("min")) {
            System.out.println("Минимальный элемент:" + " " + min(mas));
        }


    }

    public static int max(int[] mas) {
        int max = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }

        }
        return max;

    }

    public static int min(int[] mas) {
        int min = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
            }
        }
        return min;
    }
}