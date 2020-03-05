package by.tr.mod3;

import java.util.Scanner;

public class Converter {
    public static void main (String [] args){
        double value, result;
        result = 0;
        String from,to;
        double kBynEur, kBynUsd, kEurByn, kUsdByn, kUsdEur,kEurUsd;
        kEurByn = 2.49;
        kUsdByn = 2.24;
        kBynEur = 0.40;
        kBynUsd = 0.45;
        kEurUsd = 1.11;
        kUsdEur = 0.9;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите исходную валюту. Возможные значения: BYN, USD, EUR");
        from = sc.next();
        while (!from.toLowerCase().equals("byn") && !from.toLowerCase().equals("usd") && !from.toLowerCase().equals("eur"))
        {
            System.out.println("Вы ввели некорректное значение. Попробуйте снова. Возможные значения: BYN, USD, EUR");
            from = sc.next();
        }
        System.out.println("Введите итоговую валюту. Возможные значения: BYN, USD, EUR");
        to = sc.next();
        while (!to.toLowerCase().equals("byn") && !to.toLowerCase().equals("usd") && !to.toLowerCase().equals("eur"))
        {
            System.out.println("Вы ввели некорректное значение. Попробуйте снова. Возможные значения: BYN, USD, EUR");
            to = sc.next();
        }
        System.out.println("Введите сумму");
        while (sc.hasNextDouble()==false){
            String str;
            str = sc.next();
            System.out.println("Вы ввели неверное/нечисловое значение суммы, попробуйте снова");
        }
        value = sc.nextDouble();
        if (from.toLowerCase().equals("byn") && to.toLowerCase().equals("usd")){
            result = kBynUsd * value;
        }
        if (from.toLowerCase().equals("byn") && to.toLowerCase().equals("eur")){
            result = kBynEur * value;
        }
        if (from.toLowerCase().equals("usd") && to.toLowerCase().equals("byn")){
            result = kUsdByn * value;
        }
        if (from.toLowerCase().equals("usd") && to.toLowerCase().equals("eur")){
            result = kUsdEur * value;
        }
        if (from.toLowerCase().equals("eur") && to.toLowerCase().equals("usd")){
            result = kEurUsd * value;
        }
        if (from.toLowerCase().equals("eur") && to.toLowerCase().equals("byn")){
            result = kEurByn * value;
        }
        if (from.toLowerCase().equals(to.toLowerCase())) {
            result = value;
        }
        System.out.println("Результат перевода "+ from.toUpperCase() + " в "+ to.toUpperCase() + " = " + result);

    }
}