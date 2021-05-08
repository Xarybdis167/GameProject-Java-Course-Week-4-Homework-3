package Concrate;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class CustomerManager implements CustomerService{

	private CustomerCheckService customerCheckService;
	
	public CustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Welcome : " + customer.getUserName());
			
		}else {
			System.out.println( customer.getUserName() + " Not a valid person!!!");
			
		}
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("The customer was succesfully deleted : " + customer.getUserName());
		
	}

	@Override
	public void update(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("The customer was succesfully updated : " + customer.getUserName());
		}else {
			System.out.println("Update Failed : " + customer.getUserName());
		}
		
	}

}
