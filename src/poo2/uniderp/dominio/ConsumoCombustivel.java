package poo2.uniderp.dominio;

import java.util.Scanner;

public class ConsumoCombustivel extends DadosComum {

    private double consumo;

    public ConsumoCombustivel(double n1, double n2, double n3, double consumo) {
        super(n1, n2, n3);
        this.consumo = consumo;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public void executarLitros() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------");
        System.out.print("CONSUMO DE LITROS FAZENDO 12 K/H!");
        System.out.print("\nDigite o tempo gasto: ");
        double t = scanner.nextDouble();
        System.out.print("\nDigite a velocidade media gasta: ");
        double vm = scanner.nextDouble();

        setN1(t);
        setN2(vm);

        funcao();
        System.out.println("Distancia: =  " + getN3() + ", litros Consumidos: =  " + getConsumo());
        System.out.println("----------------------------------------------------------------");

    }

    public void funcao() {
        this.setN3(getN1() * getN2());
        this.setConsumo(getN3() / 12);
    }

}
