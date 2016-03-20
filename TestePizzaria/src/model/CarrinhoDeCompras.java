package model;
import java.util.ArrayList;


public class CarrinhoDeCompras {

	private ArrayList<Pizza> pizzas;
	
	public CarrinhoDeCompras(){
		pizzas = new ArrayList<Pizza>();
	}
	
	
	public void adicionarPizza(Pizza pizza){
		if(!pizza.estaSemIngredientes()){
			pizzas.add(pizza);
		} else {
			System.out.println("Pizza sem ingredientes! Adicione para continuar.");
		}
	}
	
	public int getTotalPizzas(){
		int total = 0;
		for (Pizza pizza : pizzas) {
			total += pizza.getPreco();
		}
		return total;
	}
	
}
