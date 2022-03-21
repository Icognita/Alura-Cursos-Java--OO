
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
		System.out.println("chamando o metódo de bonificaçao do Gerente");
//		return super.getBonificacao() +super.salario; //sueper neste contexto substiui o this. pq o this na verdade é para atributo desta class. jÁ O SUPER É DA CLASS QUE MAE
		return super.getSalario();
	}
}
	
	
	
	
	


