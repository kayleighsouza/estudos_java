import java.util.Date;

public class Produto {

	public Produto(String nome, double peso, Date data) {
		this.nome = nome;
		this.peso = peso;
		this.data = data;
	}

	private String nome;
	private double peso;
	private Date data;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
		
		
	}

}
