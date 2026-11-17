public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,3,4,5,6,2,2,3,1,3};
        System.out.println(moda(numeros));
    }
    public static int moda(int[] numeros){
        int repetidos = 0;
        int maximo = 0;
        int moda = 0;
        for (int i = 0; i < numeros.length - 1; i++) {
            maximo = 0;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    repetidos++;
                    if  (repetidos > maximo) {
                        maximo = repetidos;
                        moda = numeros[i];
                    }
                }
            }
        }
        return moda;
    }
}
