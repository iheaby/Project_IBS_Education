package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner first = new Scanner((System.in));
        System.out.println("Введите первое число:");
        double a = first.nextDouble();
        Scanner second = new Scanner((System.in));
        System.out.println("Введите второе число:");
        double b = second.nextDouble();
        Scanner op = new Scanner((System.in));
        System.out.println("Введите тип арифметической операции:");
        String c = op.nextLine();
        String result = null;
        switch (c){
            case "+" : result= "Результат: " + (a+b);
            break;
            case "/" : result= "Результат: " + (a/b);
                break;
            case "*" : result= "Результат: " + (a*b);
                break;
            case "-" : result= "Результат: " + (a-b);
                break;
            default: result= "Операция не предусмотрена";
        }
        System.out.println(result);
    }
}
