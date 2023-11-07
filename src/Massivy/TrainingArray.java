package Massivy;

public class TrainingArray {
    public static void main (String[] arg) {

    int[] mass = new int[5];
    mass[0] = 1;
    mass[1] = 2;
    mass[2] = 3;
    mass[3] = 4;
    mass[4] = 5;
    int first = mass[0];
    int last = mass[mass.length - 1];
    int middle = mass[mass.length - 3];
    int d = last;
    last = first;
    first = d;

        System.out.println("Сумма первого и среднего элемента: " + (first+middle));
    }
}