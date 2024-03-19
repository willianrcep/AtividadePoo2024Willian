import java.util.Scanner;
import poo2.uniderp.dominio.AnteSucessor;
import poo2.uniderp.dominio.Cliente;
import poo2.uniderp.dominio.ConsumoCombustivel;
import poo2.uniderp.dominio.ContaPoupanca;
import poo2.uniderp.dominio.Fahrenheit;
import poo2.uniderp.dominio.MediaAritmedica;
import poo2.uniderp.dominio.Produto;
import poo2.uniderp.dominio.ReajusteSalario;
import poo2.uniderp.dominio.Retangulo;
import poo2.uniderp.dominio.Soma;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Soma som = new Soma(0, 0, 0, 0);
        Produto pro = new Produto(0, 0, 0, 0);
        MediaAritmedica med = new MediaAritmedica(0, 0, 0, 0);
        AnteSucessor ants = new AnteSucessor(0, 0, 0, 0, 0);
        Cliente clie = new Cliente(0, 0, 0, null, null);
        ContaPoupanca poup = new ContaPoupanca(0, 0, 0, 0);
        Retangulo ret = new Retangulo(0, 0, 0, 0, 0);
        ReajusteSalario sal = new ReajusteSalario(0, 0, 0, 0);
        Fahrenheit fa = new Fahrenheit(0, 0, 0, 0);
        ConsumoCombustivel cons = new ConsumoCombustivel(0, 0, 0, 0);

        String opcao = "s";

        while (opcao.equals("s") || opcao.equals("S")) {
            int opc = 0;

            System.out.println("--------DIGITE O NUMERO CORRESPONDENTE A FUNÇÃO QUE DESEJA!-----");
            System.out.println(" 1 - SOMAR DOIS VALORES!");
            System.out.println(" 2 - PRODUTO!");
            System.out.println(" 3 - MEDIA ARITMETICA!");
            System.out.println(" 4 - ANTECESSOR E SUCESSOR!");
            System.out.println(" 5 - CADASTRO DE CLIENTE!");
            System.out.println(" 6 - REAJUSTE DA CONTA POUPANÇA!");
            System.out.println(" 7 - PERIMETRO E AREA DO RETANGULO!");
            System.out.println(" 8 - REAJUSTE DE SALARIO!");
            System.out.println(" 9 - CONVERSÃO DE CENTÍGRADOS PARA FAHRENHEIT!");
            System.out.println(" 10 - CONSUMO DE LITROS POR VIAGEM!");
            System.out.println(" 11  - PARA SAIR!");
            opc = sc.nextInt();
            switch (opc) {

                case 1:
                    som.executarSoma();

                    break;

                case 2:
                    pro.executarProduto();

                    break;

                case 3:
                    med.executarMedia();

                    break;

                case 4:
                    ants.executarAntSuce();

                    break;

                case 5:
                    clie.executarCliente();

                    break;

                case 6:
                    poup.executarPoupanca();

                    break;

                case 7:
                    ret.executarRetangulo();

                    break;

                case 8:
                    sal.executarSalario();

                    break;

                case 9:
                    fa.executarFahrenheit();

                    break;

                case 10:
                    cons.executarLitros();

                    break;

                case 11:
                    opcao = "n";

                    break;

                default:
                    break;
            }

        }
        sc.close();
    }
}
