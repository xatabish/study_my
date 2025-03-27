package com.example.studyjvg.study.Lesson12;

public class Lesson12Ex {
    public static void main(String[] args) {
        Lesson12 list = new Lesson12(4);
        list.add(512);
        list.add(623);
        list.add(22);
        list.add(3243);
        list.add(923);
        System.out.println(list.toString()); // ожидаемыый результат: [512, 623, 22, 3243, 923, 0, 0] size=5 (((4*3)/2)+1)=7 ячеек [] , т.е увеличили в 1.5 раза)))

        list.quickSort(list ,0,list.size() - 1);

        System.out.println(list); // ожидаемый результат: [22, 512, 623, 923, 3243, 0, 0], size=5


    }




}
