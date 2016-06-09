package trabalho;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Calculo {
 String expressao;
 Calculo proximo;
 
 	Fila f = new Fila();
 	Pilha p = new Pilha();
     public void calcularExpressao(String expressao){
         boolean space = true;
         String numero = "";
          expressao = expressao.replaceAll("[^0-9 /+*-]", "").trim();
          System.out.println("Expressao com replace: "+expressao);
         for(int i = 0; i< expressao.length(); i++){
             char atual = expressao.charAt(i);
             if(atual == ' ' && space == true) continue;
             //SE FOR UM OPERADOR ADICIONA ELE NA LISTA
             if(atual == '+' || atual == '-' || atual == '/' || atual == '*'){
                 adicionaOperador(atual);
                 continue;
             }
             //SE FOR UM ESPACO FINALIZA O NUMERO ATUAL
             if(atual == ' '){
                 adicionaOperando(Integer.parseInt(numero));
                 numero = "";
                 space = true;
                 continue;
             }else{//SENAO CONTINUA NORMAL
                 space = false;
                 numero += expressao.charAt(i);
             }
         }
        // System.out.println("O resultado final eh: " + this.operandos.removeTopo());
     }
     
     public void tratarEntrada(String entrada){
    	 if(entrada.matches("[0-9]*") && !entrada.equals("") ) {
    		 //enfileirar
    		 //System.out.println("numero");
    		 f.insereFila(entrada);
    	 }else if((entrada.equals("+") || entrada.equals("-") || entrada.equals("/") || entrada.equals("*") || entrada.equals("^"))  && !entrada.equals("")  ){
    		 //System.out.println("mais");
    		 p.inserePilha(entrada);
    	 }else if(entrada.equals("f")){
    		 
    	 }else{
    		 JOptionPane.showMessageDialog(null, "Dados invalidos", "Erro", JOptionPane.ERROR_MESSAGE);
    		 System.exit(0);
    	 }
     }
     
     public void adicionaOperando(int i){
      //   this.operandos.insereTopo(i);
     }
     public void adicionaOperador(Character op){
        // this.operadores.insereTopo(op);
         efetuaCalculo();
     }
     
     public void efetuaCalculo(){
         int result = 0;
         int numero1;
         int numero2;
         char operador;
        // numero2 = this.operandos.removeTopo();
        // numero1 = this.operandos.removeTopo();
        // operador = this.operadores.removeTopo();
       /*  switch(operador){
             case '+':
                     result = numero1 + numero2;
                 break;
             case '-':
                     result = numero1 - numero2;
                 break;
             case '/':
                     result = numero1 / numero2;
                 break;
             case '*':
                     result = numero1 * numero2;
                 break;
         }*/
        //this.operandos.insereTopo(result);
     }
 }



