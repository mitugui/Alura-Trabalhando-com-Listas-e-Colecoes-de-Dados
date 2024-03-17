package Tarefa1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person me = new Person("Mitugui", 19);
        Person cousin = new Person("Richie", 45);
        Person uncle = new Person("Bob", 72);

        ArrayList<Person> listOfPersons = new ArrayList<>();

        listOfPersons.add(me);
        listOfPersons.add(cousin);
        listOfPersons.add(uncle);

        System.out.println("Tamanho da lista: " + listOfPersons.size());
        System.out.println("Primeira pessoa da lista: " + listOfPersons.get(0).getName());
        
        for (Person person : listOfPersons) {
            System.out.println(person);
        }
    }   
}
