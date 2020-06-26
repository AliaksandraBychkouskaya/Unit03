package by.tr.mod3;

import java.util.Scanner;

public class Calculator {
    public static void main(String [] args) {

        int a, b, result;
        a = 0;
        b = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Введите первый множитель");
            System.out.print(">");
            while (sc.hasNextInt() == false) {
                System.out.println("Попробуйте снова. Вы ввели не int значение. Введите первый множитель");
                System.out.print(">");
                String str = sc.nextLine();
            }

            a = sc.nextInt();
            sc.nextLine();

            System.out.println("Введите второй множитель");
            System.out.print(">");

            while (sc.hasNextInt() == false) {
                System.out.println("Попробуйте снова. Вы ввели не int значение. Введите второй множитель");
                System.out.print(">");
                String str = sc.nextLine();
            }
            b = sc.nextInt();
            sc.nextLine();
            System.out.println("Чему равно " + a + " * " + b + "?");
            System.out.print(">");
            do {
                while (sc.hasNextInt() == false) {
                    System.out.println("Попробуйте снова. Вы ввели не int значение.");
                    System.out.print(">");
                    String str = sc.nextLine();
                }
                result = sc.nextInt();
                if (result != a * b) {
                    System.out.println("Попробуйте снова. Вы ввели неверное значение");
                    System.out.print(">");
                    String str = sc.nextLine();
                }
            }

            while (result != a * b);

            System.out.println("Верно");
            System.out.println("Введите stop для завершения программы или нажмите Enter для продолжения");
            sc.nextLine();
        }
        while (!sc.nextLine().equals("stop"));
    }
}
// задачи модуля 3 защитаны
