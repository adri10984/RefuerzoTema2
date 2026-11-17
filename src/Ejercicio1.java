public class Ejercicio1 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,3,4,5,6,2,2,3,1,3};
        System.out.println(orden(numeros));

    }

    public static String orden(int[] numeros){
        boolean ascendente = false;
        boolean descendente = false;

        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                descendente = true;
            } else if (numeros[i] < numeros[i+1]) {
                ascendente = true;
            }
        }

        if (ascendente && descendente){
            return ("Desordenado");
        } else if (descendente){
            return ("Descendente");
        } else if (ascendente){
            return ("Ascendente");
        } else   {
            return ("Iguales");
        }
    }
}
