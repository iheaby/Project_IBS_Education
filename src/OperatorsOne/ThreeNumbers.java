package OperatorsOne;

import java.util.Scanner;

public class ThreeNumbers {
    public static void main (String[] args) {
        // вводим первое число x
        Scanner inx = new Scanner((System.in));
            System.out.println("Введите x:");
            int x = inx.nextInt();

        // вводим второе число y
        Scanner iny = new Scanner((System.in));
            System.out.println("Введите y:");
            int y = iny.nextInt();

        // вводим третье число z
        Scanner inz = new Scanner((System.in));
            System.out.println("Введите Z:");
            int z = inz.nextInt();

        //создаем массив, с помощью которого будем считать сумму элементов и их кол-во для подсчета ср. арифм
            double[] mass = {x, y, z};
        //собираем сумму значений массива
            double result = 0;
            for (double a : mass) {
            result += a;
            }
        double ans = 0;
        ans = result/mass.length; //подсчитали ср. арифметическое
        System.out.println("Среднее арифметическое: " + ans);
        double g= ans/2;
        g = Math.floor(g); //округлили в меньшую сторону
        if (g>mass.length){
            System.out.println("Программа выполнена корректно");
        }
        //добавил, чтоб выводилось что-то, если условие не выполнится
        else
            System.out.println("Результат последней операции меньше, либо равен 3");
    }
}
