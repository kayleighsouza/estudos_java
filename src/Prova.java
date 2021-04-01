
public class Prova {

	double notaParte1;
	double notaParte2;
	
	
	double calcularNotaTotal() {
		double soma = notaParte1 + notaParte2;
		if (soma > 10) {
			soma = 10;
		}
		return soma;
	}
}
