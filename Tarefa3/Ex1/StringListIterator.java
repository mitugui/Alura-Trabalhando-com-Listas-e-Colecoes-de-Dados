package Tarefa3.Ex1;

import java.util.ArrayList;

public class StringListIterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("banana");
        list.add("apple");
        list.add("grape");

        // for (String item : list) {
        //     System.out.println(item);
        // }

        list.forEach(item -> System.out.println(item));

        // list.forEach(System.out::println);
    }
}
