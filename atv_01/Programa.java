package atv_01;

import java.util.Scanner;

public class Programa {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("[ SISTEMA DE CÁLCULO DE IMC ]");
        System.out.print("Informe o peso: ");
        double peso = sc.nextDouble();
        System.out.print("Informe a altura: ");
        double altura = sc.nextDouble();

        Imc imc = new Imc();
        System.out.println("Seu IMC é: " + imc.calculoImc(peso, altura));

    }
}