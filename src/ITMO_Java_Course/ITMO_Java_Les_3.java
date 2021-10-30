package ITMO_Java_Course;

//import java.lang.reflect.Array;

import java.util.Arrays;
//import java.util.Scanner;

public class ITMO_Java_Les_3 {
    public static void main(String[] args) {
//        int[] array = Algorithm.createArray(10, 10);
//        System.out.println(Arrays.toString(array));

        int[] array1 = new int[]{1, 3, 1, 1, 3, 3, 3};

//        changePlacesOfArray(array);

//        sortArray(array);

//        handMadeArray();

//        uniNum(array1);

//        numOfFib(20);

        numOfK(array1, 2);

    }

    // Задание 1.
/*
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
*/

    // Задание 7*** Дан массив и число K. Найдите первые K самых часто встречающихся элементов.
    public static void numOfK(int[] array, int x) {
        System.out.println(Arrays.toString(array));
        int[] arrayCount = new int[x];
        int[] arrayNum = new int[x];
        int count = 0;
        int num = 0;
        int findNum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int k : array) {
                if (array[i] == k) {
                    num += 1;
                }
            }
            for (int j = 0; j <= i; j++) { // сюда приходит первая 3
                if (num > arrayCount[j]) {
                    int tmpNum = arrayCount[j];
                    arrayCount[j] = num;
                    arrayCount[j + 1] = tmpNum;
                    arrayNum[j + 1] = arrayNum[j];
                }
                arrayNum[j] = array[i];
            }
            num = 0;
        }
        System.out.println(Arrays.toString(arrayNum));
        System.out.println(Arrays.toString(arrayCount));
    }
}

