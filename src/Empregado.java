
public class Empregado extends Pessoa {


//	os atributos codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem
	//		retida dos impostos).
	private int codigoSetor;
	private float salarioBase;
	private int imposto;
	
	public Empregado(String nome, String endereco, int telefone, int codigoSetor, float salarioBase, int imposto) {
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	public Empregado(int codigoSetor, float salarioBase, int imposto) {
		super();
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	public Empregado() {
		super();
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public int getImposto() {
		return imposto;
	}

	public void setImposto(int imposto) {
		this.imposto = imposto;
	}
	
	public float aumentarSalario() {
		return (this.salarioBase-((this.salarioBase*this.imposto)/100)  );
	}
}
