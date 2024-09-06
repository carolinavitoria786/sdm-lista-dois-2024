package atv_01;

public class Imc {

    public double calculoImc(double peso, double altura) {

        double imc = peso / (Math.pow(altura, 2));
        return imc;
    }
}