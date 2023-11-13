package Itogovie_zadaniya;

import java.util.Scanner;

public class Itog4 {
    public static void main(String[] args) {
        String otvet = null;
        String podskazka = "Подсказка: Что-то, что ты скачиваешь с торрента";
        boolean trueOtvet;
        int popitka = 0;
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        Scanner vvodOtveta = new Scanner(System.in);
        while (popitka<3) {
            otvet = vvodOtveta.nextLine();
            trueOtvet = otvet.equalsIgnoreCase("Заархивированный вирус");
            if (otvet.equalsIgnoreCase("Подсказка")) {
                System.out.println(podskazka);
                popitka = 2;
            }else if (trueOtvet) {
                System.out.println("Правильно!");
                break;
            } else if (popitka<2){
                System.out.println("Подумай еще!");
                popitka++;
            }else{
                System.out.println("Обидно, приходи в другой раз");
                break;
            }
        }
    }
}

