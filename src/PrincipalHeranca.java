
public class PrincipalHeranca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fornecedor a = new Fornecedor("David","Casa",1234, 10,1);
		Empregado b = new Empregado ("Fabio","Apartamento",55555,1010,1000,10);
		Administrador c = new Administrador("Carlos","Sala",3333,121212,2000,20,200);
		Operario d = new Operario ("Operario","Obra",4444,4141,3000,30,200,10);
		Vendedor e = new Vendedor("Vendedor","Loja",55555,050505,3000,10,100,10);
		
		System.out.println(a.obeterSaldo());
		System.out.println(b.aumentarSalario());
		System.out.println(c.aumentarSalario());
		System.out.println(d.aumentarSalario());
		System.out.println(e.aumentarSalario());
		
		System.out.println("Teste no git comit");
	}

}
