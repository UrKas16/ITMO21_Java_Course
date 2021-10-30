package ITMO_Java_Course;

import java.util.Arrays;

public class ITMO_Java_Les_4 {
    public static void main(String[] args) {
        String a = "Напишите метод, который инвертирует слова в строке. Предполагается, что в строке нет знаков препинания, и слова разделены пробелами.";
        String[] strings = a.split("\\.");
        System.out.println(Arrays.toString(strings));

        }



    //Задание 1.
    public static void longString(String string) {
        String[] array = string.split("\\.");
        String verylongstring;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > array[i+1].length()){
                verylongstring = array[i];
            }
        }
    }
}
