
public class Administrador extends Empregado{

	private float ajudaDeCusto;

	
	public Administrador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrador(int codigoSetor, float salarioBase, int imposto) {
		super(codigoSetor, salarioBase, imposto);
		// TODO Auto-generated constructor stub
	}

	public Administrador(String nome, String endereco, int telefone, int codigoSetor, float salarioBase, int imposto) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		// TODO Auto-generated constructor stub
	}

	
	public Administrador(String nome, String endereco, int telefone, int codigoSetor, float salarioBase, int imposto,
			float ajudaDeCusto) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public float getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(float ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public float aumentarSalario() {
		return (  getSalarioBase()+this.ajudaDeCusto  );
	}
	 
	// Note que dever�	redefinir na classe Administrador o m�todo herdado calcularSalario (o sal�rio de um
	//	administrador � equivalente ao sal�rio de um empregado usual acrescido das ajuda de custo).
	//Escreva um programa de teste adequado para esta classe
}
