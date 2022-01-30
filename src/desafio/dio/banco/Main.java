package desafio.dio.banco;

public class Main {

	public static void main(String[] args) {
		
		cliente Leandra = new cliente();
		Leandra.setNome("Leandra");
		
		
		// TODO Auto-generated method stub
		conta cc = new contaCorrente(Leandra);
		conta cp = new contaPoupanca(Leandra);
		cc.depositar(100);
		cc.sacar(50);
		cp.depositar(250);
		cp.transferir(100, cc);
		
		cc.imprimirExtrato();
		
		cp.imprimirExtrato();
	
				

	}

}
