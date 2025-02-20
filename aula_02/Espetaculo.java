package aula_02;

import java.util.Scanner;

public class Espetaculo {

    public static void main (String [] args){
        //Abre Scanner
        Scanner entrada = new Scanner(System.in);

        //Declara variável
        float custoProducao;
        float precoIngresso;
        
        //Entrada de Dados
        System.out.print("Informe o custo da produção: ");
        custoProducao = entrada.nextFloat();

        System.out.print("Informe o custo do ingresso: ");
        precoIngresso = entrada.nextFloat();

        //Processamento
        int qtdeConvites = (int) Math.ceil(custoProducao/precoIngresso);
        int qtdeConvites23 = (int) Math.ceil((custoProducao * 1.23f) / precoIngresso);

        //Sáida
        System.out.printf("Quantidade de convites a serem vendidos: %d\n" , qtdeConvites);
        System.out.printf("Quantidade de convites 23%%: %d\n" , qtdeConvites23);

    }
    
}
