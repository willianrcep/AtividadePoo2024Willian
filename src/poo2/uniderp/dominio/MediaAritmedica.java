package poo2.uniderp.dominio;

import java.util.Scanner;

public class MediaAritmedica extends DadosComum {

    private double respostaMedia;

    public MediaAritmedica(double n1, double n2, double n3, double repostaProduto) {
        super(n1, n2, n3);
        this.respostaMedia = repostaProduto;
    }

    public double getRespostaMedia() {
        return respostaMedia;
    }

    public void setRespostaMedia(double repostaProduto) {
        this.respostaMedia = repostaProduto;
    }

    public void executarMedia() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------");
        System.out.print("MEDIA ARITMEDICA DOS VALORES!");
        System.out.print("\nDigite o valor 1: ");
        double numero = scanner.nextDouble();
        System.out.print("Digite o valor 2: ");
        double numero2 = scanner.nextDouble();
        System.out.print("Digite o valor 3: ");
        double numero3 = scanner.nextDouble();

        setN1(numero);
        setN2(numero2);
        setN3(numero3);
        funcao();
        System.out.println("A MEDIA DOS VALORES É: =  " + getRespostaMedia());
        System.out.println("----------------------------------------------------------------");

    }

    public void funcao() {
        this.setRespostaMedia((getN1() + getN2() + getN2()) / 3);
    }

}
