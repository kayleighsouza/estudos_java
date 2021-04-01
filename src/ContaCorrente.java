
public class ContaCorrente extends ContaBancaria {

	double calculo; 
	
	
	 public void calcularSaldo() {
		
		calculo = (this.saldo / 100) * 10;
		this.saldo -= calculo; 
		
		System.out.println("o saldo final é " + this.saldo);
		 
		 
	 }

}


//500 / 100

//5 * 10 = 50

//500 - 50 = 450;