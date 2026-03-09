import java.util.Scanner;

public class Main {
    int randomNumber;
    int conteggio = 0;

    public Main() {
        randomNumber = (int) (Math.random() * 100000) + 1;

        for (int i = 0; i < 100000; i++) {
            if (randomNumber % 7 == 0) {
                conteggio++;
            }
            // removed break to allow full loop
        }
        System.out.println("Il numero di numeri divisibili per 7 è: " + conteggio);
    }

    public static void main(String[] args) {
        new Main();
    }
}