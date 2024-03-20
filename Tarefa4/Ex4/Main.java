package Tarefa4.Ex4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listArrayList = new ArrayList<>();
        listArrayList.add("Elemento 1");
        listArrayList.add("Elemento 2");
        listArrayList.add("Elemento 3");
        
        List<String> listLinkedList = new LinkedList<>();
        listLinkedList.add("Elemento A");
        listLinkedList.add("Elemento B");
        listLinkedList.add("Elemento C");

        System.out.println(listArrayList);
        System.out.println(listLinkedList);
    }
}
