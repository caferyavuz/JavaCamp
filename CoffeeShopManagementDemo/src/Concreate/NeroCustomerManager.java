package Concreate;
import Abstract.CustomerService;
import Entities.Customer;

public class NeroCustomerManager implements CustomerService{
	
	public void save(Customer customer) {
		System.out.println(customer.getFirstName()+" isimli m��teri Nero firmas�na kay�t oldu.");
	}

	public void sell(Customer customer) {
		System.out.println(customer.getFirstName()+" isimli m��teriye kahve sat�ld�.");
	}
}
