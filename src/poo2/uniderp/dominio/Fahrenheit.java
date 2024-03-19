package poo2.uniderp.dominio;

import java.util.Scanner;

public class Fahrenheit extends DadosComum {

    private double fahrenheit;

    public Fahrenheit(double n1, double n2, double n3, double fahrenheit) {
        super(n1, n2, n3);
        this.fahrenheit = fahrenheit;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public void executarFahrenheit() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------");
        System.out.print("CONVERSAO DE CENTIGRADOS EM FAHRENHEIT!");
        System.out.print("\nDigite o grau centígrado para conversão: ");
        double C = scanner.nextDouble();

        setN1(C);

        funcao();
        System.out.println("Graus em Fahrenheit: =  " + getFahrenheit());
        System.out.println("----------------------------------------------------------------");

    }

    public void funcao() {
        this.setFahrenheit(((9 * getN1()) + 160) / 5);
    }

}
