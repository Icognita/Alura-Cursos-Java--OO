package br.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();// pode ser usadno o a Arraylist que dá certo
	private Set<Aluno> alunos = new LinkedHashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	@Override
	public String toString() {

		return "[Curso:" + nome + "tempo total: " + this.getTempoTotal() + "aulas:  " + this.aulas + "]";
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos); // nõ é modificado copia defensiva
	}

	public boolean estaMatriculado(Aluno alunos) {

		return this.alunos.contains(alunos);
	}

	public Aluno buscaMatriculados(int numero) {
		if(!matriculaParaAluno.containsKey(numero))
		
		    throw new NoSuchElementException(" Numero de matricula nao encontrada");
		return matriculaParaAluno.get(numero);

	}

}

/// ou assim:

//public int getTempoTotal() {
//    int tempoTotal = 0;
//    for (Aula aula : aulas) {
//        tempoTotal += aula.getTempo();
//    }
//    return tempoTotal;
//}
