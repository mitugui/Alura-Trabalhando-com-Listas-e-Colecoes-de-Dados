package Tarefa4.Ex4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PolymorphicList {
    public static void main(String[] args) {
        List<String> polymorphicList;

        polymorphicList = new ArrayList<>();
        polymorphicList.add("Elemento 1");
        polymorphicList.add("Elemento 2");
        polymorphicList.add("Elemento 3");
        System.out.println("ArrayList: " + polymorphicList);
        
        polymorphicList = new LinkedList<>();
        polymorphicList.add("Elemento A");
        polymorphicList.add("Elemento B");
        polymorphicList.add("Elemento C");
        System.out.println("LinkedList: " + polymorphicList);
    }
}