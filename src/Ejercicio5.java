import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] numeros = {1, 3, 6, 5, 7, 8, 9, 11, 12};

        double resultado = mediana(numeros);
        System.out.println(resultado);
    }
    public static double mediana (int numeros[]){
        double mediana = 0;
        Arrays.sort(numeros); // 1 3 5 6 7 8 9 12
        if (numeros.length % 2 == 0) {
            mediana = numeros[numeros.length / 2] + numeros[numeros.length / 2 - 1];
            mediana = mediana / 2;
        } else {
            mediana = numeros[numeros.length / 2];
        }
        return mediana;
    }
}
