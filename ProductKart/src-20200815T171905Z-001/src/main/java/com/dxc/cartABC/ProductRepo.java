package com.dxc.cartABC;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductABC, Integer> {

}
