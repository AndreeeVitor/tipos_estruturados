import java.util.Scanner;

public class Uni6Exe04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vetorInteiro1[] = new int[10];
        int vetorInteiro2[] = new int[10];

        int vetorSoma[] = new int[20];

        for (int i = 0; i < 10; i++){
            System.out.println("Digite o valor do [" + i + "] vetor 1: ");
            vetorInteiro1[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++){
            System.out.println("Digite o valor do [" + i + "] vetor 2: ");
            vetorInteiro2[i] = input.nextInt();
        }

        for (int i = 0; i < 20; i++){
            vetorSoma[i] = vetorInteiro1[i] + vetorInteiro2[i];
            System.out.println("vetorInteiro1[" + i + "] + vetorInteiro2["+ i +"] = " + vetorSoma[i]);
        }

        input.close();
    }
}
