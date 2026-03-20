package utils;
import java.time.Year;


public class GeradorCaso {

	private static int contador = 1;
	
	public static String gerarNumeroCaso() {
		int ano = Year.now().getValue();
		
		String numero = String.format("CASO-%d-%04d", ano, contador);
		
		contador++;
		
		return numero;
	}
}
