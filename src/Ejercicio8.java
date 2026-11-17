import java.util.Arrays;

public class Ejercicio8 {
    public static void main(String[] args) {
        int [] numeros = {9,11,13,12};
        System.out.println(cualFalta(numeros));
    }
    public static int cualFalta(int [] numeros){
        int falta = 0;
        Arrays.sort(numeros); // Ordena el array
        for(int i=0; i<numeros.length - 1; i++){
            if (numeros[i+1] - numeros[i] == 2 ){
                falta = numeros[i] + 1;
                break;
            }
        }
        return falta;
    }
}
