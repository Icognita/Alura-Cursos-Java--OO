
public class Teste {

	public static void main(String[] args) {
		FuncionarioTeste f1= new FuncionarioTeste();
		f1.setSalario(1000.00);
	  System.out.println(f1.getTipo());
	  System.out.println(f1.getBonificacao());
	  
	  
	   FuncionarioTeste f2=new FuncionarioTeste();
	   f2.setTipo(1);
	   f2.setSalario(5000.0);
	   System.out.println(f2.getTipo());
	   System.out.println(f2.getBonificacao());
	  
	   FuncionarioTeste f3=new FuncionarioTeste();
	   f2.setTipo(2);
	   f2.setSalario(5000.0);
	   System.out.println(f2.getTipo());
	   System.out.println(f2.getBonificacao());
	  

	}

}
