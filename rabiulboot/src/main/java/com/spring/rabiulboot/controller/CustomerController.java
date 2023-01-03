package com.spring.rabiulboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rabiulboot.entity.CustomerEntity;
import com.spring.rabiulboot.service.CustomerService;





@RestController
//@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	 private CustomerService customerservice;
	
	
	@PostMapping("/post")
	public CustomerEntity customerPost(@RequestBody CustomerEntity customerEntity ) {
		return customerservice.customerPost(customerEntity); //customerService hoty customerpost ana
		
	}
	
	@GetMapping("/get/{id}")
	public CustomerEntity customerGet(@PathVariable Long id ) {
		return customerservice.customergetById(id); //customerService hoty customerpost ana
	}
	
	@PutMapping("/update")
	public CustomerEntity customerUpdate(@RequestBody CustomerEntity customerEntity ) {
		return customerservice.customerUpdate(customerEntity); //customerService hoty customerUpdate ana ata 
	}
	
	@DeleteMapping("/delete/{id}")
	public String customerDeleteById(@PathVariable Long id) {
		return customerservice.customerDelete(id);
	
	}
	
	@GetMapping("/getAll")
	public List<CustomerEntity> customerGet() {
		return customerservice.customerGet(); //customerService hoty customerpost ana	
	}
	
	
	@PostMapping("/postAll")
	public List<CustomerEntity> customerList(@RequestBody List<CustomerEntity> customerList ) {
		return customerservice.customerPostAll(customerList);
	}

}
