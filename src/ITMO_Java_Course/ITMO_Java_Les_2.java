package ITMO_Java_Course;

import java.util.Scanner;

public class ITMO_Java_Les_2 {
    public static void main(String[] args) {
        // 1. Напишите программу, которая выводит на консоль нечетные числа от 1 до 99. Каждое число печатается с новой строки.

/*
         for (int i = 0; i < 100; i++) {
             if (i % 2 != 0) {
                System.out.println(i);
              }
         }
*/

        // 2. Напишите программу, которая выводит числа от 1 до 100, которые делятся на 3, 5 и на то и другое (то есть и на 3 и на 5).

/*
        String threeFive = "Делится на 3 и на 5: ", numThree = "Делится только на 3: ", numFive = "Делится только на 5: ", numberI;
        for (int i = 1; i < 100; i++) {
            if (i % 15 == 0) {
                numberI = Integer.toString(i);
                threeFive += numberI + ", ";
            } else if (i % 3 == 0) {
                numberI = Integer.toString(i);
                numThree += numberI + ", ";
            } else if (i % 5 == 0) {
                numberI = Integer.toString(i);
                numFive += numberI + ", ";
            }
        }
        System.out.println(numThree + "\n" + numFive + "\n" + threeFive);
*/


/*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = in.nextInt();

        boolean sumNumtrue = sumOfNum(num1, num2, num3);
        System.out.print("Результат: " + sumNumtrue);

        boolean maxOfNum = maxOfNum(num1, num2, num3);
        System.out.print("Результат: " + maxOfNum);
*/

        // 5. Напишите программу, чтобы проверить, является ли число 3 как первый или последний элемент массива целых чисел.
        int[] myArray = new int[7];
        int max = 4;
        boolean result = false;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * max);
            System.out.print(myArray[i] + "\t");
        }

        boolean threeInArray = trueArray(myArray);
        System.out.print("\n" + threeInArray);

        boolean onrOrThree = oneOrThree(myArray);
        System.out.println("\n" + onrOrThree);


    }

    public static boolean trueArray(int[] array) {
        return array[0] == 3 || array[array.length - 1] == 3;
    }

    public static boolean oneOrThree(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1 || array[i] == 3){
                return true;
            }
        }
        return false;

    }




    // 3. Напишите программу, чтобы вычислить сумму двух целых чисел и вернуть true, если сумма равна третьему целому числу. Пример вывода:
/*
    public static boolean sumOfNum(int numOne, int numTwo, int numThree) {
        return numOne + numTwo == numThree;
    }

    // 4. Напишите программу, которая принимает от пользователя три целых числа и возвращает true, если второе число больше первого числа, а третье число больше второго числа.
    public static boolean maxOfNum(int numOne, int numTwo, int numThree) {
        return numTwo > numOne && numThree > numTwo;
    }

*/

}
