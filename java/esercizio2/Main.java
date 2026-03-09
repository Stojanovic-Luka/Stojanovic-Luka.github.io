

public class Main {

    public static void downloadFile(int id) {
        System.out.println("Inizio del download del file " + id + "...");
        try {
            Thread.sleep(3000); // simula il tempo di download
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Download interrotto per il file " + id);
            return;
        }

        System.out.println("Download del file " + id + " completato!");
    }

    public static void main(String[] args) {
        for (int id = 1; id <= 5; id++) {
            downloadFile(id);
        }
    }
}
