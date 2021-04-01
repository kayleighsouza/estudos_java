
public class Endereco {

	public static String endPadrao = "Rua Não Declarada";
	String estado;
	String cidade;
	String nomeRua;
	int numRua;
	int cep;
	
	public Endereco(String estado, String cidade, String nomeRua, int numRua, int cep) {
		this.estado = estado;
		this.cidade = cidade;
		this.nomeRua = nomeRua;
		this.numRua = numRua;
		this.cep = cep;
	}



	@Override
	public String toString() {
		return "Endereco [estado=" + estado + ", cidade=" + cidade + ", nomeRua=" + nomeRua + ", numRua=" + numRua
				+ ", cep=" + cep + "]";
	}
}
