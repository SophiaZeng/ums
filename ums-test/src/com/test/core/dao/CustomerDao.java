package com.test.core.dao;

import java.util.List;

import com.test.core.pojo.Customer;

public interface CustomerDao {

	List<Customer> getCustomerList();

	List<Customer> getCustQuery(Customer customer);

	void addCustomer(Customer customer);

	void deleteCustomer(Integer cid);

}
