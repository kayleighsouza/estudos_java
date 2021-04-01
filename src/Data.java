
public class Data {

	static final int FORMATO_12H = 12;
	static final int FORMATO_24H = 24;

	private int dia;

	public int getDia() {
		return dia;
	}

	private int mes;

	public int getMes() {
		return mes;
	}

	private int ano;

	public int getAno() {
		return ano;
	}

	private int hora;

	public int getHora() {
		return hora;
	}

	private int minuto;

	public int getMinuto() {
		return minuto;
	}

	private int segundo;

	public int getSegundo() {
		return segundo;
	}

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public Data(int dia, int mes, int ano, int hora, int minuto, int segundo) {
		this(dia, mes, ano);
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;

	}

	public void imprimir(int formato) {
		if (formato == FORMATO_12H) {
			if (this.hora > FORMATO_12H) {
				hora -= 12;
				System.out.println(dia + "/" + mes + "/" + ano + "   " + hora + ":" + minuto + ":" + segundo + "PM");
			} else {
				System.out.println(dia + "/" + mes + "/" + ano + "   " + hora + ":" + minuto + ":" + segundo + "AM");
			}
		} else {
			System.out.println(dia + "/" + mes + "/" + ano + "   " + hora + ":" + minuto + ":" + segundo);
		}

	}

}
