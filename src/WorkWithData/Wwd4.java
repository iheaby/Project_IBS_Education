package WorkWithData;

import java.util.Arrays;
import java.util.Random;

public class Wwd4 {
    public static void main(String[] args){
        int[] mass = new int[15];
        Random random = new Random();
        int max = -20;
        int min = 20;
        for (int i = 0; i <= mass.length - 1; i++){
            mass[i]= (int) (Math.random()*(40+1) -20);
            if (mass[i] > max) {
                max = mass[i];
            } else if (mass[i]<min) {
                min = mass[i];
            }
        }
        int mod_max = Math.abs(max);
        int mod_min = Math.abs(min);
        System.out.println("Массив: " + Arrays.toString(mass));
        System.out.println("Максимальный элемент: " + max + "\nМинимальный элемент: " + min);
        System.out.println("Наибольшее по модулю: "+ Math.max(mod_max,mod_min));
    }
}
