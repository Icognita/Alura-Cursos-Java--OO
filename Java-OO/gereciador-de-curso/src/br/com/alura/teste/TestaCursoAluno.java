package br.com.alura.teste;

import java.util.Iterator;
import java.util.Set;

import br.com.alura.Aluno;
import br.com.alura.Aula;
import br.com.alura.Curso;

public class TestaCursoAluno {

	public static void main(String[] args) {
		
		
		Curso javaColecoes = new Curso("Dominando as colecoes do java", "Paulo Silveira");
		
		

		javaColecoes.adiciona(new Aula("Trabalhando com Array", 21));
		javaColecoes.adiciona(new Aula("criando aula", 20));
		javaColecoes.adiciona(new Aula("modelando dados", 15));
		

		Aluno a1= new Aluno("Rodrigo Turini",346712);
		Aluno a2= new Aluno("Mirian",346752);
		Aluno a3= new Aluno("Vitor",30672);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		 System.out.println("**********metodo iterator**********");
		Set<Aluno> alunos=javaColecoes.getAlunos();
		Iterator<Aluno> iterador =alunos.iterator();
		while(iterador.hasNext()) {
			Aluno proximo =iterador.next();
			System.out.println(proximo);
		}
		
		
	    
		
		//como era feito no java 5
		
//		for(Aluno a : javaColecoes.getAlunos()) {
//			System.out.println(a);
//		}
		
		
		System.out.println("*************************com set e ");
//		Set<Aluno> alunos = javaColecoes.getAlunos();
		
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(aluno -> {
		    System.out.println(aluno);
		});
		
		System.out.println("O aluno" + a1 + "está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno Turini =new Aluno("Rodrigo Turini",34672);
		System.out.println("E esse turini, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(Turini)); 
		
		System.out.println("O a1 éequals ao Turini");
		System.out.println(a1.equals(Turini));
		
		

		
		//obrigatoriamente o seguinter é true:
		System.out.println(a1.hashCode()==Turini.hashCode());
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println("lista sicronizada");
//		Set<Aluno> alunosSincronizados = Collections.synchronizedSet(alunos);
//		System.out.println(alunosSincronizados);


	    
	}

}




