package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDaMirian=new Conta();
		contaDaMirian.saldo =100;
		contaDaMirian.deposita(50);
		
		System.out.println(contaDaMirian.saldo);
		boolean conseguiuRetirar = contaDaMirian.saca(10000);
		System.out.println(contaDaMirian.saldo);
		System.out.println(conseguiuRetirar);
		
		
		Conta contaMarcela= new Conta();
		contaMarcela.deposita(1000);
		
  boolean sucessoTransferencia= contaMarcela.transfere(300, contaDaMirian);
  
  if(sucessoTransferencia) {
	  System.out.println("Transferencia feita com sucesso");
	  
  }else {
     System.out.println("Saldo indiponivel");
}
  System.out.println(contaMarcela.saldo);
  System.out.println(contaDaMirian.saldo);
  
  contaDaMirian.titular="Mirian Menezes";
  System.out.println(contaDaMirian.titular);
  
	}

}
