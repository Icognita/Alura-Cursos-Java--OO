
public class Gerente extends Funcionario {
	

	private int senha;
	

	 public void setSenha(int senha) {
		this.senha = senha;
	} 
	
	 
	 public boolean autentica( int senha) {
		  if(this.senha == senha) {
			  return true;
		  }else {
			  return false;
		  }
	 }
	
	public  double getBonificacao() {
		System.out.println("chamando o met�do de bonifica�ao do Gerente");
//		return super.getBonificacao() +super.salario; //sueper neste contexto substiui o this. pq o this na verdade � para atributo desta class. j� O SUPER � DA CLASS QUE MAE
		return super.getSalario();
	}
}
	
	
	
	
	


