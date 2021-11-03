package ITMO_Java_Course;

import java.util.Arrays;

public class ITMO_Java_Les_4 {
    public static void main(String[] args) {
        String a = "Роман Фрэнка Герберта появился задолго до того, как жанр космооперы стал популярным среди широких масс. " +
                "Книга получила премии «Хьюго» и «Небула» за выдающийся вклад в развитие научной фантастики. " +
                "«Дюна» считается одним из величайших научно-фантастических произведений всех времен и часто упоминается как самый продаваемый роман данного жанра в истории. " +
                "Позднее Герберт написал ряд продолжений, появились экранизация Дэвида Линча и два мини-сериала, компьютерные игры. " +
                "А в 2021 году на большие экраны вышла одноименная картина Дени Вильнева. " +
                "Литературную вселенную «Дюны» расширяли сын писателя Брайан Герберт и Кевин Дж. Андерсон." +
                "Действие романа происходит в далеком будущем, посреди разросшейся феодальной межгалактической империи, где планетарные вотчины контролируются благородными семействами, верными Императорскому дому Коррино." +
                "В центре повествования – молодой Пол Атрейдес, наследник герцога Лето Атрейдеса. " +
                "Семья переезжает на планету Арракис, единственный во вселенной источник пряностей-меланжа. " +
                "Автор создает масштабное полотно, где отображены сложные политические, религиозные, экологические, технологические вопросы. " +
                "Здесь тесно переплетаются судьбы самого Пола, его семьи, коренных жителей Арракиса, Императора, могущественных гильдий и орденов. " +
                "Великое противостояние сильных мира сего ведет к глобальным переменам, которые затронут все человечество.";

        // longString(a);
/*
        String a = "казарма";
        polindromeWorld(a);
*/

        String str = "Великое противостояние сильных мира сего ведет к глобальным переменам, которые затронут все человечество.";
        inversionString(str);


    }


    //Задание 1. Написать метод для поиска самой длинной строки.
    public static void longString(String str) {
        String[] array = str.split("\\.");
        String verylongstring;
        int lineLength = 0;
        int indexOfarray = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > lineLength) {
                lineLength = array[i].length();
                indexOfarray = i;
            }
        }
        System.out.println("Самая длинная строка в тексте это - " + array[indexOfarray] + "\nЕё длинна составляет - " + lineLength + " символов включая пробелы.");
    }

    // Задание 2. Написать метод, который проверяет является ли слово палиндромом.
    public static void polindromeWorld(String str) {
        String str1 = str.toLowerCase();
        String[] poliWorld = str1.split("");
        boolean flag = false;
        int count = 0;
        for (int i = 0; i < poliWorld.length / 2; i++) {
            if (poliWorld[i].equals(poliWorld[poliWorld.length - (i + 1)])) {
                flag = true;
                count++;
            }
        }
        if (flag & count == poliWorld.length / 2) {
            System.out.println("Строка " + "\"" + str + "\"" + " является полиндромом.");
        } else {
            System.out.println("Строка не является полиндромом");
        }

    }

    // Задание 3. Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]».
    public static void censorshipString(String str) {
        String byka = "бяка";
        String censor = "[вырезано цензурой]";
        String done = str.replace(byka, censor);
        System.out.println(done);
    }

    // Задание 4. Найти количество вхождений одной (являющейся подстрокой) в другую.
    public static void searchOfSame(String str, String str1) {
        String temp = str1.replace(str, "");
        int count = (str1.length() - temp.length()) / str.length();
        System.out.println("Количество вхождений подстроки в строку составляет - " + count);
    }

    // Задание 5. Напишите метод, который инвертирует слова в строке.
    public static void inversionString(String str) {
        String[] arrayStr = str.split("");
        String[] newArrayStr = new String[str.length()];
        for (int i = 0; i < arrayStr.length; i++) {
            newArrayStr[newArrayStr.length - (i + 1)] = arrayStr[i];

        }
        for (String i : newArrayStr) {
            System.out.print(i);
        }


    }


}


