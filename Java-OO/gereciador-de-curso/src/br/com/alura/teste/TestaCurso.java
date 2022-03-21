package br.com.alura.teste;

import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import br.com.alura.Aula;
import br.com.alura.Curso;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes =new Curso("Dominando as colecoes do java", "Paulo Silveira");
//		
//		javaColecoes.getAulas().add(new Aula("Trabalhando com Array",21));
		javaColecoes.adiciona(new Aula("Trabalhando com Array",21));
		javaColecoes.adiciona(new Aula("criando aula",20));
		javaColecoes.adiciona(new Aula("modelando dados",15));
		
		
//		List<Aula> aulas = javaColecoes.getAulas();
//		
//		aulas.add(new Aula("Trablhando com ArryList" , 21));
//		System.out.println(aulas);		
   
      System.out.println( javaColecoes.getAulas());
		
	


	}

}
