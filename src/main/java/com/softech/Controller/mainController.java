package com.softech.Controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.softech.Entity.AdDocuments;
import com.softech.Entity.ProductInfo;
import com.softech.Entity.orderHeader;
import com.softech.Service.orderService;

@RestController
public class mainController {
	
	static Logger logger=Logger.getLogger(mainController.class);
	
	@Autowired
	private orderService service;
	
	@PostMapping("/saveOrder")
	public orderHeader saveOrder(@RequestBody orderHeader order) {
		
		logger.info("calling to addOrder Method");
		orderHeader addOrder = service.addOrder(order);
		
		logger.info("order save successfully");
		
		//AdDocuments adDocuments = service.AdDocumentsGenerateAndPersist(order);
		
		//System.out.println(adDocuments);
		
		return addOrder;
	}

	@PostMapping("/saveProduct")
	public ProductInfo saveproduct(@RequestBody ProductInfo product) {
		ProductInfo addProduct = service.addProduct(product);
		return addProduct;	
	}
	
	@PutMapping("/orderHeader/{PoNumber}")
	public orderHeader updateOrder(@RequestBody orderHeader order,@PathVariable("PoNumber")Long PoNumber) {
		orderHeader updateOrderHeader = service.updateOrderHeader(order, PoNumber);
		return updateOrderHeader;
	}

}

