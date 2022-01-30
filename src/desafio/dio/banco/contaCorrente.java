package desafio.dio.banco;

public class contaCorrente extends conta  {
	
	

	public contaCorrente(cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		System.out.println("====== Extrato Conta Corrente ======");
		super.imprimirInfoscomuns();
				
	}

	
	
	
	

}
