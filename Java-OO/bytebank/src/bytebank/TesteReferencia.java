package bytebank;

public class TesteReferencia {
	public static void main(String[] args) {
//		Conta primeiraConta = new Conta();
//		 primeiraConta.saldo =300;
//		 System.out.println("saldo da Primeira: " + primeiraConta.saldo);
//		 Conta  segundaConta= primeiraConta;
//		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
//		segundaConta.saldo +=100;
//		
//		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
//		 System.out.println("saldo da Primeira: " + primeiraConta.saldo);
//		 
//		 if (primeiraConta == segundaConta) {
//			 System.out.println("são a mesmissima conta");
//		 }
//		  System.out.println(primeiraConta);
//		  System.out.println(segundaConta);
		
		   Conta minhaConta = new Conta();
	        minhaConta.saldo = 500.0;
	        Conta outraConta = minhaConta;
	        outraConta.saldo += 1000.0;
	        System.out.println(minhaConta.saldo);
	    
	
		 


	}
	

}
