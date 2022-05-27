import Cliente.Cliente;
import Conta.Conta;
import Conta.ContaCorrente;
import Conta.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco();
		Cliente gustavo = new Cliente("gustavo","111.111.111-47",18);
		
		Conta cc = new ContaCorrente(gustavo);
		Conta poupanca = new ContaPoupanca(gustavo);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		gustavo.infoCliente();
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
