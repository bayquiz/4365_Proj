package product;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {

	private final ProductRepository repository;
	
	ProductController(ProductRepository repository){
		this.repository = repository;
	}
	
	//aggregate root
	@GetMapping("/products")
	List<Product> all() {
		return repository.findAll();
	}
	
	@PostMapping("/products")
	Product newProduct(@RequestBody Product newProduct) {
		return repository.save(newProduct);
	}
	
	@GetMapping("/products/{PID}")
	Product one(@PathVariable Integer PID) {
		return repository.findById(PID)
				.orElseThrow(() -> new ProductNotFoundException(PID));
	}
	
	@PutMapping("/products/{PID}")
	Product replaceProduct(@RequestBody Product newProduct, @PathVariable Integer PID) {
		return repository.findById(PID)
				.map(product -> {
					product.setProdName(newProduct.getProdName());
					product.setProdPrice(newProduct.getProdPrice());
					product.setSupplier(newProduct.getSupplier());
					product.setStock(newProduct.getStock());
					return repository.save(product);
				})
				.orElseGet(() -> {
					newProduct.setPID(PID);
					return repository.save(newProduct);
				});
	}
	
	@DeleteMapping("/products/{PID}")
	void deleteProduct(@PathVariable Integer PID) {
		repository.deleteById(PID);
	}
	
	
}
