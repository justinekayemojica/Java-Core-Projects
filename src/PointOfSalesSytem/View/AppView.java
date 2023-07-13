package PointOfSalesSytem.View;

public class AppView {

    public void printPOSHeader(){
        printLineSep();
        System.out.printf("%45s%n", "Point Of Sales System" );
    }

    public void printLineSep(){
        System.out.println("*".repeat(70));
    }

    public void printClosingAppHeader(){
        System.out.println("Exiting Application...");
    }

    public void printMenuOptions(){
        printLineSep();
        System.out.printf("%41s%n", "Menu Options" );
        System.out.printf("%-30s%n%-30s%n%-30s%n%-30s%n%-30s%n" , "[1] Display Inventory" ,
                "[2] Add Product Quantity" , "[3] Enter Sales Transactions" , "[4] Display All Sales Transactions"
                ,"[0] Exit Application");
    }

    public void printMenuPrompt(){
        System.out.print("Select menu option: ");
    }

    public void printProductPrompt(){
        System.out.print("Select product option: ");
    }

    public void printProductQuantityPrompt(){
        System.out.print("Input product quantity: ");
    }

    public void printDisplayInventoryHeader(){
        printLineSep();
        System.out.printf("%43s%n", "Inventory Display" );
        System.out.printf("%-30s %-20s %-20s%n" , "Product Name" , "Price" , "Stocks");
    }

    public void printIncreaseStockHeader(){
        printLineSep();
        System.out.printf("%48s%n", "Increase Product Quantity");
    }

    public void printSalesTransactionHeader(){
        printLineSep();
        System.out.printf("%43s%n", "Sales Transactions" );
        System.out.printf("%-30s %-20s %-20s%n" , "Product Name" , "Sold" , "Total Sales Amt");
    }
}
