package bankAcc;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bem vindo ao REAL BANK!");
        menu();
    }

    public static void menu() {
        System.out.println("MENU" +
                "\n01 - Configuracoes da conta" +
                "\n02 - Movimentar conta" +
                "\n03 - Sair ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1 -> {
                menuConfiguracoes();
                break;
            }
            case 2 -> {
                menuMovimentar();
                break;
            }
            case 3-> {
                System.exit(0);
                break;
            }
            default -> {
                System.out.println("Opção inválida. Digite novamente: ");
                menu();
                break;
            }
        }
    }

    public static void menuConfiguracoes() {
        System.out.println("MENU CONFIGURACOES DA CONTA" +
                "\n1- Cadastrar" + "\n2- Listar contas" + "\n3- Excluir conta");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1 -> {
                Conta.cadastrar();
                menu();
            }
            case 2 -> {
                Conta.listar();
                menu();
            }
            case 3 -> {
                Conta.excluir();
                menu();
            }
        }
    }

    public static void menuMovimentar() {
        System.out.println("MENU MOVIMENTACAO DE CONTA" +
                "\n1 - Conta Corrente " +
                "\n2 - Voltar ");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1 -> Conta.menuCorrente();
            case 2 -> menu();
        }
    }


}



