package br.fucapi.pizzaria;

public class PepperoniPizza extends Pizza {

	public PepperoniPizza(String name) {
		super(name);
	}
	public void prepare() {
		System.out.println("Preparando a pizza");
		setDough("grossa");
		setSauce("tomate");
		setToppings("peperoni e queijo");
	}
}
