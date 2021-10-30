package ITMO_Java_Course;

import java.util.Arrays;

public class Algorithm {
    public static void main(String[] args) {
/*
        int[] myArray = new int[10];
        int max = 20;
        int min = -20;
        boolean result = false;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * (max - min) + min);
        }
        System.out.print(Arrays.toString(myArray));
*/

        int[] myArray1 = createArray(10,20, 20);
        System.out.println(Arrays.toString(myArray1));

        int sumPlus = sumPlusArray(myArray1);

        System.out.println(sumPlus);
    }

    public static int[] createArray(int lengtharray, int max, int min){
        int[] myArray = new int[lengtharray];
        int updep = max; //верхний предел числа в массиве
        int downdep = min * (-1); // нижний предел числа в массиве
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * (updep - downdep) + downdep);
        }
        return myArray;
    }

    public static int[] createArray(int lengtharray, int range){
        int[] myArray = new int[lengtharray];
        int max = range;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * max);
        }
        return myArray;
    }


    public static int sumPlusArray(int[] array){
        int sumPlus = 0;
        for (int j : array) {
            if (j > 0) {
                sumPlus += j;
            }
        }
        return sumPlus;
    }


}
