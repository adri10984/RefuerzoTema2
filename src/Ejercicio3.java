public class Ejercicio3 {
    public static void main(String[] args) {
        String num = "3433";
        String resultado = sumaDigitos(num);
        System.out.println(resultado);

    }
    public static String sumaDigitos (String num){
        int suma = 0;
        String res = "";
        for (int i = 0; i <= num.length() -1 ; i++) {
            suma += Integer.parseInt("" + num.charAt(i));
            if (i == num.length() -1){
                res += num.charAt(i) + " = " + suma;
            } else  {
                res += num.charAt(i) + " + ";
            }

        }
        return res;
    }
}
