package com.softech.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softech.Entity.AdDocuments;
import com.softech.Entity.ProductInfo;
import com.softech.Entity.RdDocuments;
import com.softech.Entity.orderHeader;
import com.softech.Repository.AdDocumentRepo;
import com.softech.Repository.ProductInfoRepo;
import com.softech.Repository.RdDocumentsRepo;
import com.softech.Repository.orderHeaderRepository;
import com.softech.Service.orderService;
@Service
public class orderServiceImpl implements orderService{

	@Autowired(required = true)
	private orderHeaderRepository orderRepo;
	
	@Autowired(required = true)
	private ProductInfoRepo productRepo;
	
	@Autowired(required = true)
	private AdDocumentRepo adDocumentRepo;
	
	@Autowired(required = true)
	private RdDocumentsRepo rdDocument;
	
	@Override
	public orderHeader addOrder(orderHeader order) {
		
		orderHeader save = orderRepo.save(order);
		
		return save;
	}
	
	@Override
	public ProductInfo addProduct(ProductInfo product) {
		
		ProductInfo productInfo = productRepo.save(product);
		
		return productInfo;
	}
	
	@Override
	public AdDocuments AdDocumentsGenerateAndPersist(orderHeader order) {
		
		AdDocuments adDocuments = new AdDocuments();
		
		ProductInfo storeProductInfo = productRepo.findByproductNumber(order.getOrderItems().getProductNumber());
		
		if(storeProductInfo.getProductQty()>= order.getOrderItems().getProductQty()) {
			
			adDocuments.setAcknowledgementType("AD");
			
			adDocuments.setUserName(order.getUserName());
			
			adDocuments.setPurchaseOrderNumber(order.getPurchaseOrderNumber());
			
			adDocuments.setOrdrItems(order.getOrderItems());
			
			adDocumentRepo.save(adDocuments);
			
		}else {
			
			this.RdDocumentsGenerateAndPersist(order);
		}
		
		return adDocuments;
		
	}
	
	@Override
	public RdDocuments RdDocumentsGenerateAndPersist(orderHeader order) {
		RdDocuments rdDocuments = new RdDocuments();
		
		rdDocuments.setAcknowledgementType("RD");
		rdDocuments.setUserName(order.getUserName());
		rdDocuments.setPurcaseOrderNumber(order.getPurchaseOrderNumber());
		rdDocuments.setOrderItems(order.getOrderItems());
		
		rdDocument.save(rdDocuments);
		
		System.out.println(rdDocuments);
		
		return rdDocuments;
	}

	@Override
	public orderHeader updateOrderHeader(orderHeader order, Long PoNumber) {
		order.setPurchaseOrderNumber(PoNumber);
		orderHeader orderHeader = orderRepo.save(order);
		
		
		
		
		
		return orderHeader;
	}
	

	}

