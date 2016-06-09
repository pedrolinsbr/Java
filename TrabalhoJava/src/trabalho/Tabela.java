package trabalho;

public class Tabela
{
    private static char[] vetor = {'(','^','*','/','+','-',')'};

    private static boolean[][] matriz = {{false,false,false,false,false,false,true },
                                         {false,true ,true ,true ,true ,true ,true },
                                         {false,false,true ,true ,true ,true ,true },
                                         {false,false,true ,true ,true ,true ,true },
                                         {false,false,false,false,true ,true ,true },
                                         {false,false,false,false,true ,true ,true },
                                         {false,false,false,false,false,false,false}};

    private static int getPosicao (char opr)
    {
        int ret = -1;

        for (int i=0; i<Tabela.vetor.length; i++)
            if (Tabela.vetor[i]==opr)
            {
                ret = i;
                break;
            }
        System.out.println("Tabela.vetor: "+Tabela.vetor[0]);
        System.out.println("posicao: "+ ret);	
        return ret;
    }

    public static boolean devoDesempilhar (char opr1, char opr2) throws Exception
    {
        int pos1 = Tabela.getPosicao(opr1),
            pos2 = Tabela.getPosicao(opr2);
        
        
        if (pos1==-1)
            throw new Exception ("Operador 1 invalido");

        if (pos2==-1)
            throw new Exception ("Operador 2 invalido");

        return Tabela.matriz[pos1][pos2];
    }
}