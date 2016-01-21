package dmytro.korniienko.repo;

import java.util.ArrayList;
import java.util.List;

import dmytro.korniienko.entity.Pizza;

public class InMemPizzaRepository implements PizzaRepository{

	private final List<Pizza> pizzas = new ArrayList<>();

	static{
		pizzas.add(new Pizza());
		pizzas.add(new Pizza());
		pizzas.add(new Pizza());
	}
	
	@Override
	public Pizza findPizzaById(Integer id) {
		return pizzas.get(id);
	}

}
