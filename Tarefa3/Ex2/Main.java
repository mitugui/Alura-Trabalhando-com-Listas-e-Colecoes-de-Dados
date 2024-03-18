package Tarefa3.Ex2;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Scooby-Doo");
        
        Animal myAnimal = (Animal) myDog;

        if (myAnimal instanceof Dog) {
            System.out.println(myAnimal.getName());
        }
    }
}
