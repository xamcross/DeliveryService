package dmytro.korniienko.repo;

import java.util.ArrayList;
import java.util.List;

import dmytro.korniienko.entity.Order;

public class InMemOrderRepository implements OrderRepository{

	private final List<Order> orders = new ArrayList<>();
	
	@Override
	public Order save(Order order) {
		orders.add(order);
		return order;
	}

	
	
}
