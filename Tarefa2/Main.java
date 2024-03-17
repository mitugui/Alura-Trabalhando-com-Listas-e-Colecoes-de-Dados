import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> listOfProducts = new ArrayList<>();

        Product myProduct = new Product("Smartphone", 1749.99, 21);
        Product otherProduct = new Product("Television", 2198, 27);
        Product anotherProduct = new Product("Smartwatch", 485,32);

        listOfProducts.add(myProduct);
        listOfProducts.add(otherProduct);
        listOfProducts.add(anotherProduct);

        System.out.println(listOfProducts.size());
        System.out.println(listOfProducts.get(2).getName());

        for(Product product:listOfProducts) {
            System.out.println(product);
        }

        PerishableProduct perishableProduct = new PerishableProduct("Produto C", 12.75, 2, "2023-12-31");
        System.out.println(perishableProduct);
    }
}
