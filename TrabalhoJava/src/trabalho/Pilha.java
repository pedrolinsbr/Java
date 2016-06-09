package trabalho;

import java.util.ArrayList;

public class Pilha {
	static ArrayList<String> Operadores = new ArrayList<String>();

	public void inserePilha(String Numero) {
		Pilha.Operadores.add(Numero);
		//exibirPilha();
	}

	public void removePilha() {
		System.out.println("Removendo item: "+Operadores.get(Pilha.Operadores.size() -1).toString() );
		Pilha.Operadores.remove(Pilha.Operadores.size() -1);
	}

	public void exibirPilha() {
		System.out.println("Exibindo Pilha com operandos digitados: "+ Operadores.toString());
	}

}

