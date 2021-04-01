
public class Porta implements Cloneable {

	private double altura;
	private double largura;
	private boolean aberta;

	public double getAltura() {
		return altura;
	}

	public double getLargura() {
		return largura;
	}

	public boolean isAberta() {
		return aberta;
	}

	public void abrir() {
		this.aberta = true;
	}

	@Override
	public String toString() {
		return "Porta [altura=" + altura + ", largura=" + largura + ", aberta=" + aberta + "]";
	}

	public void fechar() {
		this.aberta = false;

	}

	@Override
	public Porta clone() {
		return new Porta(altura, largura, aberta);
	}

	public Porta(double altura, double largura, boolean aberta) {
		this.altura = altura;
		this.largura = largura;
		this.aberta = aberta;
	}

}
