
public class Vendedor extends Empregado{
		/* valorVendas (correspondente ao valor monetário dos artigos vendidos) e o atributo
comissao (porcentagem do valorVendas que será adicionado ao vencimento base do Vendedor).
*/
	private float valorVendas;
	private int comissao;
	public Vendedor(String nome, String endereco, int telefone, int codigoSetor, float salarioBase, int imposto,
			float valorVendas, int comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	public Vendedor() {
		super();
	}
	public Vendedor(int codigoSetor, float salarioBase, int imposto) {
		super(codigoSetor, salarioBase, imposto);
		// TODO Auto-generated constructor stub
	}
	public Vendedor(String nome, String endereco, int telefone, int codigoSetor, float salarioBase, int imposto) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		// TODO Auto-generated constructor stub
	}
	public float getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(float valorVendas) {
		this.valorVendas = valorVendas;
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
