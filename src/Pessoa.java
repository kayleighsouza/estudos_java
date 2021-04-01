
public class Pessoa {

	Endereco end;


	String nome;
	String sobrenome;
	String sexo;
	String cpf;

	void cadastro(String nome, String sobrenome, String sexo, String cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Pessoa [end=" + end + ", nome=" + nome + ", sobrenome=" + sobrenome + ", sexo=" + sexo + ", cpf=" + cpf
				+ "]";
	}

}
