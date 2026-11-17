public class Ejercicio10 {
    public static void main(String[] args) {
        int compartimentos = 4;
        int maxLitros = 400;
        int diferencia = 20;

        System.out.println(litros(compartimentos, maxLitros, diferencia));

    }
    public static int litros(int compartimentos, int maxLitros, int diferencia) {
        int litros = 0;
        for (int i = 1; i <= compartimentos; i++) {
            litros += maxLitros;
            maxLitros -= diferencia;
        }

        return litros;
    }
}
