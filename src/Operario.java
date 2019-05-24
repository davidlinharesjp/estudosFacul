
public class Operario extends Empregado {
	
	private float valorProducao ;
	private int comissao;

	public Operario(String nome, String endereco, int telefone, int codigoSetor, float salarioBase, int imposto,
			float valorProducao, int comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public Operario() {
		super();
	}

	public float getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(float valorProducao) {
		this.valorProducao = valorProducao;
	}

	public int getComissao() {
		return comissao;
	}

	public void setComissao(int comissao) {
		this.comissao = comissao;
	}
	
	public float aumentarSalario() {
		return (getSalarioBase()+((getSalarioBase()*this.comissao)/100)  );
	}
	
	

}
