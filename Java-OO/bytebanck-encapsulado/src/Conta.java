



public class Conta {

	private     double saldo;
	private 	int agencia;
	private 	int numero;
	private 	Cliente titular;// referencia para outa
	private     static int total;// stactica quer dizer da classe, ou seja esse total é da Conta
	
	
	
	
	public Conta(int agencia, int numero) {
	Conta.total++;
//		System.out.println("o total de conta é " + total);
		 this.agencia= agencia;
		 this.numero = numero;
//		 System.out.println("Estou criando uma conta " + this.numero);
	}
	
	
		
		public void deposita(double valor) {
			this.saldo += valor;
		}
		
		public boolean saca(double valor) {
			if (this.saldo>=valor) {
				this.saldo -=valor;
				return true;
			}else {
				return false;
			}
			
		}
		
		public boolean transfere(double valor, Conta destino) { 
	        if(this.saldo >= valor) { 
	            this.saldo -= valor;
	            destino.deposita(valor);
	            return true;
	        }
	      		return false;
		       	     
	    }
		// metódo para esconder o saldo. 
		public double getSaldo(Conta conta) {
			// TODO Auto-generated method stub
			return conta.saldo;
		}
		
		public int getNumero() {
			return this.numero;
			
		}
		
		 public void setNumero(int numero) {
			 
			 if(numero<=0) {
				 System.out.println("Nao pode numero menor ou igual a zero");
				 return;
			 }
			 this.numero= numero;	
		}
		

	  public int getAgencia() {
		  		  
		return this.agencia;
	}
	  public void setAgencia(int agencia) {
		  
		  if(agencia <=0 ) {
			  System.out.println("nao pode valores maior ou igual a zero");
			  return;		  }
			  
			  
		this.agencia = agencia;
	}
	  public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	  public Cliente getTitular() {
		return titular;
	}
	  
	  public static int getTotal() {
		  return Conta.total;
	  }

}
