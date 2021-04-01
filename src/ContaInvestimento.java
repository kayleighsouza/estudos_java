
public class ContaInvestimento extends ContaBancaria {

	double calculo;

	public void calcularSaldo() {
		calculo = (this.saldo / 100) * 5;
		this.saldo += calculo;
		System.out.println("o saldo final é " + this.saldo);

	}

}
