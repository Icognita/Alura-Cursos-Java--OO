package byteBanckComposto;



public class Conta {

	double saldo;
		int agencia;
		int numero;
		Cliente titular;// referencia para outa
		
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
		// met�do para esconder o saldo. 
		public double getSaldo(Conta conta) {
			// TODO Auto-generated method stub
			return conta.saldo;
		}
		

	  

}
