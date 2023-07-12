package PointOfSalesSytem.Model;

public class Product {
    private String name;
    private Double price;
    private int quantity;
    private ProductSales productSales;

    public Product(String name, Double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public ProductSales getProductSales() {
        return productSales;
    }

    public void setProductSales(ProductSales productSales) {
        this.productSales = productSales;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
