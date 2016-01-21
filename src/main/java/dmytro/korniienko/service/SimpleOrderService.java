package dmytro.korniienko.service;

import java.util.ArrayList;
import java.util.List;

import dmytro.korniienko.entity.Customer;
import dmytro.korniienko.entity.Order;
import dmytro.korniienko.entity.Pizza;
import dmytro.korniienko.entity.PizzaType;

public class SimpleOrderService implements OrderService{

	private List<Order> orderList;

	public SimpleOrderService() {
		this.orderList = new ArrayList<>();
	}

	public Order placeNewOrder(Customer customer, Integer... pizzasID) {
		List<Pizza> pizzas = new ArrayList<>();

		for (Integer id : pizzasID) {
			pizzas.add(getPizzaByID(id)); // get Pizza from predifined in-memory
											// list
		}
		Order newOrder = new Order(customer, pizzas);

		saveOrder(newOrder); // set Order Id and save Order to in-memory list
		return newOrder;
	}

	private void saveOrder(Order newOrder) {
		// TODO Auto-generated method stub
		orderList.add(newOrder);
	}

	private Pizza getPizzaByID(Integer id) {
		// TODO Auto-generated method stub
		switch (id) {
		case 0:
			return new Pizza("Pepperoni", PizzaType.PIZZA_PEPPERONI);
		case 1:
			return new Pizza("Tuna and Pineapple", PizzaType.PIZZA_TUNA_AND_PINEAPPLE);
		case 2:
			return new Pizza("Margarita", PizzaType.PIZZA_MARGARITA);
		default:
			return new Pizza("Bland", PizzaType.PIZZA_BLAND);
		}
	}
}
