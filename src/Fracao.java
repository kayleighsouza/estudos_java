
public class Fracao {

	int numerador;
	int denominador;
	String nome;

	Fracao multiplicar(Fracao f) {
		Fracao f3 = new Fracao();

		f3.numerador = this.numerador * f.numerador;
		f3.denominador = this.denominador * f.denominador;

		return f3;
	}

}
