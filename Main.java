import java.util.Scanner;

public class Main {

    public static int SelecaoTexto(){
        int selecao;
        while(true){
            try{
                System.out.println("1\t\t=>\t\tSoma de 3 argumentos\n" +
                        "2\t\t=>\t\tVerifica se número é positivo ou negativo\n" +
                        "3\t\t=>\t\tLê valor do produto, aplica impostos e retorna o produto com imposto e lucro de 40%\n" +
                        "4\t\t=>\t\tPega um valor da cotação do Dólar e uma quantidade de Dólares, e retorna o valor relativo em reais\n" +
                        "0\t\t=>\t\tFECHA O PROGRAMA\n\n");

                System.out.print("Digite sua opção: ");
                selecao = new Scanner(System.in).nextInt();

                if (selecao < 0) {
                    System.out.println("\n\nDigite uma opção VÁLIDA!\n\n");
                    continue;
                } else if (selecao > 4) {
                    System.out.println("\n\nDigite uma opção VÁLIDA!\n\n");
                    continue;
                }else{
                    break;
                }


            } catch (Exception e) {
                System.out.println("\n\nDigite uma opção VÁLIDA!\n\n");
                continue;
            }
        }
        return selecao;

    }

    public static void main(String[] args) {
        System.out.println("Atividade SENAI 29/4/2022 - Exercícios de Funções 1 e 2, o básico de funções - Curso: Desenvolvedor Java Vespertino\n\n");

        int num1,num2,num3,num4;
        Double num1_double;

        Boolean run = true;
        while(run){
            int selecionado = SelecaoTexto();

            switch (selecionado) {
                case 1:
                    System.out.println("\n\nDigite 3 números para que a função retorne a soma");
                    System.out.print("Num1 = ");
                    num1 = new Scanner(System.in).nextInt();
                    System.out.print("Num2 = ");
                    num2 = new Scanner(System.in).nextInt();
                    System.out.print("Num3 = ");
                    num3 = new Scanner(System.in).nextInt();

                    System.out.println("\nA soma dos 3 números é "+Funcoes1.Soma3(num1,num2,num3)+"\n\n");
                    continue;

                case 2:
                    System.out.println("\n\nDigite um número");
                    num1 = new Scanner(System.in).nextInt();

                    System.out.println("Resultado do seu número: "+Funcoes1.PositivoNegativo(num1) + "\n\n");
                    continue;

                case 3:
                    System.out.print("Valor do Produto = ");
                    num1_double = new Scanner(System.in).nextDouble();
                    System.out.print("Porcentagem = ");
                    num1 = new Scanner(System.in).nextInt();
                    System.out.println("Valor do Lucro + impostos = "+Funcoes2.AplicaImpostoElucro(num1_double, num1) + "\n\n");
                    continue;

                case 4:
                    System.out.print("Valor do Dolar (quantos reais vale um dólar) = ");
                    num1_double = new Scanner(System.in).nextDouble();
                    System.out.print("Quantidade de dólares = ");
                    num1 = new Scanner(System.in).nextInt();

                    System.out.println("Quantos reais custa = "+ Funcoes2.CotacaoDolar(num1_double,num1)+"\n\n");
                    continue;

                case 0:
                    run = false;
                    break;
            }

        }
    }
}
