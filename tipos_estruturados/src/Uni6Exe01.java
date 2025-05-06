import java.util.Scanner;

public class Uni6Exe01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vetorInteiro[] = new int[10];
        
        for (int i = 0; i < 10; i++){
            System.out.print("Digite o vetorInteiro[" + i + "]: ");
            int num = input.nextInt();

            vetorInteiro[i] = num;
        }

        for (int i = 9; i >= 0; i--){
            System.out.println("Posição " + i + " do vetor " + vetorInteiro[i]);
        }
        input.close();
    }
}
