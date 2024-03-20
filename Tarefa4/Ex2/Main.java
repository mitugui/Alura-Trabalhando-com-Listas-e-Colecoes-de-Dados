package Tarefa4.Ex2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Tittle myTittle = new Tittle("Past Lives", 2023);
        Tittle otherTittle = new Tittle("La La Land", 2016);
        Tittle anotherTittle = new Tittle("The First Slum Dunk", 2022);
    
        ArrayList<Tittle> tittleList = new ArrayList<>();
        tittleList.add(myTittle);
        tittleList.add(otherTittle);
        tittleList.add(anotherTittle);

        System.out.println("Lista antes de ordenar: " + tittleList);
        Collections.sort(tittleList);
        System.out.println("Lista após ordenar: " + tittleList);
    }
}
