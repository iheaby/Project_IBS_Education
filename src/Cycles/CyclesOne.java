package Cycles;

import java.util.Arrays;
import java.util.Scanner;

public class CyclesOne {
    public static void main (String[] args){
        final double X = 10;
        final double Y = 15;
        final double Z = 16;
        int count =0;
        String comparison = null;
        System.out.println("Задайте размер массива:");
        Scanner v = new Scanner((System.in));
        int volume = v.nextInt();
        double[] mass = new double[volume];
        //чтобы красиво выглядело
        System.out.println("Заполните массив из " + volume + " ячеек данными:");
        int a = 0;
        for (a =0; a<= mass.length-1; a++){
            Scanner element = new Scanner((System.in));
            double value = element.nextDouble();
            mass[a]= value;
            if (value==X||value==Y||value==Z){
                //чтобы красиво выглядело
                comparison = "Ячейка " + a + " заполнена значением " + value + " - Данное значение имеется в константах";
                //добавил, чтобы подсчитать, сколько всего совпадений в итоге
                count++;
            }
             else {
                //чтобы красиво выглядело
                comparison = "Ячейка " + a + " заполнена значением " + value;
            }
            System.out.println(comparison);
        }
        //чтобы красиво выглядело
        System.out.println("Массив создан: " + Arrays.toString(mass) + " . Элементов, совпавших с константами: " + count);
    }
}
