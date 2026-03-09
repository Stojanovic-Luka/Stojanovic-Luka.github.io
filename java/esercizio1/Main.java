import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        do {
            for (int sec = 0; sec < 120; sec++) {
                System.out.println("il programma è in esecuzione da " + sec + " secondi");
            }
            System.out.println("Inserisci il tuo nome:");
            nome = scanner.nextLine();
        } while (nome.isEmpty());

        System.out.println("Ciao, " + nome + "!");
        input.close();
    }
}
