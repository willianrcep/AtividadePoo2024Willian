package poo2.uniderp.dominio;

import java.util.Scanner;

public class Produto extends DadosComum {

    private double respostaProduto;

    public Produto(double n1, double n2, double n3, double repostaProduto) {
        super(n1, n2, n3);
        this.respostaProduto = repostaProduto;
    }

    public double getRespostaProduto() {
        return respostaProduto;
    }

    public void setRespostaProduto(double repostaProduto) {
        this.respostaProduto = repostaProduto;
    }

    public void executarProduto() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------");
        System.out.print("PRODUTO DOS VALORES!");
        System.out.print("\nDigite o valor 1: ");
        double numero = scanner.nextDouble();
        System.out.print("Digite o valor 2: ");
        double numero2 = scanner.nextDouble();

        setN1(numero);
        setN2(numero2);
        funcao();
        System.out.println("O PRODUTO DOS VALORES É: =  " + getRespostaProduto());
        System.out.println("----------------------------------------------------------------");

    }

    public void funcao() {
        this.setRespostaProduto(getN1() * getN2());
    }

}
