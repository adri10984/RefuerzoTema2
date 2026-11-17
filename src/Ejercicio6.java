public class Ejercicio6 {
    public static void main(String[] args) {
        int numero = 2428;

        if (esHyperpar(numero)) {
            System.out.println("Es hyperpar");
        } else {
            System.out.println("No es hyperpar");
        }
    }

    public static boolean esHyperpar(int numero) {
        String n = Integer.toString(numero);
        for (int i = n.length() - 1; i >= 0; i--) {
            if ((n.charAt(i) % 2 != 0)) {
                return false;
            }
        }
        return true;
    }
}


