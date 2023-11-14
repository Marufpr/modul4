import java.util.Scanner;

public class TextAnalyzer {
    private static String text = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=== MENU TEKS ANALYZER ===");
            System.out.println("1. Masukkan Teks");
            System.out.println("2. Hitung Jumlah Karakter");
            System.out.println("3. Hitung Jumlah Kata");
            System.out.println("4. Cari Kata dalam Teks");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Membersihkan newline setelah memasukkan pilihan

            switch (choice) {
                case 1:
                    inputText();
                    break;
                case 2:
                    countCharacters();
                    break;
                case 3:
                    countWords();
                    break;
                case 4:
                    searchWord();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program Teks Analisis!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }

        } while (choice != 5);
    }

    private static void inputText() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan teks: ");
        text = scanner.nextLine();

        // Bagian yang menggunakan isEmpty() untuk memeriksa string kosong atau enggak
        if (!text.isEmpty()) {
            System.out.println("Teks telah dimasukkan!\n");
        } else {
            System.out.println("Teks kosong. Silakan masukkan teks.\n");
        }
    }

    private static void countCharacters() {
        // Bagian yang menggunakan length() untuk melihat panjang karakter
        System.out.println("Jumlah karakter dalam teks: " + text.length() + "\n");
    }

    private static void countWords() {
        // Bagian yang menggunakan split() untuk membagi suatu string   menjadi array substring disini digunakan untuk melihat jumlah angka
        String[] words = text.split("\\s+");
        System.out.println("Jumlah kata dalam teks: " + words.length + "\n");
    }

    private static void searchWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata yang ingin dicari: ");
        String searchWord = scanner.nextLine();

        int count = 0;
        String[] words = text.split("\\s+");
        for (String word : words) {
            // Bagian yang menggunakan equalsIgnoreCase() untuk mencari kata yg iingin di cari
            if (word.equalsIgnoreCase(searchWord)) {
                count++;
            }
        }

        System.out.println("Kata '" + searchWord + "' ditemukan sebanyak " + count + " kali dalam teks.\n");
    }
}