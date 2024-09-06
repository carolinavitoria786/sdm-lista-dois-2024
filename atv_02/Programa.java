package atv_02;

import javax.swing.JOptionPane;

public class Programa {

    public static void main(String[] args) {

        Double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um número: "));
        String operacao = JOptionPane.showInputDialog(null, "Informe o sinal da operacao: ");
        Double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um número: "));

        Calculadora calc = new Calculadora(num1, operacao, num2);
        calc.calculo();
    }
}