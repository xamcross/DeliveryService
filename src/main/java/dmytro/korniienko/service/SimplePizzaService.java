package dmytro.korniienko.service;

import dmytro.korniienko.entity.Pizza;
import dmytro.korniienko.repo.InMemPizzaRepository;
import dmytro.korniienko.repo.PizzaRepository;

public class SimplePizzaService implements PizzaService{

	private PizzaRepository pizzaRepository = new InMemPizzaRepository();
	
	@Override
	public Pizza findPizzaById(Integer id) {
		return pizzaRepository.findPizzaById(id);
	}

	
	
}
