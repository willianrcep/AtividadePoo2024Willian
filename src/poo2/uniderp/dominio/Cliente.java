package poo2.uniderp.dominio;

import java.util.Scanner;

public class Cliente extends DadosComum {

    private String nome;
    private String endereco;

    public Cliente(double n1, double n2, double n3, String nome, String endereco) {
        super(n1, n2, n3);
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void executarCliente() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------");
        System.out.print("DADOS DO CLIENTE");
        System.out.print("\nDigite o nome: ");
        String name = scanner.nextLine();
        System.out.print("\nDigite o endereco: ");
        String endereco = scanner.nextLine();
        System.out.print("\nDigite o telefone: ");
        double telefone = scanner.nextDouble();

        setNome(name);
        setEndereco(endereco);
        setN1(telefone);

        System.out.println(" NOME:  " + getNome() + "\n ENDERECO: " + getEndereco() + "\n TELEFONE: " + getN1());
        System.out.println("----------------------------------------------------------------");

    }

}