public class TugasB {
    public static void main(String[] args) {
        int angka = 1, total;
        System.out.println("menampilkan bilangan genap");
        System.out.println("===========================");
        System.out.println();

        do {
            total = angka * 2;
            if (total < 100) {
                System.out.print(total + " ");
            }
            angka = total;
        } while (angka < 100);
        System.out.println(" ");
    }
}

