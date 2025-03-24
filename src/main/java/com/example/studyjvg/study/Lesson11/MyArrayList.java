package com.example.studyjvg.study.Lesson11;

import java.util.Arrays;

public class MyArrayList {
    private int[] storage;
    private int size;

    public MyArrayList(int capacity) {
        this.storage = new int[capacity];
        this.size = 0;
    }

    public void add(int value) {
        if (size == storage.length) {
            resizeArray();
        }
        storage[size++] = value;
    }

    public void add(int index, int value) {
        checkIndex(index);
        if (size == storage.length) {
            resizeArray();
        }
        for (int i = size; i > index; i--) {
            storage[i] = storage[i - 1];
        }
        storage[index] = value;
        size++;
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

    public int removeForIndex(int index) {
        checkIndex(index);
        int removedValue = storage[index];

        for (int i = index; i < size - 1; i++) {
            storage[i] = storage[i + 1];
        }
        storage[size - 1] = 0;
        size--;
        return removedValue;
    }

    public int removeForValue(int value) {
        for (int i = 0; i < size; i++) {
            if (storage[i] == value) {
                int removedValue = storage[i];
                shiftStorageLeft(i);
                return removedValue;
            }
        }
        throw new IllegalArgumentException("Value not found in storage");
    }

    private void shiftStorageLeft(int startIndex) {
        for (int i = startIndex; i < size - 1; i++) {
            storage[i] = storage[i + 1];
        }
        storage[size - 1] = 0;
        size--;
    }

    public boolean contains(int value) {
        return binarySearch(value) >= 0;
    }

    public int binarySearch(int value) {
        int left = 0, right = size - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (storage[mid] == value) {
                return mid;
            } else if (storage[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (storage[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(int value) {
        for (int i = size - 1; i >= 0; i--) {
            if (storage[i] == value) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof MyArrayList otherList)) return false;
        if (this.size != otherList.size) return false;
        for (int i = 0; i < size; i++) {
            if (storage[i] != otherList.storage[i]) return false;
        }
        return true;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            storage[i] = 0; // Обнуляем элементы
        }
        size = 0; // Обнуляем размер списка
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
    }

    private void resizeArray() {
        int newCapacity = (storage.length == 0) ? 10 : storage.length * 2;
        int[] newStorage = new int[newCapacity];
        System.arraycopy(storage, 0, newStorage, 0, size);
        storage = newStorage;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "storage=" + Arrays.toString(storage) +
                ", size=" + size +
                '}';
    }


}
