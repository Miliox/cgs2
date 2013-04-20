package br.fucapi.pizzaria;

public class VeggiePizza extends Pizza {

	public VeggiePizza(String name) {
		super(name);
	}
	public void prepare() {
		System.out.println("Preparando a pizza");
		setDough("fina");
		setSauce("tomate");
		setToppings("brocolis,cebola,jiló,abobrinha");
	}
}
