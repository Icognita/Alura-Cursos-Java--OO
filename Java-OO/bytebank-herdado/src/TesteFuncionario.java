
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario nico= new Funcionario();
		nico.setNome("Nico");
		nico.setCpf("222.222.222-55");
		nico.setSalario(5000.00);
		
		
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
	

	}

}
