package Itogovie_zadaniya;

import java.util.Arrays;
import java.util.Scanner;

public class Itog2 {
    public static void main(String[] args) {
        String uravnenieStr, strtrim;
        boolean vernoe,tojevernoe;
        int indexplus, indexminus,indexX,indexeq;
        int result = 0;
        int trueresult, resultabs;
        System.out.println("Введите уравнение: ");
        Scanner uravnenie = new Scanner((System.in));
        uravnenieStr = uravnenie.nextLine();

        strtrim = uravnenieStr.trim();
        indexplus = strtrim.indexOf('+');
        indexminus = strtrim.indexOf('-');
        indexX = strtrim.indexOf('x');
        indexeq = strtrim.indexOf('=');
        int ch0 = Character.getNumericValue(strtrim.charAt(0));
        int ch2 = Character.getNumericValue(strtrim.charAt(2));
        int ch4 = Character.getNumericValue(strtrim.charAt(4));
        if((indexeq==3)&(indexplus==1)&(strtrim.length()==5)){
            vernoe=true;
        }
        else if ((indexeq==3)&(indexminus==1)&(strtrim.length()==5)){
            tojevernoe=true;
        }
        else{
            System.out.println("Уравнение не является простым!");
            return;
        }
        if(indexplus==1) {
            if (indexX == 0) {
                result = ch4 - ch2;
                System.out.println("Вывод: " + result);

            } else if (indexX == 2) {
                result = ch4 - ch0;
                System.out.println("Вывод: " + result);

            } else if (indexX == 4) {
                result = ch0 + ch2;
                System.out.println("Вывод: " + result);

            }
        }
        if (indexminus==1) {
            if (indexX == 0) {
                result = ch4 + ch2;
                System.out.println("Вывод: " + result);

            } else if (indexX == 2 & indexminus == 1) {
                result = ch4 - ch0;
                resultabs = Math.abs(result);
                if (result < 0) {
                    trueresult = resultabs;
                    System.out.println("Вывод: " + trueresult);
                }
                else {
                    trueresult = -1 * resultabs;
                    System.out.println("Вывод: " + trueresult);
                }
            }
            else if (indexX == 4 & indexminus == 1) {
                result = ch0 - ch2;
                System.out.println("Вывод: " + result);
            }
        }
    }
}
