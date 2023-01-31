package com.nagarro.service;

import java.util.List;
import java.util.Optional;

import com.nagarro.entities.Product;
import com.nagarro.payload.SearchParameter;

// TODO: Auto-generated Javadoc
/**
 * The Interface ProductService.
 */
public interface ProductService {
	
	/**
	 * Gets the product details service.
	 *
	 * @param id the id
	 * @return the product details service
	 */
	Optional<Product> getProductDetailsService(Long id);
	
	/**
	 * Gets the all product details.
	 *
	 * @return the all product details
	 */
	Optional<List<Product>>  getAllProductDetails();
	
	/**
	 * Gets the product by parameters.
	 *
	 * @param value the value
	 * @return the product by parameters
	 */
	Optional<List<Product>> getProductByParameters(SearchParameter value);
}
