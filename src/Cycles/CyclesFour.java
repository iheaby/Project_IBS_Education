package Cycles;

import java.util.Arrays;
import java.util.Scanner;

public class CyclesFour {
    public static void main(String[] args){
        int i,j;
        System.out.println("Задайте размер матрицы по строкам:");
        Scanner n = new Scanner((System.in));
        i = n.nextInt();
        System.out.println("Задайте размер матрицы по столбцам:");
        j = n.nextInt();
        double[][] matrix = new double[i][j];
        System.out.println("Ваш массив для заполнения: " + Arrays.deepToString(matrix));
        System.out.println("Заполните матрицу данными:");
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[i].length; j++) {
                System.out.print("Введите элемент матрицы [" + i + "][" + j + "]:");
                Scanner m = new Scanner((System.in));
                if(m.hasNextDouble()){
                    matrix[i][j] = m.nextDouble();
                }
                System.out.println("Массив: " + Arrays.deepToString(matrix));
            }
        }
        double[] first = matrix[0];
        for (int a = 0; a <= first.length - 1; a++) {
            first[a] = first[a] * 3;
        }
        System.out.println("\nПервая строка массива, умноженная на 3: " + Arrays.toString(first));
    }
}
