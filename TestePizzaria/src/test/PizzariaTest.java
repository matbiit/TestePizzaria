package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import model.Pizza;

public class PizzariaTest {

	@After
	public void testZerarRegistro(){
		Pizza.zerarRegistro();
		assertNull(Pizza.getIngredientesTotais().get("bacon"));
	}
	
	@Test
	public void testPizzaIngredienteNull() {
		Pizza p = new Pizza();
		p.adicionaIngrediente(null);
		assertEquals(0, p.getPreco());
	}
	
	@Test
	public void testPizzaIngredienteEspaco() {
		Pizza p = new Pizza();
		p.adicionaIngrediente(" ");
		assertEquals(0, p.getPreco());
	}
	
	@Test
	public void testPizzaComMenosTresIngredientes() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("Mussarela");
		assertEquals(15, p.getPreco());
	}
	
	@Test
	public void testPizzaComTresIngredientes() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("Mussarela");
		p.adicionaIngrediente("Presunto");
		p.adicionaIngrediente("Parmesão");
		assertEquals(20, p.getPreco());
	}
	
	@Test
	public void testPizzaComCincoIngredientes() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("Mussarela");
		p.adicionaIngrediente("Presunto");
		p.adicionaIngrediente("Parmesão");
		p.adicionaIngrediente("Bacon");
		p.adicionaIngrediente("Provolone");
		assertEquals(20, p.getPreco());
	}
	
	@Test
	public void testPizzaComMaisCincoIngredientes() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("Mussarela");
		p.adicionaIngrediente("Presunto");
		p.adicionaIngrediente("Parmesão");
		p.adicionaIngrediente("Bacon");
		p.adicionaIngrediente("Catupiry");
		p.adicionaIngrediente("Provolone");
		assertEquals(23, p.getPreco());
	}
	
	@Test
	public void testRegistroMesmoIngredientesDuasPizzas() {
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		
		String ingrediente = "Mussarela";
		p1.adicionaIngrediente(ingrediente);
		p2.adicionaIngrediente(ingrediente);
		assertEquals((Integer)2, Pizza.getIngredientesTotais().get(ingrediente.toLowerCase()));
		
	}

}
