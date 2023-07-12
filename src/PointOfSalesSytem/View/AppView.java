package PointOfSalesSytem.View;

public class AppView {

    public void printPOSHeader(){
        printLineSep();
        System.out.printf("%29s%n", "Point Of Sales System" );
    }

    public void printLineSep(){
        System.out.println("*".repeat(37));
    }

    public void printMenuOptions(){
        printLineSep();
        System.out.printf("%25s%n", "Menu Options" );
        System.out.printf("%-30s%n%-30s%n%-30s%n%-30s%n" , "[1] Display Inventory" ,
                "[2] Add Product Quantity" , "[3] Enter Sales Transactions" , "[4] Display All Sales Transactions");
    }

    public void printDisplayInventoryHeader(){
        printLineSep();
        System.out.printf("%27s%n", "Inventory Display" );
        System.out.printf("%-12s %-10s %-10s%n" , "Product Name" , "Price" , "Stocks");
    }

    public void printSalesTransactionHeader(){
        printLineSep();
        System.out.printf("%27s%n", "Sales Transactions" );
        System.out.printf("%-12s %-10s %-15s%n" , "Product Name" , "Sold" , "Total Sales Amt");
    }
}
