package main;
import java.util.HashMap;

import model.CarrinhoDeCompras;
import model.Pizza;


public class Principal {

	public static void main(String[] args) {
		
		final int TOTAL_ESPACOS = 13;
		
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		Pizza p3 = new Pizza();
		
		p1.adicionaIngrediente("Mussarela");
		p1.adicionaIngrediente("Presunto");
		p1.adicionaIngrediente("Parmesão");
		

		p2.adicionaIngrediente("Peperone");
		p2.adicionaIngrediente("Carne Seca");
		
		p3.adicionaIngrediente("Catupiry");
		p3.adicionaIngrediente("Calabresa");
		p3.adicionaIngrediente("Frango");
		p3.adicionaIngrediente("Filadelfia");
		p3.adicionaIngrediente("Bacon");
		p3.adicionaIngrediente("Provolone");
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionarPizza(p1);
		carrinho.adicionarPizza(p2);
		carrinho.adicionarPizza(p3);
		
		System.out.println("--------------------------");
		System.out.println("QUANTIDADE DE INGREDIENTES");
		System.out.println("--------------------------");
		System.out.println(" INGREDIENTE -  QUANTIDADE");
		System.out.println("--------------------------");
		HashMap<String, Integer> ingredientesTotais = Pizza.getIngredientesTotais();
		for (String ingrediente : ingredientesTotais.keySet()) {
			String espaco = " ";
			
			int qtdEspacos = TOTAL_ESPACOS - ingrediente.length();
			int qtdEspacosInicial= 0;
			int qtdEspacosFinal= 0;
			if(qtdEspacos% 2 == 0){
				qtdEspacosInicial = qtdEspacos/2;
				qtdEspacosFinal = qtdEspacos/2;
			} else {
				qtdEspacosInicial = (qtdEspacos/2) + 1;
				qtdEspacosFinal = qtdEspacos/2;
			}
			
			int qtdEspacosQtd = TOTAL_ESPACOS - ingredientesTotais.get(ingrediente).toString().length();
			int qtdEspacosInicialQtd= 0;
			int qtdEspacosFinalQtd= 0;
			if(qtdEspacosQtd % 2 == 0){
				qtdEspacosInicialQtd = qtdEspacosQtd/2;
				qtdEspacosFinalQtd = qtdEspacosQtd/2;
			} else {
				qtdEspacosInicialQtd = (qtdEspacosQtd/2) + 1;
				qtdEspacosFinalQtd = qtdEspacosQtd/2;
			}
			
			for(int i = 0; i<qtdEspacosInicial; i++){
				System.out.print(espaco);
			}
			System.out.print(ingrediente.toUpperCase());
			for(int i = 0; i<qtdEspacosFinal; i++){
				System.out.print(espaco);
			}
			System.out.print("-");
			for(int i = 0; i<qtdEspacosInicialQtd; i++){
				System.out.print(espaco);
			}
			System.out.print(ingredientesTotais.get(ingrediente));
			for(int i = 0; i<qtdEspacosFinalQtd; i++){
				System.out.print(espaco);
			}
			System.out.println();
			
		}
		System.out.println("--------------------------");
		System.out.println("Total da Compra = R$ " + carrinho.getTotalPizzas() + ",00");
	
	}
	
}
