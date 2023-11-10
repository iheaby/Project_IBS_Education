package Cycles;

import java.util.Arrays;
import java.util.Scanner;
//!!Важно!! Дробные числа (double) вводить в консоль только через ","!
public class CyclesThree {
    public static void main(String[] args) {
        double sr_arif = 0;
        double result = 0;
        double value = 0;
        System.out.println("Задайте размер массива:");
        Scanner v = new Scanner((System.in));
        int volume = v.nextInt();
        double[] mass = new double[volume];
        System.out.println("Заполните массив из " + volume + " ячеек данными:");
        int a = 0;
        for (a = 0; a <= mass.length - 1; a++) {
            Scanner element = new Scanner((System.in));
            if(element.hasNextDouble()) {
                value = element.nextDouble();
                mass[a] = value;
                result += value;
            }
            System.out.println("Элемент добавлен" + "\nМассив дополнен: " + Arrays.toString(mass));
        }
        sr_arif = result / volume;
        System.out.println("\nСреднее арифметическое: " + sr_arif + "\nЭлементы массива,умноженные на среднее арифметическое: ");
        for (a = 0; a <= mass.length - 1; a++) {
            mass[a] = mass[a] * sr_arif;
        }
        System.out.println(Arrays.toString(mass));
    }
}