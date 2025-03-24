package com.example.studyjvg.study.Lesson11;

public class MyArrayListEx {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList(10);

        list.add(5);
        list.add(9);
        list.add(8);
        list.add(0,7);

        System.out.println("Size: " + list.size()); // ожидаемый результат 4

        System.out.println(list.get(0)); //ожидаемый результат 7

        System.out.println("Contains 5: " + list.contains(5)); // Ожидаемый результат: true
        System.out.println("Contains 25: " + list.contains(25)); // Ожидаемый результат: false

        list.set(1, 18);
        System.out.println(list.toString());  // ожидаемый результат: storage=[5, 18, 8, 9]

        list.clear();
        System.out.println(list.toString()); // ожидаемый результат: []

        System.out.println("Is list empty: " + list.isEmpty()); // Ожидаемый результат: true





    }
}
