package br.fucapi.pizzaria;

public class Pizza {
	
	private String name ;
	private String dough;
	private String sauce;
	private String toppings;

	public Pizza(String name) {
		this.name = name;
	}
	
	public void prepare() {
		System.out.println("Preparando a pizza");
	}
	
	public void bake() {
		System.out.println("Cozinhando a pizza");
	}

	public void cut() {
		System.out.println("Cortando a pizza");
	}
	
	public void box() {
		System.out.println("Empacotando pizza");
	}
	
	public String getName() {
		return name.toUpperCase() + " (massa: " + dough + "; molho: " + sauce + "; cobertura: " + toppings + ").";
	}

	public String getDough() {
		return dough;
	}

	public void setDough(String dough) {
		this.dough = dough;
	}

	public String getSauce() {
		return sauce;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	public String getToppings() {
		return toppings;
	}

	public void setToppings(String toppings) {
		this.toppings = toppings;
	}
}
