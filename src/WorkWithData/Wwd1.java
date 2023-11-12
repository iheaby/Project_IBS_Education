package WorkWithData;

import java.util.Scanner;
/*
1. В п.1 и п.2 задачи не уточнено, какой тип данных мы вводим с клавиатуры. Я выбрал double.
2.  Так как в задаче в пункте 3 не уточнено, что за числа сравнивать, то здесь представлено решение как я его поняk изначально.
    То есть, сохранив введенные с клавиатуры числа в переменные, мы работаем и сравниваем то, что сохранено в переменных,
    а НЕ изначальные значения.
    Если нужно сравнивать изначальные числа после ввода с консоли, особенно если вводятся дробные числа, то ниже
    закомментированно и представлено альтернативное решение.

    ВВОДИТЬ ДРОБНЫЕ ЧИСЛА С ПОМОЩЬЮ ЗАПЯТОЙ ","!!!!!
 */
public class Wwd1 {
    public static void main(String[] args) {
        String a = null;
        int b = 0;
        double c =0;
        System.out.println("Введите первое число: ");
        Scanner first = new Scanner((System.in));
        if (first.hasNextDouble()) {
           a = Double.toString(first.nextDouble());
        }
        double c1 = Double.parseDouble(a);
        System.out.println("Введите второе число: ");
        Scanner second = new Scanner((System.in));
        if (second.hasNextDouble()) {
            b = (int) second.nextDouble();
        }
        System.out.println("Большее число: " + Math.max(b, c1));
        // Конвентируем минимальное значение в double и выводим на консоль
        System.out.println("Меньшее число: " + Math.min((double) b,(double) c1));
//        String a = null;
//        int b = 0;
//        double c = 0;
//        double c1 = 0;
//        System.out.println("Введите первое число: ");
//        Scanner first = new Scanner((System.in));
//        if (first.hasNextDouble()) {
//           c = first.nextDouble();
//        }
//        //Записываем в строковую переменную первое число
//        a = Double.toString(c);
//        System.out.println("Введите второе число: ");
//        Scanner second = new Scanner((System.in));
//        if (second.hasNextDouble()) {
//            c1 = second.nextDouble();
//        }
//        // Сохраняем введенное число в целочисленную переменную int b
//        b = (int) c1;
//        System.out.println("Строковое представление первого числа: " + a + "\nЦелочисленное представление второго числа: " + b);
//        System.out.println("Большее число: " + Math.max(c, c1));
//        // Конвентируем минимальное значение в double ( из double =) )
//        System.out.println("Меньшее число: " + Math.min((double) c,(double) c1));
    }
}