package distance;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Distance 0-4 = $2
        Distance 5-15 = $5
        Distance 16-25 = $10
        Distance 26-50 = $15
        Distance 51+ = $20
         */

        Scanner productName = new Scanner(System.in);
        System.out.println("What is your product name?");

        String theProduct = productName.nextLine();
        System.out.println("Your quantity is: " + theProduct);

        Scanner myQty = new Scanner(System.in);
        System.out.println("What is your quantity?");

        int yourQty = myQty.nextInt();
        System.out.println("Your quantity is: " + yourQty);

        Scanner myPrice = new Scanner(System.in);
        System.out.println("What is your price?");

        double yourPrice = myPrice.nextInt();
        System.out.println("Your price is: " + yourPrice);

        Scanner myMilesCharged = new Scanner(System.in);
        System.out.println("How many miles?");

        double yourMilesCharged = myMilesCharged.nextInt();
        System.out.println("Your miles charged are: " + yourMilesCharged);

        int qty;
        double price;
        int distance = 0;
        double milesCharged;
        double total;

        if (distance >= 0 && distance <=4) {
            qty = yourQty;
            price = yourPrice;
            milesCharged = yourMilesCharged;
            total = qty * price + milesCharged / 2;
            System.out.println("Your total is: " + total);

            System.out.println("Product\t\tQty\tPrice\tMiles\tTotal");
            System.out.println("----\t\t---\t-----\t-----\t-----");
            System.out.printf("%-10s\t%d\t%.1f\t\t%.1f\t%.1f\n", theProduct, yourQty, yourPrice, yourMilesCharged, total);
            System.out.println("\nThank you. Come again!");
        }else if(distance >= 5 && distance <=15) {
            qty = yourQty;
            price = yourPrice;
            milesCharged = yourMilesCharged;
            total = qty * price + milesCharged / 2;
            System.out.println("Your total is: " + total);

            System.out.println("Product\t\tQty\tPrice\tMiles\tTotal");
            System.out.println("----\t\t---\t-----\t-----\t-----");
            System.out.printf("%-10s\t%d\t%.1f\t\t%.1f\t%.1f\n", theProduct, yourQty, yourPrice, yourMilesCharged, total);
            System.out.println("\nThank you. Come again!");
        }else if(distance >= 16 && distance <= 25) {
            qty = yourQty;
            price = yourPrice;
            milesCharged = yourMilesCharged;
            total = qty * price + milesCharged / 2;
            System.out.println("Your total is: " + total);

            System.out.println("Product\t\tQty\tPrice\tMiles\tTotal");
            System.out.println("----\t\t---\t-----\t-----\t-----");
            System.out.printf("%-10s\t%d\t%.1f\t\t%.1f\t%.1f\n", theProduct, yourQty, yourPrice, yourMilesCharged, total);
            System.out.println("\nThank you. Come again!");
        }else if(distance >= 26 && distance <= 50) {
            qty = yourQty;
            price = yourPrice;
            milesCharged = yourMilesCharged;
            total = qty * price + milesCharged / 2;
            System.out.println("Your total is: " + total);

            System.out.println("Product\t\tQty\tPrice\tMiles\tTotal");
            System.out.println("----\t\t---\t-----\t-----\t-----");
            System.out.printf("%-10s\t%d\t%.1f\t\t%.1f\t%.1f\n", theProduct, yourQty, yourPrice, yourMilesCharged, total);
            System.out.println("\nThank you. Come again!");

        }
    }
}
