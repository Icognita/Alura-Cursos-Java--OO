
public class EditorVideo extends Funcionario{
	
	
	

	public  double getBonificacao() {
		System.out.println("Chamando o met�do de bonifica�ao do Editor de video");
//		return super.getBonificacao() +100; //sueper neste contexto substiui o this. pq o this na verdade � para atributo desta class. j� O SUPER � DA CLASS QUE MAE
		return 150;
	}
}
