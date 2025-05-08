import java.util.Scanner;

public class Uni6Exe03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            
        float vetorReal[] = new float[12];

        for(int i = 0; i < 12; i++){
            System.out.print("Digite o número [" + i + "] do vetor: ");
            vetorReal[i] = input.nextFloat();
        }

        for(int i = 0; i < 12; i++){
            if (i % 2 != 0){
                System.out.println("Posição [" + i + "] do vetor, é ímpar (aumento de 5% no número " + vetorReal[i] +"): " + (vetorReal[i] * 0.05 + vetorReal[i]));
            }
            else
            System.out.println("Posição [" + i + "] do vetor, é par (aumento de 2%): " + (vetorReal[i] * 0.02 + vetorReal[i]));
        }
        input.close();
    }
}
