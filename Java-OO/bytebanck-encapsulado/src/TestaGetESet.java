
public class TestaGetESet {
	
	 public static void main(String[] args) {
		 Conta conta = new Conta(1010,25789);
		 
		 // da erro porque o Number está private e precise setar para alterar
//		  conta.numero=1311;
//		  
		  //
		  conta.setNumero(2530);
		  
		  System.out.println(conta.getNumero());
		  
		  Cliente paulo = new Cliente();
		  
		  
		  paulo.setNome("paulo silveira");
		  
		  conta.setTitular(paulo);
		   
		  
		  System.out.println(conta.getTitular().getNome());
		 // agora em duas linhas
		  
		  Cliente titularDaConta = conta.getTitular();
		  titularDaConta.setProfissao("programador");
		 
		  
		  System.out.println(titularDaConta); 
	        System.out.println(paulo);
	        System.out.println(conta.getTitular());
		
	}


}
