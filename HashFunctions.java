public class HashFunctions {

    private static final String INVALID_A_MESSAGE_ERROR  = "A constante 'A' deve estar entre 0 e 1";
    private static final String INVALID_M_MESSAGE_ERROR  = "'m' deve ser diferente de 0 para evitar divisão por 0";
    private static final String NEGATIVE_M_MESSAGE_ERROR  = "'m' não pode ser negativo, pois gera índices negativos no cálculo";

    public static int division(int k, int m) {
        if (isMEqualToZero(m)) {
            throw new IllegalArgumentException(INVALID_M_MESSAGE_ERROR);
        }
        
        return k % m;
    }

    public static int multiplication(int k, int m, double A) {
        if (!isAValid(A)) {
            throw new IllegalArgumentException(INVALID_A_MESSAGE_ERROR);
        }

        if (isMEqualToZero(m)) {
            throw new IllegalArgumentException(INVALID_M_MESSAGE_ERROR);
        }
        
        if (!isMPositive(m)) {
            throw new IllegalArgumentException(NEGATIVE_M_MESSAGE_ERROR);
        }

        return (int) (m * ((k * A) % 1));
    }
    
    private static boolean isMEqualToZero(int m) {
        return m == 0;
    }

    private static boolean isMPositive(int m) {
        return m > 0;
    }
    
    private static boolean isAValid(double A) {
        return  A > 0 && A < 1;
    }
}