package br.fucapi.pizzaria;

public class ClamPizza extends Pizza {
	
	public ClamPizza(String name) {
		super(name);
	}
	
	public void prepare() {
		System.out.println("Preparando a pizza");
		setDough("fina");
		setSauce("de tomate");
		setToppings("ostra e queijo");
	}
	
}	

