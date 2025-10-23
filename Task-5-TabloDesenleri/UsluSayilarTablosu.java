public class UsluSayilarTablosu {
    public static void main(String[] args) {
        System.out.println("a   a^2   a^3");
        System.out.println("-------------------");
        for (int a = 1; a <= 5; a++) {
            int kare = a * a;
            int kup = a * a * a;
            System.out.printf("%-4d %-5d %-5d%n", a, kare, kup);
        }
    }
}
