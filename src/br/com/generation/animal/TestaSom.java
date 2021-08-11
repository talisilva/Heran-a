package br.com.generation.animal;

import br.com.generation.animal.Cachorro;
import br.com.generation.animal.Cavalo;
import br.com.generation.animal.Preguica;

public class TestaSom {
	public static void main (String [] args) {
		
		Cachorro cach = new Cachorro();
		Cavalo cav = new Cavalo();
		Preguica preg = new Preguica();
	
		
		cach.setNome("Bob");
		
		
		cav.setNome("Carpeado");
		
		
		preg.setNome("Tarcila");
		
		cav.setIrrocavalo("Irrooo");
		cach.setAuauCachorro("Auau");
		preg.setZzzPreguica("Zzzz Fiooo");
		
		
		
		System.out.println("Nome do Cachorro: " + cach.getNome() +" \nSom: "+ cach.getAuauCachorro());
		
				
		System.out.println("Nome do Cavalo: " + cav.getNome() + " \nSom: " + cav.getIrrocavalo());
		
		System.out.println("Nome da Preguiça: " + preg.getNome() + " \nSom: " + preg.getZzzPreguica());
		
		
		
		
		
		
		
		
		
		
		
		


}
}