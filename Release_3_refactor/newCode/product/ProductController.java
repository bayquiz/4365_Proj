package product;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.CollectionModel;
import java.util.stream.Collectors;

@RestController
public class ProductController {

	private final ProductRepository repository;
	private final ProductResourceAssembler assembler;
	
	
	ProductController(ProductRepository repository, ProductResourceAssembler assembler){
		this.repository = repository;
		this.assembler = assembler;
	}
	
	//aggregate root
	@GetMapping("/products")
	CollectionModel<EntityModel<Product>> all() {
		
		List<EntityModel<Product>> products = repository.findAll().stream()
			/*	.map(product -> new EntityModel<>(product,
						
		linkTo(methodOn(ProductController.class).one(product.getPID())).withSelfRel(),
						linkTo(methodOn(ProductController.class).all()).withRel("products")))
					.collect(Collectors.toList());
		*/
				.map(assembler::toModel)
				.collect(Collectors.toList());
		
		return new CollectionModel<>(products, 
				linkTo(methodOn(ProductController.class).all()).withSelfRel());
	}
	
	@PostMapping("/products")
	Product newProduct(@RequestBody Product newProduct) {
		return repository.save(newProduct);
	}
	
	@GetMapping("/products/{PID}")
	EntityModel<Product> one(@PathVariable Integer PID) {
		Product product = repository.findById(PID)
			.orElseThrow(() -> new ProductNotFoundException(PID));
		/*	
		return new EntityModel<>(product,
				linkTo(methodOn(ProductController.class).one(PID)).withSelfRel(),
				linkTo(methodOn(ProductController.class).all()).withRel("products"));
		*/
		return assembler.toModel(product);
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
