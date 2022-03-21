package br.com.alura.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.alura.Aula;

public class TestaListaDeAulas {

	public static void main(String[] args) {
		Aula a1 = new Aula("Revistando as ArrayLists" ,21);
		Aula a2 = new Aula ("Lista de objetos ",10);
		Aula a3 = new Aula("Relacionameno de listas e objeos", 20);
		
		ArrayList<Aula> aulas= new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas,Comparator.comparing(Aula ::getTempo));//comparando as aulas com o Tempo
		System.out.println(aulas);
		aulas.sort(Comparator.comparing(Aula ::getTempo));
		System.out.println(aulas);
	
		
	}

}
