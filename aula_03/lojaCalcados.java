import java.util.Scanner;

public class lojaCalcados{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        //criação de vetor
        double [] preco = new double [10]; //tamanho do vetor é 10

        for(int i = 0; i < preco.length; i++){ // for para verificar o tamanho do vetor e incrementar 
            System.out.printf("Insira o preço %d: " , (i+1)); 
            preco[i] = entrada.nextDouble(); //armazena o preço do produto na variável i , que foi declarada no for
        }

        System.out.print("Insira o desconto: ");
        int desconto = entrada.nextInt(); //armazena o desconto em uma variável

        for (int i = 0; i < preco.length; i++){
            preco [i] = preco[i] - (preco [i] * desconto/100);
        }

        for (int i = 0; i < preco.length; i++){
            System.out.printf("O preço do produto %d com desconto é: %.2f\n ", i+1 , preco[i] );
        }

        entrada.close();
    }
}