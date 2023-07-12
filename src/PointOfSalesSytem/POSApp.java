package PointOfSalesSytem;

import PointOfSalesSytem.Model.Product;
import PointOfSalesSytem.View.AppView;
import PointOfSalesSytem.View.ProductView;

import java.util.ArrayList;
import java.util.List;

public class POSApp {
    public static void main(String[] args) {

        AppView appView = new AppView();
        List<Product> products = new ArrayList<>();
        products.add(new Product("PEN" , 5.0 , 10));
        products.add(new Product("PENCIL" , 2.0 , 20));
        products.add(new Product("NOTEBOOK" , 8.0 , 10));
        products.add(new Product("ERASER" , 2.0 , 30));

        appView.printPOSHeader();
        appView.printMenuOptions();




    }
}
