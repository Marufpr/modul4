import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Pilih operasi kalkulator:");
            System.out.println("1. Akar Kuadrat");
            System.out.println("2. Pangkat");
            System.out.println("3. Logaritma Natural (basis e)");
            System.out.println("4. Faktorial");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan (1/2/3/4/5): ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculateSquareRoot();
                    break;
                case 2:
                    calculatePower();
                    break;
                case 3:
                    calculateNaturalLog();
                    break;
                case 4:
                    calculateFactorial();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan kalkulator. Sampai jumpa!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih operasi yang sesuai.");
            }
        } while (choice != 5);
    }

    public static void calculateSquareRoot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka yang akan diakarkan: ");
        double num = scanner.nextDouble();
        double result = Math.sqrt(num);
        System.out.println("Akar kuadrat dari " + num + " adalah: " + result);
    }

    public static void calculatePower() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka yang akan dipangkatkan: ");
        double base = scanner.nextDouble();
        System.out.print("Masukkan pangkat: ");
        double exponent = scanner.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println(base + " pangkat " + exponent + " adalah: " + result);
    }

    public static void calculateNaturalLog() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka yang akan dihitung logaritma naturalnya: ");
        double num = scanner.nextDouble();
        double result = Math.log(num);
        System.out.println("Logaritma natural dari " + num + " adalah: " + result);
    }

    public static void calculateFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka untuk menghitung faktorial: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Faktorial hanya dapat dihitung untuk angka non-negatif.");
        } else {
            long result = 1;
            for (int i = 2; i <= num; i++) {
                result *= i;
            }
            System.out.println("Faktorial dari " + num + " adalah: " + result);
        }
    }
}
