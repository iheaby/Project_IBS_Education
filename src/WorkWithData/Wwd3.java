package WorkWithData;

import java.util.Arrays;
import java.util.Scanner;

public class Wwd3 {
    public static void main(String[] args) {
        String a, str2;
        String str1 = null;
        boolean c;
        char[] chars;
        // строка, со значениями которой будем сравнивать и разбиваем на массив
        String charSet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
        char[] comp = charSet.toCharArray();
        System.out.println("Введите строку из любых слов. Разделите слова пробелами: ");
        Scanner str = new Scanner((System.in));
        a = str.nextLine();
        //Разбиваем введенную строку на массив слов, разделенных пробелом.
        String[] b = a.split(" ");
        System.out.println("Создан массив из слов :" + Arrays.toString(b));
        for (int i = 0; i <= b.length - 1; i++) {
            //создаем массив char[] chars из букв элемента-слова массива b
            chars = b[i].toCharArray();
            //проверяем, являются ли элементы массива буквами
            for (int j = 0; j <= chars.length - 1; j++) {
                c = Character.isLetter(chars[j]);
                for (int h = 0; h <= comp.length - 1; h++) {
                    while (c = true) {
                        if (chars[j] == comp[h]) {
                            str1 += String.valueOf(chars[j]);
                        }
                    }
                }
                b[i] = str1;
                System.out.println("Создан массив из букв :" + Arrays.toString(b));
            }
        }
    }
}