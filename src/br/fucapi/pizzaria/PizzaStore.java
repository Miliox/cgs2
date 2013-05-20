package br.fucapi.pizzaria;

public class PizzaStore {
	
	
	private Pizza createPizza(String name) {
		Pizza pizza = new Pizza(name);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	public void orderPizza(String name) {
		Pizza pizza = createPizza(name);
		System.out.println("Indo para entrega pizza de " + pizza.getName());
	}
}
