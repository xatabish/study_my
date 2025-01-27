package com.example.studyjvg.study.Example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListsExample {

    public static void main(String[] args) {

        //                                      Задание 1
        //   Напишите код, с помощью которого можно напечатать только нечетные числа в консоль.
        //   Код должен работать с любой последовательностью и объемом списка чисел.
        //   В качестве отладочной информации можете использовать список чисел:


        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer number : nums) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }


        //                                       Задание 2
        //  Напишите код, с помощью которого можно напечатать только четные числа без повторений
        //  в порядке возрастания. Код должен работать с любой последовательностью и объемом списка чисел.
        //  В качестве отладочной информации можете использовать список чисел:


        List<Integer> nums2 = new ArrayList<>(List.of(1, 8, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println("   ");
        List<Integer> nums3 = new ArrayList<>();
        for (int i = 0; i < nums2.size() - 1; i++) {

            if (nums2.get(i) % 2 == 0 && nums2.get(i + 1) != nums2.get(i)) {

                nums3.add(nums2.get(i));
            }
        }
        Collections.sort(nums3);
        System.out.println(nums3);
        System.out.println("   ");

        //                                       Задание 3
        // Напишите код, который выводит в консоль все уникальные слова из списка слов,
        // в котором могут встречаться дубли. Код должен работать с любой последовательностью
        // и объемом списка слов.
        // В качестве отладочной информации возьмите произвольный набор слов или текст,
        // в котором встречаются повторения.

        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        List<String> stringsRes = new ArrayList<>(List.of());
        stringsRes.add(strings.get(0));
        for (int i = 0; i < strings.size(); i++) {
            if (!stringsRes.get(stringsRes.size() - 1).equals(strings.get(i))) {
                stringsRes.add(strings.get(i));
            }
        }
        System.out.println(stringsRes);
        System.out.println();


        //                                       Задание 4
        //Напишите код, который выводит в консоль количество дублей для каждого уникального слова.
        // Код должен работать с любой последовательностью и объемом списка слов.
        //В качестве отладочной информации используйте:

        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        List<String> stringsss = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        for (String wordss : stringsss) {
            if (wordss.equals("три")) {
                number1++;

            } else if (wordss.contains("два")) {
                number2++;

            } else if (wordss.contains("один")) {
                number3++;

            }
        }
        System.out.println(number1 + "  " + number2 + "   " + number3);


    }

}

