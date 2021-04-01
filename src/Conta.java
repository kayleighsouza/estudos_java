
public class Conta {

	private double saldo;
	

	public double getSaldo() {
		return saldo;
	}

	public void sacar(double saqueValor) throws ValorInvalidoException, SaldoInsuficienteException {
		if (saqueValor <= 0) {
			throw new ValorInvalidoException("O valor" + saqueValor + "� inv�lido.");
		}
		
		if (saqueValor > saldo) {
			throw new SaldoInsuficienteException("Voc� tentou sacar " + saqueValor + ",mas seu saldo � " + saldo);
		} else {
			this.saldo -= saqueValor;
		}
	}

	public void depositar(double depositoValor) throws ValorInvalidoException {
		if (depositoValor <= 0) {
			throw new ValorInvalidoException("O valor " + depositoValor + " � inv�lido.");
		} else {
			this.saldo += depositoValor;	
		}
	}

	public void transferir(double transfValor, ContaBancaria conta) throws ValorInvalidoException, SaldoInsuficienteException {
		this.sacar(transfValor);
		conta.depositar(transfValor);
	}

}
