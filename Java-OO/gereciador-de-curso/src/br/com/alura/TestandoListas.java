package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		
		String aula1="Conhecendo mais de listas";
		String aula2 ="Modelando a classe Aula;";
		String aula3="Trabalhando com Cursos e Sets ";
		
		ArrayList<String> aulas =new ArrayList<String>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		aulas.remove(0);
		System.out.println(aulas);
		// metodo de percorrer o array com for 
		
		for (String aula : aulas) {
			System.out.println(" Aula:  " + aula);
			
		}
		
//		metodo de percorrer o array com get
		
		String primeiraAula=aulas.get(1);
		System.out.println("Apremimeira  aula �  " + primeiraAula);
		
		
//	X
		for(int i=0; i <aulas.size(); i++) {
			System.out.println(" aula : " + aulas.get(i));
			
//			metodo de percorrer o array com 
			aulas.forEach(myaula->{
				System.out.println("Percorrendo:");
				System.out.println(" Aula " +myaula);
				
			});
			
		}
		aulas.add ("Aumentando nosso conhecimento");
		
		System.out.println(" -----------------Depois de ordenada-----------------------------");
//
		Collections.sort(aulas);//
		System.out.println(aulas);
		

		
		
		
	}
	
}
