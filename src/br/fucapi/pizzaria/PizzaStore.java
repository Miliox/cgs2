package br.fucapi.pizzaria;

public class PizzaStore {
	
	
	private void createPizza(Pizza pizza) {
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

	}
	
	public void orderPizza(String name) throws Exception {
		Pizza pizza = null;
		if("peperoni".equalsIgnoreCase(name)){
			pizza = new PepperoniPizza(name);
		}else  if("veggie".equalsIgnoreCase(name)){
			pizza = new VeggiePizza(name);
		}else if("clam".equalsIgnoreCase(name)){
			pizza = new ClamPizza(name);
		}else if("cheese".equalsIgnoreCase(name)){
			pizza = new CheesePizza(name);
		}else {
			throw new Exception("pizza não existe");
		}
		
		createPizza(pizza);
		
		System.out.println("Indo para entrega pizza de " + pizza.getName());
	
	}
}
