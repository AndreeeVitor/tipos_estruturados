import java.util.Scanner;

public class Uni6Exe02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float vetorReal[] = new float[12];
        float num = 0;
        float soma = 0;

        for (int i = 0; i < 12; i++){
            System.out.print("Digite o número [" + i + "] do vetor: ");
            num = input.nextFloat();

            vetorReal[i] = num;
        }

        for (int i = 0; i < 12; i++){
            soma = vetorReal[i] + soma;
        }
        System.out.println("\nSoma: " + soma);
        float media = soma / 12;
        System.out.println("Média: " + media + "\n");

        for (int i = 0; i < 12; i++){
            if(vetorReal[i] > media){
                System.out.println(vetorReal[i]);
            }
        }
        input.close();
    }
}
