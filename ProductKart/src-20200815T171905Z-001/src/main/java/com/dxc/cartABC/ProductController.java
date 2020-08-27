package com.dxc.cartABC;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	private ProductABCService service;

	@GetMapping("/products")
	public List<ProductABC> list() {
		return service.listAll();
	}

	@GetMapping("/products/{id}")
	public ResponseEntity<ProductABC> get(@PathVariable int id) {
		try {
			ProductABC productABC = service.get(id);
			return new ResponseEntity<ProductABC>(productABC, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<ProductABC>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/add")
	public ResponseEntity<String> add(@RequestBody ProductABC productABC) {
		service.save(productABC);
		return new ResponseEntity<String>("Product added.", HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<String> update(@PathVariable int id,@RequestBody ProductABC UpdateProduct) {
		try {
			// if the course already exists, update it
			ProductABC productABC = service.get(id);
			
			service.save(UpdateProduct);
			return new ResponseEntity<String>("Product updated.", HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<String>("Product Not Found", HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("delete/{id}")
	public ResponseEntity<String> delete(@PathVariable int id) {
		try {
			service.get(id);
			service.delete(id);
			return new ResponseEntity<String>("Product deleted.", HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<String>("Product Not Found", HttpStatus.NOT_FOUND);
		}
	}
}
