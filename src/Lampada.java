
public class Lampada {

	private boolean ligada;

	public Lampada(boolean ligada) {
		this.ligada = ligada;
	}

	public void ligar() {

	}

	public void desligar() {

	}

	public void imprimir() {
		if (ligada) {
			this.ligada = true;
			
			System.out.println("L�mpada ligada");

		} else {
			this.ligada = false;
			System.out.println("L�mpada desligada");
		}

	}

}
