package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Product;
import com.masai.model.ProductDTO;
import com.masai.service.ProductService;

import jakarta.validation.Valid;

@RestController
public class ProductController {
	
    @Autowired
	private ProductService serv;
    
    
    @PostMapping("/products")
    public ResponseEntity<Product> registerProduct(@Valid @RequestBody Product p){
    	
    	Product product=serv.registerProduct(p);
    	
    	return new ResponseEntity<Product>(product,HttpStatus.CREATED);
    }
    
    
    
    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProduct(){
    	
    	List<Product> list=serv.getAllProducts();
    	return new ResponseEntity<List<Product>>(list,HttpStatus.OK);
    }
    
    
    @PutMapping("/products")
    public ResponseEntity<Product> updateproduct(@Valid @RequestBody Product product){
    	
    	Product p=serv.updateProdcut(product);
    	
    	return new ResponseEntity<Product>(p,HttpStatus.ACCEPTED);
    }
    
    
    
    @DeleteMapping("/products/{i}")
    public ResponseEntity<Product> deleteProduct(@PathVariable("i") Integer id){
    	
    	Product p=serv.deleteProductById(id);
    	
    	return new ResponseEntity<Product>(p,HttpStatus.OK);
    }
    
    
    
    @GetMapping("/productbycat/{c}")
    public ResponseEntity<List<Product>> findbyCategory(@PathVariable("c") String cat){
    	
    	List<Product> list =serv.getsProductByCategory(cat);
    	
    	
    	return new ResponseEntity<List<Product>>(list,HttpStatus.ACCEPTED);
    }
    
    
    
    @GetMapping("products/{i}")
    public ResponseEntity<Product> getProductById(@PathVariable("i") Integer id){
    	
    	Product p=serv.getProductByProductId(id);
    	
    	return new ResponseEntity<Product>(p,HttpStatus.CREATED);
    }
    
    
    
    @PutMapping("/product/{i}")
    public ResponseEntity<Product> updateProductBuProductId(@RequestParam Double marks,@PathVariable("i") Integer id){
    	
    	
    	
    	Product p=serv.updateProductByPrice(marks, id);
    	
    	
    	return new ResponseEntity<Product>(p,HttpStatus.OK);
    }
    
    @GetMapping("/productitems")
    public ResponseEntity<List<ProductDTO>> getItem(){
    	
    	List<ProductDTO> list=serv.getProductNameQtyPrice();
    	
    	
    	return new ResponseEntity<List<ProductDTO>> (list,HttpStatus.CREATED);
    	
    	
    }
	
	
}
