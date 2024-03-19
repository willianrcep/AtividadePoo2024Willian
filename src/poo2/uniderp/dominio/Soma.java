package poo2.uniderp.dominio;

import java.util.Scanner;

public class Soma extends DadosComum {

    private double respostaSoma;

    public Soma(double n1, double n2, double n3, double respostaSoma) {
        super(n1, n2, n3);
        this.respostaSoma = respostaSoma;
    }

    public double getRespostaSoma() {
        return respostaSoma;
    }

    public void setRespostaSoma(double respostaSoma) {
        this.respostaSoma = respostaSoma;
    }

    public void executarSoma() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------");
        System.out.print("SOMAR DOIS VALORES!");
        System.out.print("\nDigite o valor 1: ");
        double numero = scanner.nextDouble();
        System.out.print("Digite o valor 2: ");
        double numero2 = scanner.nextDouble();

        setN1(numero);
        setN2(numero2);
        funcao();
        System.out.println("A soma dos valores é: " + getRespostaSoma());
        System.out.println("----------------------------------------------------------------");

    }

    public void funcao() {
        this.setRespostaSoma(getN1() + getN2());
    }

}