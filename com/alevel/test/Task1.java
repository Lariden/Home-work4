package com.alevel.test;

import java.util.Scanner;
public class Task1 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите строку на кирилице маленькими буквами!!!");
        String a = scan.nextLine();
        System.out.println(" " + CyrLat(a));
    }

    private static String CyrLat(char ch) {
        switch (ch) {
            case '!':
                return "!";
            case '?':
                return "?";
            case '.':
                return ".";
            case ',':
                return ",";
            case ' ':
                return " ";
            case 'а':
                return "a";
            case 'б':
                return "b";
            case 'в':
                return "v";
            case 'г':
                return "g";
            case 'д':
                return "d";
            case 'е':
                return "e";
            case 'ё':
                return "e";
            case 'ж':
                return "zh";
            case 'з':
                return "z";
            case 'и':
                return "i";
            case 'й':
                return "i";
            case 'к':
                return "k";
            case 'л':
                return "l";
            case 'м':
                return "m";
            case 'н':
                return "n";
            case 'о':
                return "o";
            case 'п':
                return "p";
            case 'р':
                return "r";
            case 'с':
                return "s";
            case 'т':
                return "t";
            case 'у':
                return "u";
            case 'ф':
                return "f";
            case 'х':
                return "h";
            case 'ц':
                return "c";
            case 'ч':
                return "ch";
            case 'ш':
                return "sh";
            case 'щ':
                return "sh";
            case 'ъ':
                return "";
            case 'ы':
                return "i";
            case 'ь':
                return "";
            case 'э':
                return "e";
            case 'ю':
                return "yu";
            case 'я':
                return "ya";
            default:
                return String.valueOf(ch);

        }
    }

    private static String CyrLat(String st) {
        StringBuilder sb = new StringBuilder(st.length() * 2);
        for (char ch : st.toCharArray()) {
            sb.append(CyrLat(ch));
        }
        return sb.toString();
    }
}
