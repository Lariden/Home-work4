package com.alevel.test;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Заполните массив десятью целыми числами");

        int[] num = new int[10];
        for (int i = 0; i < 10; i++){
            num [i] = scanner.nextInt();
        }

        System.out.println("Чтобы отсартировать массив по убыванию или по возрастанию,введи increase,decrease");
        scanner.skip("\\R");

        String requiredValue = scanner.nextLine();
        pinterest(requiredValue, num);
    }
    public static int[] inc(int... mas) {
        for (int i = 0; i < mas.length; i++){
            for(int j = 0; j < mas.length-1; j++){
                if (mas[j] > mas[j+1]) {
                    int swap = mas[j];
                    mas[j] = mas [j+1];
                    mas[j+1] = swap;
                }
            }
        }
        return mas;
    }

    public static int[] dec(int...mas) {
        for (int i = 0; i < mas.length -1; i++) {
            for (int j = 0; j < mas.length-1; j++){
                if (mas[j] < mas[i+1]) {
                    int swap =mas [j];
                    mas[j] = mas[j+1];
                    mas[j+1] = swap;
                }
            }
        }
        return mas;
    }
    public static void pinterest(String request, int[] mas){
        switch (request) {
            case "increase":
                int[] increaseElement = inc(mas);
                System.out.println("По возрастанию "+ Arrays.toString(increaseElement));
                break;
            case "decrease":
                int[] decreaseElement = dec(mas);
                System.out.println("По убыванию " + Arrays.toString(decreaseElement));
                break;
            default:
                System.out.println("Не коректно введено");
                break;
        }

    }

}
