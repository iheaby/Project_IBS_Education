package Itogovie_zadaniya;

import java.util.Scanner;

public class Itog3 {
    public static void main(String[] args) {
        int n, max,c;
        char[] chars;
        System.out.println("Введите количество строк");
        Scanner kolvostr = new Scanner(System.in);
        n = kolvostr.nextInt();
        String[] b = new String[n];
        Scanner stroki = new Scanner(System.in);
        for (int i = 0; i < b.length; i++) {
            System.out.println("Введите строку №" + (i + 1));
            b[i] = stroki.nextLine();
            //превращаем строку в массив символов
            chars = b[i].toCharArray();
            for (int j = 0; j <= chars.length - 1; j++) {
                //надо как-то просуммировать совпадающие значения, чтоб затем сравнить суммы разных строк и выявить наименьшую

                }
        }
    }
}
