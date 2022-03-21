package bytebank;

public class CriarConata {
	
	public static void main(String[] args) {
		
		Conta primeiraConta =new Conta();
		primeiraConta.saldo=200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo +=100.00;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta=new Conta();
		segundaConta.saldo=50.00;
		
		Conta terceiraConta = new Conta();
		
		System.out.println("Primeira Conta tem  " + primeiraConta.saldo);
		System.out.println("Segunda conta tem  " + segundaConta.saldo);
		
		 if (primeiraConta == segundaConta) {
			 System.out.println("são a mesmissima conta");
		 }else {
			 System.out.println("contas diferetes");
		 }
		 
		  System.out.println(primeiraConta);
		  System.out.println(segundaConta);
	}

}
