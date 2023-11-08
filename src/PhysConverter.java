import java.util.Scanner;

public class PhysConverter {
    public static void main(String[] args){
        Scanner type = new Scanner((System.in));
        System.out.println("Выберите, что переводить:\n 1 - Масса \n 2 - Расстояние \n Введите номер варианта:");
        Double a = type.nextDouble();
        if (a==1) {
            System.out.println("Выберите единицу измерения :\n 1 - Килограммы \n 2 - Фунты \n 3 - Унции \n 4 - Пуды \n Введите номер варианта:");
        }
        else {
            System.out.println("Выберите единицу измерения :\n 1 - Метры \n 2 - Мили \n 3 - Ярды \n 4 - Футы \n Введите номер варианта:");
        }
        Scanner measure = new Scanner((System.in));
        double b = measure.nextDouble();
        System.out.println("Введите количество единиц перевода:");
        Scanner value = new Scanner((System.in));
        double c = 0;
        c = value.nextDouble();
        String result = null;
        double[] mass = {a,b};
        if (a==1 & b==1){
            result = "Килограммы: " + (c*1) + "\n Фунты: " + (c*2.205) + "\n Унции: " + (c*35.27) + "\n Караты: " + (c*5000);
        }
        else if (a==1 & b==2){
            result = "Килограммы: " + (c*0.4536) + "\n Фунты: " + (c*1) + "\n Унции: " + (c*16) + "\n Караты: " + (c*2268);
        }
        else if (a==1 & b==3){
            result = "Килограммы: " + (c*0.02835) + "\n Фунты: " + (c*0.0625) + "\n Унции: " + (c*1) + "\n Караты: " + (c*141.7);
        }
        else if (a==1 & b==4){
            result = "Килограммы: " + (c*0.0002) + "\n Фунты: " + (c*0.0004409) + "\n Унции: " + (c*0.007055) + "\n Караты: " + (c*1);
        }
        else if (a==2 & b==1){
            result = "Метры: " + (c*1) + "\n Мили: " + (c*0.0006214) + "\n Ярды: " + (c*1.094) + "\n Футы: " + (c*3.281);
        }
        else if (a==2 & b==2){
            result = "Метры: " + (c*1609) + "\n Мили: " + (c*1) + "\n Ярды: " + (c*1760) + "\n Футы: " + (c*5280);
        }
        else if (a==2 & b==3){
            result = "Метры: " + (c*0.9144) + "\n Мили: " + (c*0.0005682) + "\n Ярды: " + (c*1) + "\n Футы: " + (c*3);
        }
        else if (a==2 & b==4){
            result = "Метры: " + (c*0.3048) + "\n Мили: " + (c*0.0001894) + "\n Ярды: " + (c*0.3333) + "\n Футы: " + (c*1);
        }
        else {
            result = "Выбрано значение не из списка";
        }
        System.out.println(result);
    }
}

