package dmytro.korniienko.domain;

import dmytro.korniienko.entity.Customer;
import dmytro.korniienko.entity.Order;
import dmytro.korniienko.service.SimpleOrderService;

public class DeliveryApp {
	
	public static void main(String[] args) {
		Customer customer = null;
		Order order;

		SimpleOrderService orderService = new SimpleOrderService();
		order = orderService.placeNewOrder(customer, 1, 2, 3);

		System.out.println(order);
		
		//Add customer to Order toString()
	}
}