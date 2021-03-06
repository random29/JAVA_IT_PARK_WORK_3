package com.company.Lists;

public interface List<T> {
    void addToEnd(LinkedList<T> element);
    void addToBegin(LinkedList<T> element);
    Iterator iterator();
    int size();
    void doReverseList();
    void addByIndex(int index, LinkedList<T> element);
    void deleteByIndex(int index);
//    void printList();
}