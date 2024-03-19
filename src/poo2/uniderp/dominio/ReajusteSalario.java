package poo2.uniderp.dominio;

import java.util.Scanner;

public class ReajusteSalario extends DadosComum {

    private double salarioNovo;

    public ReajusteSalario(double n1, double n2, double n3, double salarioNovo) {
        super(n1, n2, n3);
        this.salarioNovo = salarioNovo;
    }

    public double getSalarioNovo() {
        return salarioNovo;
    }

    public void setSalarioNovo(double salarioNovo) {
        this.salarioNovo = salarioNovo;
    }

    public void executarSalario() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------");
        System.out.print("REAJUSTAR O SALARIO DO FUNCIONARIO!");
        System.out.print("\nDigite o valor DO SALARIO: ");
        double numero = scanner.nextDouble();
        System.out.print("\nDigite o valor DO PERCENTUAL DE REAJUSTE: ");
        double numero2 = scanner.nextDouble();

        setN1(numero);
        setN2(numero2);

        funcao();
        System.out.println("Salario reajustado: =  " + getSalarioNovo());
        System.out.println("----------------------------------------------------------------");

    }

    public void funcao() {
        this.setSalarioNovo(getN1() * getN2() / 100 + getN1());
    }

}
