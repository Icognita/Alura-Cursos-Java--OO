
public class Designer extends Funcionario{
	
	
	

	public  double getBonificacao() {
		System.out.println("Chamando o met�do de bonifica�ao Designer");
		return 200; //sueper neste contexto substiui o this. pq o this na verdade � para atributo desta class. j� O SUPER � DA CLASS QUE MAE
	}
}
