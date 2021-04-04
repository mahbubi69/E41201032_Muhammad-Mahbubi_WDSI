import java.util.Scanner;

public class TugasC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int banyakData;
        int nilaiTotal = 0;
        int i;

        System.out.print("Masukkan banyaknya data nilai = ");
        banyakData = in.nextInt();

        int nilai[] = new int[banyakData];

        for (i = 0; i < banyakData; i++) {
            System.out.print("Masukkan data nilai ke-" + (i + 1) + " = ");
            nilai[i] = in.nextInt();
            nilaiTotal += nilai[i];
        }

        int ratarata;
        int nilaimin = nilai[0];
        int nilaimax = nilai[0];

        for (i = 0; i < nilai.length; i++) {
            if (nilaimax < nilai[i]) {
                nilaimax = nilai[i];

            } else if (nilaimin > nilai[i]) {
                nilaimin = nilai[i];
            }
        }

        int banyak = banyakData;
        ratarata = nilaiTotal / banyak;

        System.out.println(" ");
        System.out.println("Nilai Min = " + nilaimin);
        System.out.println("Nilai Max = " + nilaimax);
        System.out.println("Nilai rata-ratanya adalah = " + ratarata);

    }
}