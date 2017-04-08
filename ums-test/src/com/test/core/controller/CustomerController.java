package com.test.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.core.pojo.Customer;
import com.test.core.service.ICustomerService;

@Controller
public class CustomerController {

	@Autowired
	private ICustomerService customerService;
	@RequestMapping("/customer/showCenter")
	public String showCenter(Model model){
		List<Customer> list = customerService.getCustomerList();
		model.addAttribute("custList", list);
		return "center";
	}
	
	@RequestMapping("/customer/query")
	public String query(Customer customer,Model model){
		List<Customer> list = customerService.getCustQuery(customer);
		model.addAttribute("custList", list);
		model.addAttribute("cust_name", customer.getCust_name());
		model.addAttribute("cust_type", customer.getCust_type());
		return "center";
	}
	
	@RequestMapping("/customer/addCustomer")
	@ResponseBody
	public String addCustomer(Customer customer){
		customerService.addCustomer(customer);
		return "OK";
	}
	
	@RequestMapping("/customer/deleteCustomer/{cid}")
	public String deleteCustomer(@PathVariable Integer cid){
		customerService.deleteCustomer(cid);
		return "redirect:/customer/showCenter";
	}
}
