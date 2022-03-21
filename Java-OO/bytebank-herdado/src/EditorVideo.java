
public class EditorVideo extends Funcionario{
	
	
	

	public  double getBonificacao() {
		System.out.println("Chamando o metódo de bonificaçao do Editor de video");
//		return super.getBonificacao() +100; //sueper neste contexto substiui o this. pq o this na verdade é para atributo desta class. jÁ O SUPER É DA CLASS QUE MAE
		return 150;
	}
}
