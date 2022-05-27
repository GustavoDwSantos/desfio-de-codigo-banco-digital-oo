
public class Cliente {

	private String nome;
	private String cpf;
	private int idade;

	public Cliente(String nome, String cpf, int idade ){
		nome = this.nome;
		cpf = this.cpf;
		idade = this.idade;
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

}
