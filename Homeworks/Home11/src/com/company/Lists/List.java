package com.company.Lists;

public interface List {
    void addToEnd(Object element);
    void addToBegin(Object element);
    Iterator iterator();
    int size();
    void doReverseList();
    void addByIndex(int index, Object element);
    void deleteByIndex(int index);
    void printList();
}