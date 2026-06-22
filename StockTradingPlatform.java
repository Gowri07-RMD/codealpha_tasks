import java.util.ArrayList;
import java.util.Scanner;

class Stock {
    String name;
    double price;

    Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Portfolio {
    double balance;
    ArrayList<String> ownedStocks = new ArrayList<>();

    Portfolio(double balance) {
        this.balance = balance;
    }

    void buyStock(Stock stock) {
        if (balance >= stock.price) {
            balance -= stock.price;
            ownedStocks.add(stock.name);
            System.out.println("Successfully bought " + stock.name);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void sellStock(Stock stock) {
        if (ownedStocks.contains(stock.name)) {
            balance += stock.price;
            ownedStocks.remove(stock.name);
            System.out.println("Successfully sold " + stock.name);
        } else {
            System.out.println("You don't own this stock.");
        }
    }

    void showPortfolio() {
        System.out.println("\n----- Portfolio -----");
        System.out.println("Balance: $" + balance);

        if (ownedStocks.isEmpty()) {
            System.out.println("No stocks owned.");
        } else {
            System.out.println("Owned Stocks:");
            for (String stock : ownedStocks) {
                System.out.println("- " + stock);
            }
        }
    }
}

public class StockTradingPlatform {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stock stock1 = new Stock("Apple", 150);
        Stock stock2 = new Stock("Tesla", 200);
        Stock stock3 = new Stock("Google", 180);

        Portfolio user = new Portfolio(1000);

        int choice;

        do {
            System.out.println("\n===== STOCK TRADING PLATFORM =====");
            System.out.println("1. View Market Stocks");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Portfolio");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nMarket Data");
                    System.out.println("1. Apple  - $150");
                    System.out.println("2. Tesla  - $200");
                    System.out.println("3. Google - $180");
                    break;

                case 2:
                    System.out.print("Choose stock (1-Apple, 2-Tesla, 3-Google): ");
                    int buyChoice = sc.nextInt();

                    if (buyChoice == 1)
                        user.buyStock(stock1);
                    else if (buyChoice == 2)
                        user.buyStock(stock2);
                    else if (buyChoice == 3)
                        user.buyStock(stock3);
                    else
                        System.out.println("Invalid choice!");
                    break;

                case 3:
                    System.out.print("Choose stock to sell (1-Apple, 2-Tesla, 3-Google): ");
                    int sellChoice = sc.nextInt();

                    if (sellChoice == 1)
                        user.sellStock(stock1);
                    else if (sellChoice == 2)
                        user.sellStock(stock2);
                    else if (sellChoice == 3)
                        user.sellStock(stock3);
                    else
                        System.out.println("Invalid choice!");
                    break;

                case 4:
                    user.showPortfolio();
                    break;

                case 5:
                    System.out.println("Thank you for using Stock Trading Platform!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}