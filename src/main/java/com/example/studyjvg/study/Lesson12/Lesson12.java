package com.example.studyjvg.study.Lesson12;

import java.util.Arrays;

public class Lesson12 {
    public int length;
    private int[] storage;
    private int size;

    public Lesson12(int capacity) {
        this.storage = new int[capacity];
        this.size = 0;
    }
    private void grow() {
        int newCapacity = (storage.length * 3) / 2 + 1; // Увеличиваем на 1.5x
        storage = Arrays.copyOf(storage, newCapacity);
    }

    public void add(int value) {
        if (size == storage.length) {
            grow();
        }
        storage[size++] = value;
    }

    public static void quickSort(Lesson12 list, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(list, begin, end);
            quickSort(list, begin, partitionIndex - 1);
            quickSort(list, partitionIndex + 1, end);
        }
    }

    private static int partition(Lesson12 list, int begin, int end) {
        int pivot = list.get(end); // Берём опорный элемент
        int i = begin - 1;

        for (int j = begin; j < end; j++) {
            if (list.get(j) <= pivot) {
                i++;
                swapElements(list, i, j);
            }
        }

        swapElements(list, i + 1, end);
        return i + 1;
    }

    private static void swapElements(Lesson12 list, int left, int right) {
        int temp = list.get(left);
        list.set(left, list.get(right));
        list.set(right, temp);
    }

    public int get(int index) {
        checkIndex(index);
        return storage[index];
    }

    public int set(int index, int value) {
        checkIndex(index);
        int oldValue = storage[index];
        storage[index] = value;
        return oldValue;
    }

    @Override
    public String toString() {
        return "Lesson12{" +
                "storage=" + Arrays.toString(storage) +
                ", size=" + size +
                '}';
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
    }

    public int size() {
        return size;
    }
}
