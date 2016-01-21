package dmytro.korniienko.repo;

import dmytro.korniienko.entity.Pizza;

public interface PizzaRepository {

	Pizza findPizzaById(Integer id);
	
}
