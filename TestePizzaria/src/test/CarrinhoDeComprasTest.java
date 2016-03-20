package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.CarrinhoDeCompras;
import model.Pizza;

public class CarrinhoDeComprasTest {

	@Test
	public void testPrecoTotal() {
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
		
		assertEquals(58, carrinho.getTotalPizzas());
	}
	
	@Test
	public void testImpedePizzaVazia() {
		Pizza p = new Pizza();
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionarPizza(p);
		
		assertEquals(0, carrinho.getTotalPizzas());
	}

	

}
