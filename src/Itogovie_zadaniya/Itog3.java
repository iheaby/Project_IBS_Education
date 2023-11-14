package Itogovie_zadaniya;

import java.util.Arrays;
import java.util.Scanner;

public class Itog3 {
    public static void main(String[] args) {

        int n = 0;
        String a;
        int max = 0;
        String[] b;
        String p = null;
        String s;
        char[] bykv = new char[0];
        //Ввод количества строк с клавиатуры
        System.out.println("Введите количество строк");
        Scanner kolvo = new Scanner(System.in);
        n = kolvo.nextInt();
        String[] mass = new String[n];
        Scanner stroki = new Scanner(System.in);
        for (int i = 0; i < mass.length; i++) {
            System.out.println((i + 1) + " строка для ввода");
            a = stroki.nextLine();
            mass[i] = a;
//            b = a.split("\n");
//            b[i] = p;
//            for (int j =0; j<mass[i].length();j++){
//
//                bykv[j] = p.toCharArray();
//            }
//        }
            System.out.println(Arrays.toString(mass));
//        System.out.println(Arrays.toString(bykv));

        }
    }
}