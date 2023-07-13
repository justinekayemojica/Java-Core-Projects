package PointOfSalesSytem.Controller;

import PointOfSalesSytem.Exceptions.ValidationException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputValidator {

    private Scanner input;

    public UserInputValidator(Scanner input) {
        this.input = input;
    }

    public boolean validateReturntoMenu(){
        input.nextLine();
        return input.hasNextLine();
    }

    public int validateMenuOption(){
        int menuOpt;
        try{
            menuOpt = input.nextInt();
            System.out.println();
            if(menuOpt >= 0 && menuOpt <5) return menuOpt;
            else ValidationException.throwInvalidMenuOptionException();
        }catch(ValidationException validationException){
            System.out.println(validationException.getMessage());
        }catch(InputMismatchException inputMismatchException){
            System.out.println("\nInvalid menu option. Please select a valid number.\n");
            input.nextLine();
        }
        return -1;
    }

    public int validateProductOption(int numOfProducts){
        int productOpt;
        try{
            productOpt = input.nextInt();
            System.out.println();
            if(productOpt >= 0 && productOpt <numOfProducts) return productOpt;
            else ValidationException.throwInvalidProductOptionException(numOfProducts);
        } catch(ValidationException validationException){
            System.out.println(validationException.getMessage());
        } catch(InputMismatchException inputMismatchException){
            System.out.println("\nInvalid product option. Please select a valid number.\n");
            input.nextLine();
        }
        return -1;
    }

    public int validateProductQuantityInput(){
        int productQuantity;
        try{
            productQuantity = input.nextInt();
            System.out.println();
            if(productQuantity > 0 ) return productQuantity;
            else if(productQuantity < 0)ValidationException.throwInvalidProductQuantityException();
            else throw new InputMismatchException();
        } catch(ValidationException validationException){
            System.out.println(validationException.getMessage());
        } catch(InputMismatchException inputMismatchException){
            System.out.println("\nInvalid product quantity. Please input a valid number.\n");
            input.nextLine();
        }
        return -1;
    }

    public int validateProductQuantitySoldInput(int productQuantity){
        int productQuantitySold;
        boolean isValidProductQtySold;
        try{
            productQuantitySold = input.nextInt();
            System.out.println();
            isValidProductQtySold = productQuantity - productQuantitySold >= 0;
            if(productQuantitySold > 0  && isValidProductQtySold) return productQuantitySold;
            else if(productQuantitySold < 0)ValidationException.throwInvalidProductQuantityException();
            else if(productQuantity == 0) ValidationException.throwInvalidQuantitySoldException();
            else if((productQuantity - productQuantitySold) < 0) ValidationException.throwInvalidQuantitySoldException(productQuantity);
            else throw new InputMismatchException();
        } catch(ValidationException validationException){
            System.out.println(validationException.getMessage());
        } catch(InputMismatchException inputMismatchException){
            System.out.println("\nInvalid product quantity sold. Please input a valid number.\n");
            input.nextLine();
        }
        return -1;
    }
}
