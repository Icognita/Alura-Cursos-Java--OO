
public class Testavalores {
	
	
	
	
	public static void main(String[] args) {
	
	
	Conta conta =new Conta(1010,25789);
	
    System.out.println(conta.getAgencia());
	
	// conta está inconsistente
	conta.setAgencia(-50);
	conta.setNumero(-330);
	
    Conta conta2 = new Conta(0123 ,25195);
    Conta conta3 = new Conta(1321,25489);
    
    System.out.println(Conta.getTotal());

	}
}
