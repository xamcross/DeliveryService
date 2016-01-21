package dmytro.korniienko.entity;

public class Pizza {

	private int id;
	private double price;
	private PizzaType type;

	private String name;

	public Pizza(String name, PizzaType type) {
		this.name = name;
		this.type = type;
		this.price = generatePrice(type);
	}

	private double generatePrice(PizzaType type) {
		switch (type) {
		case PIZZA_MARGARITA:
			return 10.0;
		case PIZZA_PEPPERONI:
			return 12.99;
		case PIZZA_TUNA_AND_PINEAPPLE:
			return 14.99;
		default:
			return 0.0;
		}
	}

	public int getId() {
		return id;
	}

	public double getPrice() {
		return price;
	}

	public PizzaType getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public String toString(){
		return type.toString();
	}
}
