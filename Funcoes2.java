//Funções da Atividade 8

/*
Faça um programa que:
- Leia o valor de um produto (valor liquido)
- Uma função Aplique uma porcentagem de imposto sobre o produto;
- Uma função que receba o valor do produto com o imposto e aplique uma margem de lucro de 40% e
mostre para o usuário o produto com preço final
(se conseguir fazer tudo em uma só função eu aceito também)

Faça um programa que:
- Leia a cotação do dólar
- Leia um valor em dólares
- Função que Converta esse valor para Real
- Mostre o resultado
 */
public class Funcoes2 {

    public static Double AplicaImpostoElucro(Double valor_produto, int porcentagem){
        Double novo_valor = valor_produto+(valor_produto*(porcentagem/100));
        return novo_valor+(novo_valor*0.40);
    }

    public static Double CotacaoDolar(Double dolar_real, int dolares){
        return dolar_real*dolares;
    }
}
