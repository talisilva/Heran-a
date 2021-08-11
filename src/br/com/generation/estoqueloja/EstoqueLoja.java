package br.com.generation.estoqueloja;

import java.util.ArrayList;

public class EstoqueLoja {

	public static void main(String[] args) {
	String armaz = "Armazenamento de dados";
	String removd = "Remover dados";
	String atdados = "Atualizar dados";
	String tdsdados = "Apresentar todos os dados";
	
	ArrayList<String> estoque = new ArrayList<>();
    estoque.add(armaz);
    estoque.add(removd);
    estoque.add(atdados);
    estoque.add(tdsdados);
    
    System.out.println(estoque);
    
    estoque.remove(0);
    
    System.out.println(estoque);
    
    for (String estoque1: estoque) {
    	System.out.println("Estoque " + estoque1);
    }
	
	}
		
	}
		

