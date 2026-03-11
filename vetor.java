import java.util.Scanner;

public class vetor {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int vetor [] = new int[10];



        System.out.println("Digite 10 números para preencher o vetor sem repetir números anteriores:");
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = input.nextInt();

            for(int j = 0; j < i; j++){

                if (vetor[i] == vetor[j]) {
                    System.out.println("Digite um número diferente dos anteiores: ");
                    i--;
                    break;
                }
            }
        }


        System.out.println("Os números digitados foram: ");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        
    }
    
}
