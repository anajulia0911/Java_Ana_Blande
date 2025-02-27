import java.util.Scanner;

public class Engajamento{
    public static void main (String [] args){

        Scanner entrada = new Scanner (System.in);

        System.out.print("Insira o número de publicações para análise: ");
        int numPublicacoes = entrada.nextInt();

        int totalCurtidas = 0;

        for (int i = 1; i <= numPublicacoes; i++) {
            System.out.printf("Informe quantas curtidas a publicação recebeu #%d: ", i);
            int numCurtidas = entrada.nextInt();

            totalCurtidas = totalCurtidas + numCurtidas;

            if (numCurtidas >= 100){
                System.out.println("\tPublicação Popular!");
            }
            else {
                System.out.println("\tPublicação com poucas curtidas :(");
            }
        }

        double mediaCurtidas = (double) totalCurtidas/numPublicacoes;
        System.out.printf("A média das curtidas é: %.1f\n " + mediaCurtidas);

        System.out.printf("Número de publicações: %d\n", numPublicacoes);


        entrada.close();
    }
}