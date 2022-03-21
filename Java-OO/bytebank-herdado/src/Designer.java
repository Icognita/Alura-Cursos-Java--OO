
public class Designer extends Funcionario{
	
	
	

	public  double getBonificacao() {
		System.out.println("Chamando o metódo de bonificaçao Designer");
		return 200; //sueper neste contexto substiui o this. pq o this na verdade é para atributo desta class. jÁ O SUPER É DA CLASS QUE MAE
	}
}
