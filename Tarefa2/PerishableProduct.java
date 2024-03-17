public class PerishableProduct extends Product {
    private String expirationDate;

    public PerishableProduct(String name, double price, int quantity, String expirationDate) {
        super(name, price, quantity);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Produto [nome: " + name + ", preço: " + price + ", quantidade: " + quantity + ", data de validade: " + expirationDate + "]";
    }
}