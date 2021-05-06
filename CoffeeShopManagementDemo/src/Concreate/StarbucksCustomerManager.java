package Concreate;

import Abstract.*;
import Entities.*;


public class StarbucksCustomerManager implements CustomerService {
	
	private CustomerCheckService checkService;
	public StarbucksCustomerManager(CustomerCheckService checkService) {
		this.checkService=checkService;
	}
	public void save(Customer customer) {
		if (checkService.checkIfRealPerson(customer)) {
			System.out.println(customer.getFirstName()+" isimli m��teri Starbucks firmas�na kay�t oldu.");
		}
		else {
		System.out.println("Girilen kullan�c� bilgisi do�rulanam�yor. L�tfen do�ru bilgileri giriniz.");
		}
	}

	
	public void sell(Customer customer) {
		System.out.println(customer.getFirstName()+" isimli m��teriye kahve sat�ld�.");
		
		if(customer instanceof StarbucksCustomer) {
			((StarbucksCustomer)customer).earnStar();
			System.out.println(customer.getFirstName()+" +1 y�ld�z kazand�.Mevcut Y�ld�z : "+ ((StarbucksCustomer)customer).getNumberOfStar());
		}

	}
}
