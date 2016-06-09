package trabalho;

import java.util.*;

public class Expressao {
	public static void main(String[] args) throws Exception {
		StringTokenizer quebrador = null;
		Tabela t = new Tabela();
		char tokenn;
		quebrador = new StringTokenizer ("3+7*5/9","+-*/^()",true);
		while (quebrador.hasMoreTokens()){
			System.out.println(quebrador.nextToken());
			tokenn = '3';
			tokenn = '+';
			boolean result = t.devoDesempilhar(tokenn, tokenn);
			if(t.devoDesempilhar(tokenn, tokenn)){
				System.out.println("Devo Desempilhar? "+result);
				
			}
			
		}
	}
}