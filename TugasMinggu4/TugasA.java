import java.util.Scanner;

public class TugasA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int batasaawal, batasakhir;

        System.out.print("masukkan batas awal= ");
        batasaawal = input.nextInt();

        System.out.print("masukkan batas akhir= ");
        batasakhir = input.nextInt();

        for (int i = batasaawal; i < batasakhir; i++) {
            System.out.println( i%2 + " ");
        }

    }
}