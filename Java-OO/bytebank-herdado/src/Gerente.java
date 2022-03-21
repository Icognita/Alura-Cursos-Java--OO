
public class Gerente extends Funcionario implements Autenticavel {
	

	
	
	private AutenticacaoUtil autenticador;

	public Gerente() {
	
		this.autenticador=new AutenticacaoUtil();
	}

	public  double getBonificacao() {
		return super.getSalario();   //sueper neste contexto substiui o this. pq o this na verdade È para atributo desta class. j¡ O SUPER … DA CLASS QUE MAE
	}

	@Override
	public void setSenha(int senha) {
      this.autenticador= new AutenticacaoUtil();
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);

	}
}
	
	
	
	
	


