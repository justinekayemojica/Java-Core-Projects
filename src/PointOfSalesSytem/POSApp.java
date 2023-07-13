package PointOfSalesSytem;

import PointOfSalesSytem.Controller.ProductController;
import PointOfSalesSytem.Controller.UserInputValidator;
import PointOfSalesSytem.Model.Product;
import PointOfSalesSytem.Model.ProductSales;
import PointOfSalesSytem.View.AppView;
import PointOfSalesSytem.View.ProductView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class POSApp {
    public static void main(String[] args) {

        int menuOption = -1;
        AppView appView = new AppView();
        Scanner input = new Scanner(System.in);
        ProductController productController;
        ProductView productView = new ProductView();
        UserInputValidator userInputValidator = new UserInputValidator(input);


        List<Product> products = new ArrayList<>();
        products.add(new Product("PEN" , 5.0 , 10 , new ProductSales()));
        products.add(new Product("PENCIL" , 2.0 , 20,new ProductSales()));
        products.add(new Product("NOTEBOOK" , 8.0 , 10,new ProductSales()));
        products.add(new Product("ERASER" , 2.0 , 30,new ProductSales()));

        appView.printPOSHeader();

        while(menuOption == -1){
            appView.printMenuOptions();
            appView.printMenuPrompt();
            menuOption = userInputValidator.validateMenuOption();

            switch(menuOption){
                case 1 -> {
                    appView.printDisplayInventoryHeader();
                    for(int i = 0 ; i< products.size() ; i++){
                        productController = new ProductController(products.get(i), productView);
                        productController.displayProductDetails();
                    }
                }
                case 2->{
                    int productOpt;
                    int productQty;
                    appView.printIncreaseStockHeader();
                    for(int i = 0 ; i< products.size() ; i++){
                        productController = new ProductController(products.get(i), productView);
                        System.out.print("[" + i + "] ");
                        productController.displayProductName();
                    }
                    appView.printProductPrompt();
                    productOpt = userInputValidator.validateProductOption(products.size());
                    productController = new ProductController(products.get(productOpt), productView);
                    appView.printProductQuantityPrompt();
                    productQty = userInputValidator.validateProductQuantityInput();
                    productController.addProductQuantity(productQty);
                    menuOption = -1;

                }
                case 4 -> {
                    appView.printSalesTransactionHeader();
                    for(int i = 0 ; i< products.size() ; i++){
                        productController = new ProductController(products.get(i), productView);
                        productController.displayProductSalesTrans();
                    }
                }
                case 0 ->{
                    appView.printClosingAppHeader();
                    input.close();
                    return;
                }
            }
        }





    }
}
