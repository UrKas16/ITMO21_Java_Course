package ITMO_Java_Course;


import java.util.Scanner;

public class ITMO_Java_Les_1 {

    public static void main(String[] args) {

        System.out.println("Я \nхорошо \nзнаю \nJava.");

        double a = 46, b = 10, c = 3;
        double result = (a + b) * (b / c);
        System.out.println(result);

        int number = 10500;
        int divResult = (number / 10) / 10;
        System.out.println(divResult);

        double x = 3.6, y = 4.1, z = 5.9;
        double mulResult = x * y * z;
        System.out.println(mulResult);

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = in.nextInt();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

      //  Scanner in = new Scanner(System.in);

        System.out.print("Введите ваше число: ");
        int numInput = in.nextInt();

        if (numInput % 2 == 0 & numInput > 100) {
            System.out.println("Выход за пределы диапозона");
        } else if (numInput % 2 == 0) {
            System.out.println("Ваше число " + numInput + " - Четное");
        } else {
            System.out.println("Ваше число " + numInput + " - Нечентное");
        }


    }
}
