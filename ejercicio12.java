public class ejercicio12 {

    public static boolean esBinario(String numero) {
        if (numero.length() == 0) {
            return true;
        } else {
            char ultimoCaracter = numero.charAt(numero.length() - 1);
            if (ultimoCaracter == '0' || ultimoCaracter == '1') {
                return esBinario(numero.substring(0, numero.length() - 1));
            } else {
                return false;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(esBinario("1010"));  
        System.out.println(esBinario("1234"));  
    }
}
