public class ejercicio11 {
    public static int count (String s, char c) {
        //Recursivo
        if (s.length() == 0) { // Caso base
            return 0;
        } else {
            if (s.charAt(0) == c) {
                return 1 + count(s.substring(1), c);
            } else {
                return count(s.substring(1), c);
            }
        }
    }
    public static void main(String[] args) {
        String s = "hola mundo";
        char c = 'o';
        System.out.println("La cantidad de veces que se repite la letra " + c + " en la cadena " + s + " es: " + count(s, c));
    }
}
