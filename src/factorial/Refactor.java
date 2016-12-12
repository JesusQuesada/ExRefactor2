package factorial;

import javax.swing.JOptionPane;

public class Refactor {

    //Hago un formateo de código con 'Source -> Format'
    private int num1; //cambio de nombre de variable marcando la variable y botón derecho 'Refactor -> Rename'
    private int num2; //cambio de nombre de variable marcando la variable y botón derecho 'Refactor -> Rename'
    private int num3; //cambio de nombre de variable marcando la variable y botón derecho 'Refactor -> Rename'

    public void calcularFactorial() {
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Introducir número a calcular "));
        if (num1 == 0) {
            num2 = 1;
        } else {
            num2 = 1;
            for (num3 = num1; num3 >= 1; num3--) {
                num2 = num2 * num3;
            }
        }

    }

    public void mostrar() {
        System.out.println(num2);
    }
}
