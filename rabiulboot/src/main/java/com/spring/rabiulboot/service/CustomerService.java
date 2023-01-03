package com.spring.rabiulboot.service;


import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rabiulboot.entity.CustomerEntity;
import com.spring.rabiulboot.repository.CustomerRepository;





@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository; 					// customerRepository b1
	
	
	public CustomerEntity customerPost(CustomerEntity customerEnt) {	//(customerEnt b2
		/*if(customerEnt !=null) {
			return customerRepository.save(customerEnt);
			}*/
		if(!customerEnt.equals(null)) {  						//! not equel
			return customerRepository.save(customerEnt);		 //b1.customerEnt (b2)	
		}
		return null;
	}
	
	
	
	public CustomerEntity customergetById(Long id) {
		Optional<CustomerEntity> optional = customerRepository.findById(id);
	if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}
	
	public CustomerEntity customerUpdate(CustomerEntity customerEntity) {			// this method will update
//		Optional<CustomerEntity> optional = customerRepository.findById(customerEntity.getId());
//		if(optional.isPresent()) {
//			return optional.get();
//		}
		return customerRepository.save(customerEntity);
	}
	
	
	
	
	public String customerDelete(Long id) {
		Optional<CustomerEntity> optional = customerRepository.findById(id);
		if (optional.isPresent()) {
			 customerRepository.delete(optional.get());
			 return "Success";
		}
		return "Faild";
	}
	
	
	
	public List<CustomerEntity> customerGet() {//all data shoiw for user
		return customerRepository.findAll();
	}
	
	
	public List<CustomerEntity> customerPostAll( List<CustomerEntity> customerOfList){
		
		return customerRepository.saveAll(customerOfList);
	}
	

}
