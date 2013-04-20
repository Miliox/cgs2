package br.fucapi.pizzaria;

public class CheesePizza extends Pizza {

	public CheesePizza(String name) {
		super(name);
	}
	
	public void prepare() {
		System.out.println("Preparando a pizza");
		setDough("pam");
		setSauce("de tomate");
		setToppings("queijo");
	}
}
