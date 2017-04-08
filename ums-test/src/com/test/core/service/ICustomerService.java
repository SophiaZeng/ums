package com.test.core.service;

import java.util.List;

import com.test.core.pojo.Customer;

public interface ICustomerService {

	List<Customer> getCustomerList();

	List<Customer> getCustQuery(Customer customer);

	void addCustomer(Customer customer);

	void deleteCustomer(Integer cid);

}
