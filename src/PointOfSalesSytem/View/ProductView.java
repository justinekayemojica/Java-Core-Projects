package PointOfSalesSytem.View;

public class ProductView {

    public void printProductName(String productName){
        System.out.println(productName);
    }

    public void printProductDetails(String productName , double productPrice, int productQuantity){
        System.out.printf("%-30s ₱%-20.2f %-20d%n" , productName , productPrice , productQuantity);
    }
    public void printProductSales(String productName, int productQuantitySold, double productTotalSalesAmt){
        System.out.printf("%-30s %-20d ₱%-20.2f%n" , productName , productQuantitySold , productTotalSalesAmt);
    }
}
