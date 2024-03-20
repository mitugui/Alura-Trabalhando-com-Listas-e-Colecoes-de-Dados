package Tarefa4.Ex1;

import java.util.ArrayList;
import java.util.Collections;

public class SortNumbersList {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();

        numbersList.add(5);
        numbersList.add(8);
        numbersList.add(2);
        numbersList.add(1);

        Collections.sort(numbersList);

        System.out.println(numbersList);
    }
}