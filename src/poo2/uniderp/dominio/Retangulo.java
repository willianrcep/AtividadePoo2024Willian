package poo2.uniderp.dominio;

import java.util.Scanner;

public class Retangulo extends DadosComum {

    private double perimetro;
    private double area;

    public Retangulo(double n1, double n2, double n3, double perimetro, double area) {
        super(n1, n2, n3);
        this.perimetro = perimetro;
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void executarRetangulo() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------");
        System.out.print("PERIMETRO E AREA DO RETANGULO!");
        System.out.print("\nDigite o valor da base: ");
        double base = scanner.nextDouble();
        System.out.print("Digite o valor da altura: ");
        double altura = scanner.nextDouble();

        setN1(base);
        setN2(altura);

        funcao();

        System.out.println("PERIMETRO: =  " + getPerimetro() + "\nAREA: = " + getArea());
        System.out.println("----------------------------------------------------------------");

    }

    public void funcao() {
        this.setPerimetro(getN2() + getN1());
        this.setArea(getN2() * getN1());
    }

}
