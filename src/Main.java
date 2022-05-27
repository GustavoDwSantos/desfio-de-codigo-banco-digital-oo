
public class Main {

	public static void main(String[] args) {
		Cliente gustavo = new Cliente("gustavo","111.111.111-47",18);
		
		Conta cc = new ContaCorrente(gustavo);
		Conta poupanca = new ContaPoupanca(gustavo);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
