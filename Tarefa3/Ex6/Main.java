package Tarefa3.Ex6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(1, 400.0);
        BankAccount otherAccount = new BankAccount(2, 1500.0);
        BankAccount anotherAccount = new BankAccount(3, 4890.0);

        ArrayList<BankAccount> listOfBankAccounts = new ArrayList<>();
        listOfBankAccounts.add(myAccount);
        listOfBankAccounts.add(otherAccount);
        listOfBankAccounts.add(anotherAccount);

        BankAccount greatestBalanceAccount = listOfBankAccounts.get(0);
        for (BankAccount account:listOfBankAccounts) {
            if (account.getBalance() > greatestBalanceAccount.getBalance()) {
                greatestBalanceAccount = account;
            }
        }

        System.out.println("Conta com o maior saldo - Número: " + greatestBalanceAccount.getAccountNumber() +
        ", Saldo: " + greatestBalanceAccount.getBalance());
    }
}