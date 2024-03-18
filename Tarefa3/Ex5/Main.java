package Tarefa3.Ex5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        myCircle.setRadius(5);
        Square mySquare = new Square();
        mySquare.setSide(5);
    
        ArrayList<Shape> listOfShapes = new ArrayList<>();
        listOfShapes.add(myCircle);
        listOfShapes.add(mySquare);

        listOfShapes.forEach(item -> {
            if (item instanceof Circle) {
                System.out.printf("Área do círculo: %.2f\n", item.calculateArea());
            }
            if (item instanceof Square) {     
                System.out.printf("Área do quadrado: %.2f\n", item.calculateArea());           
            }
        });
    }
}