package com.example.product.controller;

import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

import com.example.product.model.Product;
import com.example.product.model.ProductRepository;
import java.util.*;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	private ProductRepository productRepository;
	
	public ProductController(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	@ApiOperation(value = "Retorna a mensagem de Boas Vindas")
	@GetMapping("/welcome")
	public String welcome() {
		return "Bem Vindo à Product Rest API";				
	}
	
	@ApiOperation(value = "Retorna uma lista de produtos")
	@ApiResponse(code = 11, message = "Warning - the process returned more than 1000 products.")
	@GetMapping("/allProducts")
	public List<Product> listAllProducts(){
		return productRepository.getAllProducts();
	}
	
	@ApiOperation(value = "Retorna um produto pelo Id")
	@ApiResponse(code = 12, message = "The field id not informed. This information is required.")
	@GetMapping("/findProductById/{id}")
	public Product findProductById(@PathVariable Long id){
		return productRepository.getProductById(id);
	}
	
	@ApiOperation(value = "Retorna a adição de um novo produto")
	@ApiResponse(code = 10, message = "Required fields not informed.")
	@PostMapping("/addProduct")
	public void addProduct(@RequestBody Product product){
		productRepository.addProduct(product);
	}
	
	@ApiOperation(value = "Retorna a atualização de um produto")
	@ApiResponse(code = 13, message = "User not allowed to remove a product from this category.")
	@PutMapping("/updateProduct")
	public void updateProduct(@RequestBody Product product){
		productRepository.updateProduct(product);
	}
	
	@ApiOperation(value = "Retorna a atualização de um produto")
	@ApiResponse(code = 14, message = "No information has been updated. The new information is the same as recorded in the database.")
	@DeleteMapping("/removeProduct")
	public void removeProduct(@RequestBody Product product){
		productRepository.removeProduct(product);
	}
}