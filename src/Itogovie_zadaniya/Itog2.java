package Itogovie_zadaniya;

import java.util.Arrays;
import java.util.Scanner;

public class Itog2 {
    public static void main(String[] args) {
        String uravnenieStr, strtrim;
        boolean vernoe;
        int indexplus, indexminus,indexX,indexeq;
        int result = 0;
        System.out.println("Введите уравнение: ");
        Scanner uravnenie = new Scanner((System.in));
        uravnenieStr = uravnenie.nextLine();

        strtrim = uravnenieStr.trim();
        indexplus = strtrim.indexOf('+');
        indexminus = strtrim.indexOf('-');
        indexX = strtrim.indexOf('x');
        indexeq = strtrim.indexOf('=');

        if((indexeq==3)&(indexplus==1)&(strtrim.length()==5)){
            vernoe=true;
        }
        else if ((indexeq==3)&(indexminus==1)&(strtrim.length()==5)){
            vernoe=true;
        }
        else{
            System.out.println("Уравнение не является простым!");
        }
        if (vernoe=true&indexX==0&indexplus==1){
            result = result + (uravnenieStr.indexOf(4) - uravnenieStr.indexOf(2));
            System.out.println("Вывод: " + result);

        }
        else if (vernoe==true&indexX==2&indexplus==1) {
            result = Integer.valueOf(strtrim.indexOf(4)) - Integer.valueOf(strtrim.indexOf(0));
            System.out.println("Вывод: " + result);

        }

        else if (vernoe==true&indexX==4&indexplus==1) {
            result = Integer.valueOf(strtrim.indexOf(0)) + Integer.valueOf(strtrim.indexOf(2));
            System.out.println("Вывод: " + result);

        }

        else if (vernoe==true&indexX==0&indexminus==1) {
            result = Integer.valueOf(strtrim.indexOf(4)) + Integer.valueOf(strtrim.indexOf(2));
            System.out.println("Вывод: " + result);

        }

        else if (vernoe==true&indexX==2&indexminus==1) {
            result =  (-1)*(Integer.valueOf(strtrim.indexOf(4)) - Integer.valueOf(strtrim.indexOf(2)));
            System.out.println("Вывод: " + result);

        }

        else if (vernoe==true&indexX==4&indexminus==1) {
            result = Integer.valueOf(strtrim.indexOf(0)) - Integer.valueOf(strtrim.indexOf(2));
            System.out.println("Вывод: " + result);

        }
    }
}
