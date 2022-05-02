//Funções da Atividade 7


/*
Faça
um programa, com uma função que necessite de três argumentos(parâmetros), e que forneça a
soma desses três argumentos(parâmetros).


Faça um programa, com uma função que necessite de um argumento. A função
retorna o valor de caractere ‘P’, se seu argumento for positivo, e ‘N’, se seu
argumento for zero ou negativo.
 */
public class Funcoes1 {
    public static int Soma3(int n1, int n2, int n3){
        return n1+n2+n3;
    }

    public static String PositivoNegativo(int n){
        if(n == 0 || n < 0){
            return "N";
        }else{
            return "P";
        }
    }
}
