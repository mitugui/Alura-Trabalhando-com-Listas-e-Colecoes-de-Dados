package DesafioFinal.main;

import java.util.Collections;
import java.util.Scanner;

import DesafioFinal.models.CreditCard;
import DesafioFinal.models.Purchase;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int keepGoing = 1;
        CreditCard myCard;

        System.out.println("Digite o limite do cartão:");
        myCard = new CreditCard(sc.nextDouble());
        sc.nextLine();
        
        while (keepGoing == 1) {
            System.out.println("Digite a descrição da compra:");
            String description = sc.nextLine();
    
            System.out.println("Digite o valor da compra:");
            double value = sc.nextDouble();
            sc.nextLine();

            Purchase myPurchase = new Purchase(description, value);
            
            if (myCard.recordPurchase(myPurchase)) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                keepGoing = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Saldo insuficiente!");

                System.out.println("\n*******************");
                System.out.println("COMPRAS REALIZADAS:\n");

                Collections.sort(myCard.getListOfPurchases());

                myCard.getListOfPurchases().forEach(purchase -> {
                    System.out.println(purchase);
                });

                System.out.println("\n*******************\n");
                System.out.printf("Saldo do cartão: %.1f\n\n", myCard.getBalance());

                break;
            }

            if (keepGoing == 0) {
                System.out.println("\n*******************");
                System.out.println("COMPRAS REALIZADAS:\n");

                Collections.sort(myCard.getListOfPurchases());

                myCard.getListOfPurchases().forEach(purchase -> {
                    System.out.println(purchase);
                });
                
                System.out.println("\n*******************\n");
                System.out.printf("Saldo do cartão: %.1f\n\n", myCard.getBalance());
            }
        }

        sc.close();
    }
}