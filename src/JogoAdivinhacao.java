import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner numeroUsuario = new Scanner(System.in);

        int numeroAleatorio = new Random().nextInt(100);

        System.out.println("numero: " + numeroAleatorio);
        System.out.println("Insira o seu chute: ");

        int chuteUsuario = numeroUsuario.nextInt();

        for (int qtdeTentativas = 0; qtdeTentativas < 6; qtdeTentativas++) {
            if(chuteUsuario == numeroAleatorio) {
                System.out.println("PARABÉNS! VOCÊ CONSEGUIU ACERTAR O VALOR! Para jogar novamente, basta reiniciar.");
                break;
            } else {
                switch (qtdeTentativas) {
                    case 1:
                        System.out.println("Você errou! Você tem mais 4 chances!");
                        System.out.println("Insira o seu chute: ");
                        chuteUsuario = numeroUsuario.nextInt();
                        break;
                    case 2:
                        System.out.println("Você errou! Você tem mais 3 chances!");
                        System.out.println("Insira o seu chute: ");
                        chuteUsuario = numeroUsuario.nextInt();
                        break;
                    case 3:
                        System.out.println("Você errou! Você tem mais 2 chances!");
                        System.out.println("Insira o seu chute: ");
                        chuteUsuario = numeroUsuario.nextInt();
                        break;
                    case 4:
                        System.out.println("Você errou! Você tem mais 1 chances!");
                        System.out.println("Insira o seu chute: ");
                        chuteUsuario = numeroUsuario.nextInt();
                        break;
                    case 5:
                        System.out.println("Não foi desta vez! Você não conseguiu acertar o valor. Por favor, reinicie para jogar novamente.");
                        break;
                }
            }
        }
    }
}
