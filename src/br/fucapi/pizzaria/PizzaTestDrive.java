package br.fucapi.pizzaria;

import java.util.Scanner;

public class PizzaTestDrive {
	
	private static  PizzaStore store = new PizzaStore();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Pizzaria Massa Suja");
		while(true){
			System.out.println("Qual é a pizza:");
			String nextLine = scan.nextLine();
			
			try {
				store.orderPizza(nextLine);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			System.out.print("deseja continuar: ");
			nextLine = scan.nextLine();
			if("n".equalsIgnoreCase(nextLine)){
				break;
			}
			
			
		}
	}

}
