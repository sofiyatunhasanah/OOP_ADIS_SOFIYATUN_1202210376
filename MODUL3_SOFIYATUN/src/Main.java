import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  public static void main(String[] args) {
    boolean repeat = true;
    Scanner scanner = new Scanner(System.in);
    Calculation calculation = new Calculation();

    do {
      try {
        System.out.print("\n=== Menu Program ===");
        System.out.print("\n1. Square \n2. Circle \n3. Trapezoid \n0. Exit");
        System.out.print("\nPilih menu: ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
          case 1:
            System.out.print("\nMasukkan sisi panjang persegi : ");
            double sisi = scanner.nextDouble();
            calculation.setSquare(sisi);
            calculation.run();
            System.out.println("\nHasil perhitungan: " + calculation.getSquare());
            break;
          case 2:
            System.out.print("\nMasukkan jari-jari lingkaran : ");
            double radius = scanner.nextDouble();
            calculation.setCircle(radius);
            calculation.run();
            System.out.println("\nHasil perhitungan: " + calculation.getCircle());
            break;
          case 3:
            System.out.print("\nMasukkan sisi atas trapesium : ");
            double a = scanner.nextDouble();
            System.out.print("Masukkan sisi bawah trapesium : ");
            double b = scanner.nextDouble();
            System.out.print("Masukkan tinggi trapesium : ");
            double t = scanner.nextDouble();
            calculation.setTrapezoid(a, b, t);
            calculation.run();
            System.out.println("\nHasil perhitungan: " + calculation.getTrapezoid());
            break;
          case 0:
            System.out.println("\nProgram berakhir");
            break;
          default:
            System.out.println("\nPilihan tidak tersedia");
            continue;
        }
        repeat = false;
      } catch (InputMismatchException e) {
        System.out.println("\n====Error: Input harus berupa angka====");
        scanner.next();
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    } while (repeat);

    scanner.close();
  }
}