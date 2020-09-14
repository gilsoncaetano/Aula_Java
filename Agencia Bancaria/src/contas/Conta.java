package contas;

public class Conta {
	//atributos
	public String cliente;
	public double saldo;
	
	//Construtor
	public Conta() {
		System.out.println("Ag�ncia 0267 ");
	}
	
	//m�todos
	public void exibirSaldo() {
		System.out.println("Saldo: R$ " + saldo);	
	}
	// m�todo sem retorno com pacote
	void sacar(double valor) {
		saldo -= valor; //saldo = - valor 
		System.out.println("D�dito: " + valor);
	}
	void depositar(double valor) {
		saldo -= valor; //saldo = - valor 
		System.out.println("Cr�dito: " + valor);
	}
	// m�todo sem retorno com objeto
	//conta -> classe modelo
	// destino e o objeto
	void transferir(Conta destino, double valor) {
		this.sacar(valor); //1� voc� debita da conta 
		destino.depositar(valor); //2� transfer�ncia
		System.out.println("Transfer�ncia: " + valor);
	}
	// m�todo com retorno
	double soma(double conta1, double conta2) {
		double total = conta1 + conta2;
		return total;
	}
}
