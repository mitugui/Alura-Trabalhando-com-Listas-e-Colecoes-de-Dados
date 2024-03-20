package DesafioFinal.models;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double limit;
    private double balance;
    private List<Purchase> listOfPurchases; 

    public CreditCard(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.listOfPurchases = new ArrayList<>();
    }

    public boolean recordPurchase (Purchase purchase) {
        if (purchase.getValue() > this.balance) {
            return false;
        } else {
            this.balance -= purchase.getValue();
            this.listOfPurchases.add(purchase);
            return true;
        }
    }

    public double getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public List<Purchase> getListOfPurchases() {
        return listOfPurchases;
    }
}