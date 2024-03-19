package poo2.uniderp.dominio;

import java.util.Scanner;

public class AnteSucessor extends DadosComum {

    private double antecessor;
    private double sucessor;

    public AnteSucessor(double n1, double n2, double n3, double antecessor, double sucessor) {
        super(n1, n2, n3);
        this.antecessor = antecessor;
        this.sucessor = sucessor;
    }

    public double getAntecessor() {
        return antecessor;
    }

    public void setAntecessor(double antecessor) {
        this.antecessor = antecessor;
    }

    public double getSucessor() {
        return sucessor;
    }

    public void setSucessor(double sucessor) {
        this.sucessor = sucessor;
    }

    public void executarAntSuce() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------");
        System.out.print("ANTECESSOR E SUCESSOR");
        System.out.print("\nDigite o valor: ");
        double numero = scanner.nextDouble();

        setN1(numero);

        funcao();
        System.out.println("ANTECESSOR:  " + getAntecessor() + "\n SUCESSOR: " + getSucessor());
        System.out.println("----------------------------------------------------------------");

    }

    public void funcao() {
        this.setAntecessor(getN1() - 1);
        this.setSucessor(getN1() + 1);
    }

}
