import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Aplicacao {
	public static void main(String[] args) { 
		
		Calendar cal = Calendar.getInstance();
		cal.set(2020, 10, 4);
		Date dataAgua = cal.getTime();
		
		cal.set(2022, 1, 1);
		Date dataCoca = cal.getTime();
	
		cal.set(2017, 11, 12);
		Date dataLatao = cal.getTime();
		
		Produto agua = new Produto("Agua", 2.5, dataAgua);
		Produto coca = new Produto("Coca", 1.0, dataCoca);
		Produto latao = new Produto("Latao", 0.9, dataLatao);
		
		SimpleDateFormat e = new SimpleDateFormat("dd/MM/yyyy");
		String a = e.format(dataAgua);
		String c = e.format(dataCoca);
		String l = e.format(dataLatao);
		
		System.out.format("%d) %12s %09.2f %s\n", 1, agua.getNome(), agua.getPeso(), a);
		System.out.format("%d) %12s %09.2f %s\n", 2, coca.getNome(), coca.getPeso(), c);
		System.out.format("%d) %12s %09.2f %s\n", 3, latao.getNome(), latao.getPeso(), l);
	}
}
