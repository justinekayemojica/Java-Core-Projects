package PointOfSalesSytem.Controller;

import PointOfSalesSytem.Model.Product;
import PointOfSalesSytem.Model.ProductSales;
import PointOfSalesSytem.View.ProductView;

public class ProductController {
    private Product product;
    private ProductSales productSales;
    private ProductView productView;

    public ProductController(Product product, ProductView productView) {
        this.product = product;
        this.productView = productView;
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
        productSales.setQuantitySold(productSales.getQuantitySold() + quantitySold);
        productSales.setTotalSalesAmount(productSales.getQuantitySold()* product.getPrice());
        product.setProductSales(productSales);
    }

    public void displayProductSalesTrans(){
        productView.printProductSales(product.getName(), product.getProductSales().getQuantitySold() , product.getProductSales().getTotalSalesAmount());
    }

    public void setProductSales(ProductSales productSales) {
        this.productSales = productSales;
        product.setProductSales(productSales);
    }
}
