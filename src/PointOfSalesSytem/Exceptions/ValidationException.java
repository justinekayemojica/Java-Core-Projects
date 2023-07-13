package PointOfSalesSytem.Exceptions;

public class ValidationException extends RuntimeException {
    public ValidationException(String message){
        super(message);
    }

    public static void throwInvalidMenuOptionException(){
        throw new ValidationException("Invalid menu option. Please select option 0, 1, 2 ,3 or 4 only.\n");
    }

    public static void throwInvalidProductOptionException(int numOfProducts){
        String numOfProductsStr = "";
        for(int i = 0 ; i<numOfProducts; i++){
            if(i == numOfProducts-1) numOfProductsStr = numOfProductsStr.concat(" or " + i );
            else numOfProductsStr = numOfProductsStr.concat(" " + i);
        }
        throw new ValidationException("Invalid product option. Please select option" + numOfProductsStr + ".\n");
    }

    public static void throwInvalidProductQuantityException(){
        throw new ValidationException("Negative product quantities are not allowed\n");
    }

    public static void throwInvalidQuantitySoldException() {
        throw new ValidationException("Sales transactions cannot be allowed for products that are sold out\n");
    }

}
