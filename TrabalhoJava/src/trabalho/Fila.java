package trabalho;

import java.util.ArrayList;

public class Fila {
	String fila[];
	static ArrayList<String> Numeros = new ArrayList<String>();	
	
	public void insereFila(String Numero) {
	    Fila.Numeros.add(Numero);
	    //exibirFila();
	}
	
	public void removeFila() {
		System.out.println("Removendo item: "+Numeros.get(0).toString() );
	    Fila.Numeros.remove(0);
	    exibirFila();
	}
	public void exibirFila() {
		System.out.println("Exibindo fila com numeros digitados: "+Numeros.toString());
	}
}
