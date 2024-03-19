package poo2.uniderp.dominio;

import java.util.Scanner;

public class ContaPoupanca extends DadosComum {

    private double saldoNovo;

    public ContaPoupanca(double n1, double n2, double n3, double saldoNovo) {
        super(n1, n2, n3);
        this.saldoNovo = saldoNovo;
    }

    public double getSaldoNovo() {
        return saldoNovo;
    }

    public void setSaldoNovo(double saldoNovo) {
        this.saldoNovo = saldoNovo;
    }

    public void executarPoupanca() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------");
        System.out.print("REAJUSTAR O SALDO DA POUPANCA COM 2%!");
        System.out.print("\nDigite o valor DO SALDO: ");
        double numero = scanner.nextDouble();

        setN1(numero);

        funcao();
        System.out.println("Saldo reajustado: =  " + getSaldoNovo());
        System.out.println("----------------------------------------------------------------");

    }

    public void funcao() {
        this.setSaldoNovo(getN1() * 2 / 100 + getN1());
    }

}
