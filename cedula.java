public class Main {
    public static void main(String[] args) {
        int FN = 1996;
        int FA = 2023;

        int EDAD = FN - FA;

        if (EDAD > 17) {
            System.out.println("Necesitas sacar tu cédula de identidad");
        } else {
            System.out.println("Aún no necesitas sacar tu cédula");
        }
    }
}