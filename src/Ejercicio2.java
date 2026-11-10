public class Ejercicio2 {
    public static void main(String[] args) {
        int dia = 10;
        int mes = 11;

        System.out.println(diasNochevieja(dia, mes));

    }
    public static int diasNochevieja (int dia, int mes){
        int[] diaMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int res = diaMes[mes-1] - dia;
        for (int i = mes; i < 12; i++){
            res += diaMes[i];
        }
        return res;
    }
}
