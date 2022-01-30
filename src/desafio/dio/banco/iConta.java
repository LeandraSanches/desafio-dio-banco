package desafio.dio.banco;

public interface iConta {
	
	
	public void sacar(double valor); 
		
	
	
    public void depositar(double valor);
		
	

    public void transferir(double valor, conta contaDestino); 
	
    public void imprimirExtrato();

}
