package PointOfSalesSytem.Controller;

import PointOfSalesSytem.Model.Product;
import PointOfSalesSytem.Model.ProductSales;
import PointOfSalesSytem.View.ProductView;

public class ProductController {
    private final Product product;
    private final ProductSales productSales;
    private final ProductView productView;

    public ProductController(Product product, ProductView productView) {
        this.product = product;
        this.productView = productView;
        productSales = product.getProductSales();
    }

    public void displayProductDetails(){
        productView.printProductDetails(product.getName(), product.getPrice(), product.getQuantity());
    }

    public void displayProductName(){
        productView.printProductName(product.getName());
    }

    public void addProductQuantity(int quantity){
        product.setQuantity(product.getQuantity()+quantity);
    }

    public void enterProductSalesTrans(int quantitySold){
        product.setQuantity(product.getQuantity() - quantitySold);
        productSales.setQuantitySold(productSales.getQuantitySold() + quantitySold);
        productSales.setTotalSalesAmount(productSales.getQuantitySold()* product.getPrice());
        product.setProductSales(productSales);
    }

    public void displayProductSalesTrans(){
        productView.printProductSales(product.getName(), product.getProductSales().getQuantitySold() , product.getProductSales().getTotalSalesAmount());
    }

    public String getProductName(){
        return product.getName();
    }

    public int getProductQuantity(){
        return product.getQuantity();
    }

    public int getProductQuantitySold(){
        return productSales.getQuantitySold();
    }
}
