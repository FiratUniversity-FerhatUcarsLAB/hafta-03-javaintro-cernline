public class ParaBozma {
    public static void main(String[] args) {
        int toplamTutar = 278;
        int yuzluk = toplamTutar / 100;
        toplamTutar %= 100;
        int ellilik = toplamTutar / 50;
        toplamTutar %= 50;
        int yirmilik = toplamTutar / 20;
        toplamTutar %= 20;
        int beslik = toplamTutar / 5;
        toplamTutar %= 5;
        int ikilik = toplamTutar / 2;
        toplamTutar %= 2;
        int birlik = toplamTutar;
        System.out.println("278 TL = " +
                yuzluk + "x100, " +
                ellilik + "x50, " +
                yirmilik + "x20, " +
                beslik + "x5, " +
                ikilik + "x2, " +
                birlik + "x1");
    }
}
