package product;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
class ProductResourceAssembler implements RepresentationModelAssembler<Product,
EntityModel<Product>> {
	
	@Override
	public EntityModel<Product> toModel(Product product) {
		return new EntityModel<>(product, 
				
	linkTo(methodOn(ProductController.class).one(product.getPID())).withSelfRel(),
			linkTo(methodOn(ProductController.class).all()).withRel("products"));
	}
	

}
