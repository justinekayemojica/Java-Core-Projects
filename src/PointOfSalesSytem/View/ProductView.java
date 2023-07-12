package PointOfSalesSytem.View;

public class ProductView {
    public void printProductDetails(String productName , double productPrice, int productQuantity){
        System.out.printf("%-12s ₱%-10.2f %-10d%n" , productName , productPrice , productQuantity);
    }
    public void printProductSales(String productName, int productQuantitySold, double productTotalSalesAmt){
        System.out.printf("%-12s %-10d ₱%-15.2f%n" , productName , productQuantitySold , productTotalSalesAmt);
    }
}
