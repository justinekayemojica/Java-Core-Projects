package PointOfSalesSytem.Model;

public class ProductSales {
    private int quantitySold = 0;
    private Double totalSalesAmount = 0.0;

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public void setTotalSalesAmount(Double totalSalesAmount) {
        this.totalSalesAmount = totalSalesAmount;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public Double getTotalSalesAmount() {
        return totalSalesAmount;
    }
}
