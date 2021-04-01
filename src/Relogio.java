
public class Relogio {	

	int hora;
	int minuto;
	int segundo;
	
	void acertarPonteiro(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	int lerHora() {
		return hora;
	}

	int lerMinuto() {
		return minuto * 5;
	}

	int lerSeg() {
		return segundo * 5;
	}
}
