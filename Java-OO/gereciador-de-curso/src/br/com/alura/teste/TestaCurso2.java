package br.com.alura.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.Aula;
import br.com.alura.Curso;

public class TestaCurso2 {

	public static void main(String[] args) {
		
		
		 Curso javaColecoes = new Curso("Dominando as colecoes do Java",
	                "Paulo Silveira");

	        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
	        javaColecoes.adiciona(new Aula("Criando uma Aula",20));
	        javaColecoes.adiciona(new Aula("Modelando com colecoes",24));

	        List<Aula> aulasImutaveis = javaColecoes.getAulas();
	        System.out.println(aulasImutaveis);

	        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

	        Collections.sort(aulas);
	        System.out.println(aulas);
	        System.out.println(javaColecoes.getTempoTotal());
	        System.out.println(javaColecoes);
		
	
		
		
		
		
		
//		Curso javaColecoes =new Curso("Dominando as colecoes do java", "Paulo Silveira");
//	
//
//		javaColecoes.adiciona(new Aula("Trabalhando com Array",21));
//		javaColecoes.adiciona(new Aula("criando aula",20));
//		javaColecoes.adiciona(new Aula("modelando dados",15));
//		
//		
//		List<Aula> aulasImutaveis =javaColecoes.getAulas();
//		System.out.println(aulasImutaveis);
//		
//		
//		List<Aula> aulas= new ArrayList<>(aulasImutaveis);
//		
//		///para ordena-la
//		
//		Collections.sort(aulas);
//		System.out.println(aulas);

	}

}
