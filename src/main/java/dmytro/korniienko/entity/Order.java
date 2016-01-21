package dmytro.korniienko.entity;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private int id;
	private List<Pizza> pizzas;
	private Customer customer;
	
	public Order(Customer customer, List<Pizza> pizzas) {
		this.setCustomer(customer);
		this.pizzas = new ArrayList<>(pizzas);
	}

	public int getId() {
		return id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String toString(){
		StringBuilder sb = new StringBuilder();
		for (Pizza pizza : pizzas){
			sb.append(pizza);
			sb.append(" ");
		}
		sb.deleteCharAt(sb.length()-1);
		return this.customer.getName() + " ordered " + sb;
	}

}
