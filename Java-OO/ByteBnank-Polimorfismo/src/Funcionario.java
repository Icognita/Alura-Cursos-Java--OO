// n�o pode instaciar dessa classe, pq � abstrata!
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	protected double salario;
	
	// funcionario recebe uma bonifica��o de 10% 
	//Os gets podem ser criado mesmo que n�o haja atributo
	
	 public Funcionario() {
		 
	 }
	//metodod sem corpo nao foi imprementado//os filhos precisa implemetar
	public abstract  double getBonificacao();
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
