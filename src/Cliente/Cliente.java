package Cliente;

public class Cliente  {

	private String nome;
	private String cpf;
	private int idade;

	public Cliente(String nome, String cpf, int idade ){
		this.nome = nome;
		this.cpf = cpf;
		setIdade(idade);
	}

	private void setIdade(int idade) {
		if (maiorIdade(idade)== true)
		{
			this.idade = idade;
		}else {
			System.out.println("Idade invalida");
		};
		
	}
	

	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public int getIdade() {
		return idade;
	}

	public void infoCliente(){
		System.out.println("=== Informações do cliente ===");
		System.out.println("Nome " + nome);
		System.out.println("cpf " + cpf);
		System.out.println("idade " + idade);
		
	}

	public boolean maiorIdade(int idade){
		if (idade < 18){
			return false;
		}return true;
	}



}
