
public class Fornecedor extends Pessoa {

		private float valorCredito;
		private float valorDivida;
		
		
		public Fornecedor() {
			super();
		}


		public Fornecedor(float valorCredito, float valorDivida) {
			super();
			this.valorCredito = valorCredito;
			this.valorDivida = valorDivida;
		}

		
		
		public Fornecedor(String nome, String endereco, int telefone, float valorCredito , float valorDivida) {
			super(nome, endereco, telefone);
			this.valorCredito = valorCredito;
			this.valorDivida = valorDivida;
		}

		public float obeterSaldo() {
			
			float saldo = (this.valorCredito - this.valorDivida);
			return saldo;
		}
		public float getValorCredito() {
			return valorCredito;
		}


		public void setValorCredito(float valorCredito) {
			this.valorCredito = valorCredito;
		}


		public float getValorDivida() {
			return valorDivida;
		}


		public void setValorDivida(float valorDivida) {
			this.valorDivida = valorDivida;
		}
		
		
}
