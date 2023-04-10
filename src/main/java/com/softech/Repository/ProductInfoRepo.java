package com.softech.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softech.Entity.ProductInfo;

@Repository
public interface ProductInfoRepo extends JpaRepository<ProductInfo, Integer>{
	
public ProductInfo findByproductNumber(Long proNumber);

	
	
}
