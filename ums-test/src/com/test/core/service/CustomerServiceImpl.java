package com.test.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.core.dao.CustomerDao;
import com.test.core.pojo.Customer;
@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private CustomerDao customerDao;
	@Override
	public List<Customer> getCustomerList() {
		return customerDao.getCustomerList();
	}
	@Override
	public List<Customer> getCustQuery(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.getCustQuery(customer);
	}
	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.addCustomer(customer);
	}
	@Override
	public void deleteCustomer(Integer cid) {
		// TODO Auto-generated method stub
		customerDao.deleteCustomer(cid);
	}

}
