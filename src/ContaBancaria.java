
public abstract class ContaBancaria {

	protected double saldo;
	

	public double getSaldo() {
		return saldo;
	}

	public void sacar(double saqueValor) {
		if (saqueValor > saldo) {
			System.out.println("Saque invalido");
		} else {
			this.saldo -= saqueValor;
		}
	}

	public void depositar(double depositoValor) {
		this.saldo += depositoValor;
	}

	public void transferir(double transfValor, ContaBancaria conta) {
		this.sacar(transfValor);
		conta.depositar(transfValor);
	}

	public abstract void calcularSaldo();

}
