package factorial;

public class Factorial {

    public static void main(String[] args) {
        //Hago un formateo de código con 'Source -> Format'
        int num1; //cambio de nombre de variable marcando la variable y botón derecho 'Refactor -> Rename'
        int num2; //cambio de nombre de variable marcando la variable y botón derecho 'Refactor -> Rename'

        num1 = 8;

        int num3; //cambio de nombre de variable marcando la variable y botón derecho 'Refactor -> Rename'
        if (num1 == 0) {
            num2 = 1;
        } else {
            num2 = 1;
            for (num3 = num1; num3 >= 1; num3--) {
                num2 = num2 * num3;
            }
        }

        System.out.println(num2);

    }

}
