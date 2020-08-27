package com.dxc.cartABC;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProductABCService {
	@Autowired
	private ProductRepo productRepo;
	
	public List<ProductABC> listAll() {
		return productRepo.findAll();
	}

	public void save(ProductABC productABC) {
		productRepo.save(productABC);
	}

	public ProductABC get(int id) {
		return productRepo.findById(id).get();
	}

	public void delete(Integer id) {
		productRepo.deleteById(id);
	}
	

}
