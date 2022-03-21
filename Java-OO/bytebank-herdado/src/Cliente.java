
public class Cliente implements Autenticavel{

	private AutenticacaoUtil autenticador;// criar um atributo/ o autenticador delega a chamada
	
public Cliente() {
this. autenticador= new AutenticacaoUtil();
		
		
		
		
		
		
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
