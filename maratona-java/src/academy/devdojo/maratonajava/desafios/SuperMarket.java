package academy.devdojo.maratonajava.desafios;

import java.util.Scanner;
import java.util.Locale;

public class SuperMarket {
    public static void main(String[] args) {

        System.out.println("======= AVAILABLE PRODUCTS =======");
        String[] productsNames = {"Rice", "Beans", "Milk", "Pasta", "Chicken"};
        double[] pricesOfProducts = {1.35, 0.50, 0.95, 0.75, 3.50};
        for (int index = 0; index < productsNames.length; index++) {
            System.out.printf(Locale.UK, "%d - %-10s £ %.2f%n", index + 1, productsNames[index].toUpperCase(), pricesOfProducts[index]);
        }
        System.out.println("===================================\n");

        System.out.println("Enter the quantity of each product:\n");

        Scanner scanner = new Scanner(System.in);
        int[] quantityOfProducts = new int[5];
        for (int index = 0; index < productsNames.length; index++) {
            System.out.print(productsNames[index] + ": ");
            quantityOfProducts[index] = scanner.nextInt();
        }

        double[] productsSubtotal = new double[5];
        System.out.println("\n========== RECEIPT ==========");
        for (int index = 0; index < quantityOfProducts.length; index++) {
            if (quantityOfProducts[index] > 0) {
                productsSubtotal[index] = quantityOfProducts[index] * pricesOfProducts[index];
                System.out.printf(Locale.UK, "%-10s %dx  £ %.2f = £ %.2f%n", productsNames[index], quantityOfProducts[index], pricesOfProducts[index], productsSubtotal[index]);
            } else {
                productsSubtotal[index] = 0;
            }
        }

        double totalPriceOfProducts = 0;
        for (double price : productsSubtotal) {
            totalPriceOfProducts += price;
        }
        double totalPriceFinalOfProducts = totalPriceOfProducts;
        double discountOnFullPrice = 0;
        if (totalPriceOfProducts > 34) {
            discountOnFullPrice = totalPriceOfProducts * 0.1;
            totalPriceFinalOfProducts = totalPriceOfProducts - discountOnFullPrice;
        }

        System.out.printf(Locale.UK, "%n%-15s £ %.2f%n", "Total:", totalPriceOfProducts);
        System.out.printf(Locale.UK, "%-15s £ %.2f%n", "Discount:", discountOnFullPrice);
        System.out.printf(Locale.UK, "%-15s £ %.2f%n", "Final Total:", totalPriceFinalOfProducts);
        System.out.println("=============================");
    }
}