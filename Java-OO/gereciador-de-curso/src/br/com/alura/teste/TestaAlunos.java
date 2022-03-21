package br.com.alura.teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

;

public class TestaAlunos {

	public static void main(String[] args) {
	Collection<String>alunos =new HashSet<>();
	alunos.add("Rodrigo");
	alunos.add("Alberto");
	alunos.add("Nico");
	alunos.add("Maria");
	alunos.add("Jose");
	alunos.add("Pedro");
	alunos.add("Pedro");
	
	
//	para procurar um elemento dentro da lista
	
	boolean pedroEstaAi =  alunos.contains("Pedro");
	System.out.println(pedroEstaAi);
	
	alunos.remove("Maria");
	

	for (String aluno: alunos) {
		System.out.println(aluno);
		
	}
	alunos.forEach(aluno ->{
//		System.out.println(aluno);
	});

	 System.out.println(alunos.size());
	 
	// para pegar uma posição de um elemento de um set podemos fazer assim;
	 
	 List<String>alunosEmLista = new  ArrayList<>(alunos);
	   Collections.sort(alunosEmLista);
        alunosEmLista.get(5);
        System.out.println(alunosEmLista);
	 
	 

	}

}
