
public class FuncionarioTeste {
	
	private String nome;
	private String cpf;
	private double salario;
	private int tipo =0;
	protected int senha;
	// 0-funcionário comum,1- gerente-2- diretor
	// funcionario recebe uma bonificação de 10% 
	//Os gets podem ser criado mesmo que não haja atributo
	
	 public FuncionarioTeste() {
		 
	 }
	 public boolean autenticacao(int senha) {
		 if (this.senha==senha) {
			 return true;
		 } else {
			 return false;
		 }
			 
		 
		 
		 
	 }
	public  double getBonificacao() {
		if(this.tipo==0) {
			return this.salario*0.1; //funcionário comum
		}else if(this.tipo ==1) {
			return this.salario; // Gerente
		}else {
			return this.salario +1000.00;
		}
		
	}
	 public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	 
	 public int getTipo() {
		return tipo;
	}
	
	
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
