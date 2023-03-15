import java.util.Scanner;

public class metodAnvandare18ellerNej {
    public static void main(String[] args) {

        FragaNamnPaAnvandare();
    }

    private static void FragaNamnPaAnvandare() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hur gammal är du?");
        int fragaNamn = scanner.nextInt();

        if (fragaNamn > 18) {
            System.out.println("Du är över 18 år.");
        }
        else {
            System.out.println("Du är inte över 18 år.");
            System.out.println("\nVafan då!!");
        }
    }
}

