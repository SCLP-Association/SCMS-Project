package com.softech.Service;

import org.springframework.stereotype.Service;

import com.softech.Entity.AdDocuments;
import com.softech.Entity.ProductInfo;
import com.softech.Entity.RdDocuments;
import com.softech.Entity.orderHeader;
@Service
public interface orderService {

	public orderHeader addOrder(orderHeader order);
	
	public  ProductInfo addProduct(ProductInfo product);
	
	public AdDocuments AdDocumentsGenerateAndPersist(orderHeader order);
	
	public RdDocuments RdDocumentsGenerateAndPersist(orderHeader order);

	public orderHeader updateOrderHeader(orderHeader order, Long PoNumber);
}
