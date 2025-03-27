package com.example.studyjvg.study.Lesson10;

import java.util.LinkedList;
import java.util.List;


public class StringListEx implements StringList {

    LinkedList<String> listEx = new LinkedList<>();



    @Override
    public String add(String item) {
        listEx.add(item);
        return listEx.getLast();
    }

    @Override
    public String add(int index, String item) {
        if (index < 0 || index > listEx.size()) {
            throw new IndexOutOfBoundsException("Индекс выходит за границы списка");
        } else {
            listEx.add(index, item);
        }
        return listEx.get(index);
    }

    @Override
    public String set(int index, String item) {
        if (index < 0 || index > listEx.size()) {
            throw new IndexOutOfBoundsException("Индекс выходит за границы списка");
        } else {
            listEx.set(index, item);
        }
        return listEx.get(index);
    }

    @Override
    public String remove(String item) {
        if (!listEx.contains(item)) {
            throw new RuntimeException("Элемент '" + item + "' не найден в списке");
        }
        listEx.remove(item);
        return item;
    }

    @Override
    public String remove(int index) {
        if (index < 0 || index >= listEx.size()) {
            throw new IndexOutOfBoundsException("Индекс выходит за границы списка");
        }
        return listEx.remove(index);
    }

    @Override
    public boolean contains(String item) {
        return listEx.contains(item);
    }

    @Override
    public int indexOf(String item) {
        return listEx.indexOf(item);
    }

    @Override
    public int lastIndexOf(String item) {
        return listEx.lastIndexOf(item);

    }

    @Override
    public String get(int index) {
        if (index < 0 || index >= listEx.size()) {
            throw new IndexOutOfBoundsException("Индекс выходит за границы списка");
        }
        return listEx.get(index);
    }

    @Override
    public int size() {
        return listEx.size();
    }

    @Override
    public boolean isEmpty() {
        return listEx.isEmpty();
    }

    @Override
    public void clear() {
        listEx.clear();
    }

    @Override
    public String[] toArray() {
        return listEx.toArray(new String[listEx.size()]);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof List) {
            return this.listEx.equals(obj);
        }
        return false;
    }
}
