package desafio.dio.banco;

public class contaPoupanca extends conta {
	
	

	public contaPoupanca(cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		System.out.println("====== Extrato Conta Poupança ======");
		super.imprimirInfoscomuns();
	}

	 
	
	
	
}
