package Itogovie_zadaniya;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Itog1 {
    public static void main(String[] args) {
        double kurs, rub, result, stresult,roundedresult;
        int indtochki;
        System.out.println("Введите курс доллара: ");
        Scanner kursd = new Scanner((System.in));
        kurs = kursd.nextDouble();
        System.out.println("Введите количество рублей для конвертации: ");
        Scanner rubli = new Scanner((System.in));
        rub = rubli.nextDouble();
        result = rub/kurs;
        roundedresult = Math.round(result * 100.0) / 100.0;
        System.out.println("Курс доллара: " +kurs + "\nКоличество рублей: "+ rub + "\nИтого: "+ roundedresult);

    }
}
