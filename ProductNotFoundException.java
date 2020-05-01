package product;

public class ProductNotFoundException extends RuntimeException {
	ProductNotFoundException(Integer PID) {
		super("could not find product" + PID);
	}

}
