package br.com.alura;

public class Aluno {
	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
		//progra��o defenciva
		if(nome==null) {
			throw  new NullPointerException("nome n�o pode ser null");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro =(Aluno) obj;
		return this.nome.equals(outro.nome);
	}
	 @Override
	public int hashCode() {
	
		return this.nome.hashCode();
		
	}
	

	@Override
	public String toString() {

		return "[Aluno:  " + this.nome + " , Matricula: " + this.numeroMatricula + "]";
	}

}
