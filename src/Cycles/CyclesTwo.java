package Cycles;

import java.util.Scanner;

public class CyclesTwo {
    public static void main(String[] args){
        System.out.println("Введите любое целое положительное число:");
        Scanner num = new Scanner((System.in));
        int number = num.nextInt();
        int summ = 0;
        /*Я понял задачу так, что если введенное число нечетное, то его тоже считаем в сумму.
        Если это не так и последнее нечетное число не считаем, то в условии цикла for нужно поменять "<=" на "<"
         */
        for (int i=1; i<=number;i++){
            if (i%2!=0){
                summ = summ + i;
            }
        }
        System.out.println("Сумма всех нечетных чисел до " + number + " (включая его, если оно нечетное) равна " + summ);
    }
}
