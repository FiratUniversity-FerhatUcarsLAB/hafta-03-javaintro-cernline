public class Faktoriyel {
    public static void main (String[] args) {
        int sayi = 5;
        int faktoriyel = 1;
        System.out.print("5! Hesaplama Adımları: ");
        for (int i = sayi; i >= 1; i--) {
            faktoriyel *= i;
            System.out.print(i);
            if (i > 1) {
                System.out.print (" x ");
            }
        }
        System.out.println(" = " + faktoriyel);
    }
}
