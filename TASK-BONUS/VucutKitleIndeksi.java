public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double kilo = 55.0;
        double boy = 1.65;
        double bmi = kilo / (boy * boy);
        System.out.printf("Kilo: %.1f kg, Boy: %.2f m%n", kilo, boy);
        System.out.printf("Vücut Kitle İndeksi (BMI): %.2f%n", bmi);
    }
}
