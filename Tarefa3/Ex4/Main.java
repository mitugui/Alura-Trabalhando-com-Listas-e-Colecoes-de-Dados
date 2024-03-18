package Tarefa3.Ex4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> listOfProducts = new ArrayList<>();

        Product smartphone = new Product("Samsung Galaxy S24", 5299.0);
        Product rice = new Product("Arroz Bunitinho 1 kg", 5.99);
        Product water = new Product("Água 1L", 4.0);

        listOfProducts.add(smartphone);
        listOfProducts.add(rice);
        listOfProducts.add(water);

        double pricesSum = 0;

        for (Product item : listOfProducts) {
            pricesSum += item.getPrice();
        }
        
        double totalPrice = pricesSum / listOfProducts.size();

        System.out.printf("Preço médio dos produtos: %.2f", totalPrice);
    }
}