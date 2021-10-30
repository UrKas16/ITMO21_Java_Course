package ITMO_Java_Course;

import java.util.Arrays;
import java.util.Scanner;

public class ITMO_Java_Les_3 {
    public static void main(String[] args) {
//        int[] array = Algorithm.createArray(10, 10);
//        System.out.println(Arrays.toString(array));

        int[] array1 = new int[]{1, 2, 1, 3, 1, 2, 4, 4, 3};

//        changePlacesOfArray(array);

//        sortArray(array);

//        handMadeArray();

//        uniNum(array1);

        numOfFib(20);

    }

    // Задание 1.
    public static void sortArray(int[] array) {
        int count = 0;
        for (int i = 0; i <= array.length - 2; i++) {
            if (array[i] <= array[i + 1]) {
                count += 1;
            } else {
                System.out.println("Try again!!!");
                break;
            }
        }
        if (count == array.length - 1) {
            System.out.println("OK");
        }
    }

    // Задание 2
    public static void handMadeArray() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.print("Введите числа массива: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("Result: " + Arrays.toString(array));
    }

    // Задание 3
    public static void changePlacesOfArray(int[] array) {
        int first = array[0];
        int last = array[array.length - 1];
        array[0] = last;
        array[array.length - 1] = first;
        System.out.println(Arrays.toString(array));
    }

    // Задание 4
    public static void uniNum(int[] array) {
        int count = 0;
        for (int a : array) {
            for (int j : array) {
                if (a == j) {
                    count += 1;
                }
            }
            if (count == 1) {
                System.out.println("Первое уникальное число в массиве: " + a);
                break;
            } else {
                count = 0;
            }
        }
        if (count == 0) {
            System.out.println("Уникальных значений в массиве нет.");
        }

    }

    // Задание 5
    public static void numOfFib(int length) {
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a);
        for (int i = 0; i <= length; i++) {
            c = a;
            a = b;
            b += c;
            System.out.print(" " + a);
        }
    }

    // Задание 6
    public static void sortOfSlip(int[] array){

    }

    // Задпние 7
    public static void numOfK(int[] array, int x){


    }

}