public class ejercicio13 {

    public static boolean areParenthesesBalanced(String str) {
        return areParenthesesBalancedHelper(str, 0, 0);
    }

    private static boolean areParenthesesBalancedHelper(String str, int index, int openCount) {
        // Caso base: si hemos llegado al final de la cadena
        if (index == str.length()) {
            return openCount == 0; // Los paréntesis están balanceados si
                                        // no hay paréntesis abiertos sin cerrar
        }

        char currentChar = str.charAt(index);

        // Si encontramos un paréntesis de apertura, incrementamos el contador de paréntesis abiertos
        if (currentChar == '(') {
            return areParenthesesBalancedHelper(str, index + 1, openCount + 1);
        }
        // Si encontramos un paréntesis de cierre, decrementamos el contador de paréntesis abiertos
        else if (currentChar == ')') {
           
            if (openCount == 0) {
                return false;
            }
            return areParenthesesBalancedHelper(str, index + 1, openCount - 1);
        }
        
        else {
            return areParenthesesBalancedHelper(str, index + 1, openCount);
        }
    }

    public static void main(String[] args) {
        String str1 = "((())())";
        String str2 = "(()))(";
        
        System.out.println("Los paréntesis en \"" + str1 + "\" están balanceados: " + areParenthesesBalanced(str1));
        System.out.println("Los paréntesis en \"" + str2 + "\" están balanceados: " + areParenthesesBalanced(str2));
    }
}
