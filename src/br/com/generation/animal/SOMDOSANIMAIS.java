package br.com.generation.animal;

import br.com.generation.animal.CACHORRO;
import br.com.generation.animal.CAVALO;
import br.com.generation.animal.PREGUICA;

public class SOMDOSANIMAIS {
	public static void main (String [] args) {
		
		CACHORRO cach = new CACHORRO();
		CAVALO cav = new CAVALO();
		PREGUICA preg = new PREGUICA();
	
		
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