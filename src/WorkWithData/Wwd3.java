package WorkWithData;

import java.util.Arrays;
import java.util.Scanner;

public class Wwd3 {
    public static void main(String[] args) {
        String a;
        String str2 = null;
        String str1 = "";
        int s;
        boolean c;
        char[] chars;
        int count=0;
        System.out.println("Введите строку из любых слов. Разделите слова пробелами: ");
        Scanner str = new Scanner((System.in));
        a = str.nextLine();
        //Разбиваем введенную строку на массив слов, разделенных пробелом.
        String[] b = a.split(" ");
        s = b.length;
        String[] mass = new String[s];
        System.out.println("Создан массив из слов :" + Arrays.toString(b));
        /*Для строк из массива начинаем искать совпадения по регулярному выражению. Не понял, почему [a-zA-Z] не работал
        и вписал такой \w\D\S. Поэтому, к сожалению, программа пропустит слово с символом "_"
         */
        for (int i = 0; i <= b.length - 1; i++) {
            str1 = b[i];
                if (str1.matches("\\w\\D\\S")) {
                    str2 += b[i] + " ";
                    count++;
                }
                else{
                    str2= "    Ни одного слова, написанного ТОЛЬКО латиницей";
                            count=0;
                }
            }
        //надо было как-то избавиться от null в строке =)
        System.out.println("Выделяем строку из слов, состоящих только из латинских букв, результат: ");
        System.out.println(str2.substring(4));
        System.out.println(count + " - столько латинских слов ");
        }
    }

