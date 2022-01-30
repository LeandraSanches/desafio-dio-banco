package desafio.dio.banco;

public abstract class conta implements iConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int Sequencial = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected cliente cliente;
	
	
	
	
	
	
	
	public conta(cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
	
		this.numero = Sequencial++;
		
		this.cliente = cliente;
		
		// TODO Auto-generated constructor stub
	}




	public int getAgencia() {
		return agencia;
	}

	
	

	public int getNumero() {
		return numero;
	}

	

	public double getSaldo() {
		return saldo;
	}

	
	

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		saldo -= valor;
		
		
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		saldo += valor;
		
	}

	@Override
	public void transferir(double valor, conta contaDestino) {
		
		// TODO Auto-generated method stub
		
		this.sacar(valor);
		contaDestino.depositar(valor); 
		
	}
	
	protected void imprimirInfoscomuns() {
		System.out.println(String.format("Titular: %s ", this.cliente.getNome()) );
		System.out.println(String.format("Agencia: %d", this.agencia) );
		System.out.println(String.format("Numero: %d", this.numero) );
		
		
		System.out.println(String.format("Saldo: %.2f", this.saldo) );
	}

}
