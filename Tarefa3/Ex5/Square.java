package Tarefa3.Ex5;

public class Square implements Shape {
    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
    
}