public class MilKilometreTablosu {
    public static void main(String[] args) {
        System.out.println("Mil\t Kilometre");
        System.out.println("-------------------");
        double[] miller = {1, 5, 10, 20, 50};
        for (double mil : miller) {
            double km = mil * 1.609;
            System.out.printf("%.0f\t %.3f%n", mil, km);
        }
    }
}
