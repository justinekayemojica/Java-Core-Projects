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
        ProductView productView = new ProductView();

        ProductController productController;
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
                    for (Product product : products) {
                        productController = new ProductController(product, productView);
                        productController.displayProductDetails();
                    }
                    appView.printReturnToMenuPrompt();
                    if(userInputValidator.validateReturntoMenu()) menuOption = -1;
                }
                case 2->{
                    int productOpt;
                    int productQty;
                    appView.printIncreaseStockHeader();

                    do{
                        for(int i = 0 ; i< products.size() ; i++){
                            productController = new ProductController(products.get(i), productView);
                            System.out.print("[" + i + "] ");
                            productController.displayProductName();
                        }
                        appView.printProductPrompt();
                        productOpt = userInputValidator.validateProductOption(products.size());
                        if(productOpt!=-1){
                            productController = new ProductController(products.get(productOpt), productView);
                            do{
                                appView.printProductQuantityPrompt();
                                productQty = userInputValidator.validateProductQuantityInput();
                                if(productQty!=-1){
                                    productController.addProductQuantity(productQty);
                                    appView.printIncreaseStockMsg(productController.getProductName(),productController.getProductQuantity());
                                }
                            }while(productQty == -1);
                        }
                    } while(productOpt == -1);
                    appView.printReturnToMenuPrompt();
                    if(userInputValidator.validateReturntoMenu()) menuOption = -1;

                }

                case 3 ->{
                    int productOpt;
                    int productQtySold;
                    appView.printEnterSalesTransactionHeader();

                    do{
                        for(int i = 0 ; i< products.size() ; i++){
                            productController = new ProductController(products.get(i), productView);
                            System.out.print("[" + i + "] ");
                            productController.displayProductName();
                        }
                        appView.printProductPrompt();
                        productOpt = userInputValidator.validateProductOption(products.size());
                        if(productOpt != -1){
                            productController = new ProductController(products.get(productOpt), productView);
                            do{
                                appView.printProductQuantitySoldPrompt();
                                productQtySold = userInputValidator.validateProductQuantitySoldInput(productController.getProductQuantity());
                                if(productQtySold!=-1){
                                    productController.enterProductSalesTrans(productQtySold);
                                    appView.printEnterSalesTransactionMsg(productController.getProductName(), productController.getProductQuantitySold());
                                }
                            }while(productQtySold == -1);
                        }
                    }while(productOpt == -1);
                    appView.printReturnToMenuPrompt();
                    if(userInputValidator.validateReturntoMenu()) menuOption = -1;

                }
                case 4 -> {
                    appView.printSalesTransactionHeader();
                    for (Product product : products) {
                        productController = new ProductController(product, productView);
                        productController.displayProductSalesTrans();
                    }
                    appView.printReturnToMenuPrompt();
                    if(userInputValidator.validateReturntoMenu()) menuOption = -1;
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
