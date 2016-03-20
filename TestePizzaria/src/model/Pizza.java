package model;
import java.util.ArrayList;
import java.util.HashMap;


public class Pizza {

	private static HashMap<String, Integer> ingredientesTotais = new HashMap<String, Integer>();
	
	private ArrayList<String> ingredientes; 
	
	public Pizza(){
		ingredientes = new ArrayList<String>(); 
	}
	
	public void adicionaIngrediente(String ingrediente){
		if( (ingrediente != null) && !(ingrediente.equals(" ")) ) {
			ingrediente = ingrediente.toLowerCase();
			ingredientes.add(ingrediente);
			contabilizaIngrediente(ingrediente);
		}
	}
	
	public int getPreco() {
		int size = ingredientes.size();
		if(size == 0){
			return 0;
		} else if (size < 3){
			return 15;
		} else if (size <= 5){
			return 20;
		} else {
			return 23;
		}
	}
	
	public static void contabilizaIngrediente(String ingrediente){
		if(ingredientesTotais.keySet().contains(ingrediente)){
			int valor = ingredientesTotais.get(ingrediente);
			ingredientesTotais.put(ingrediente, ++valor);
		} else {
			ingredientesTotais.put(ingrediente, 1);
		}
 	}

	public boolean estaSemIngredientes(){
		if(ingredientes.size() == 0){
			return true;
		}
		return false;
	}
	
	public static HashMap<String, Integer> getIngredientesTotais(){
		return ingredientesTotais;
	}
	
	public static void zerarRegistro(){
		ingredientesTotais = new HashMap<String, Integer>();
	}
	
}
