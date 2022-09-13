package bankAcc;
import java.util.ArrayList;
import java.util.Scanner;

public class Conta {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Conta> listaDeContas = new ArrayList<>();

    private String nome, profissao, endereco;
    private long cpf;
    private static double saldo;
    private double renda;
    public static double valor;
    private static int numConta;
    private int numAgencia = 1243;
    private static int qtdContas;

    public Conta(String nome, String endereco, long cpf, String profissao, double renda, double saldo, double valor) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.profissao = profissao;
        this.renda = renda;
        this.saldo = saldo;
        this.valor = valor;

        qtdContas++;
        numConta = qtdContas;
    }

    public String getInformacoes() {
        return "Conta Corrente" +
                "\nNome: " + nome +
                "\nProfissão: " + profissao +
                "\nEndereço: " + endereco +
                "\nCPF: " + cpf +
                "\nSaldo: " + saldo +
                "\nRenda: " + renda +
                "\nNúmero da conta: " + numConta +
                "\nNúmero da agência: " + numAgencia;
    }

    public static void cadastrar(){
        System.out.print("Informe o nome do correntista: ");
        String nome = sc.next();
        System.out.print("Informe o endereço do correntista: ");
        String endereco = sc.next();
        System.out.print("Informe o CPF do correntista: ");
        long cpf = sc.nextLong();
        System.out.print("Informe a profissão do correntista: ");
        String profissao = sc.next();
        System.out.print("Informe a renda do correntista: ");
        double renda = sc.nextDouble();
        double saldo = 0;
        double valor = 0;
        listaDeContas.add(new Conta(nome, endereco, cpf, profissao, renda, saldo, valor));
        System.out.println("Adicionado com sucesso.");
    }

    public static void listar(){
        for (int i = 0; i < listaDeContas.size(); i++) {
            System.out.println(listaDeContas.get(i).getInformacoes());
        }
    }

    public static void excluir(){
        System.out.print("CPF que deseja remover: ");
        int cpfEscolhido = sc.nextInt();
        for (int i = 0; i < listaDeContas.size(); i++) {
            if (cpfEscolhido == listaDeContas.get(i).getCpf()) {
                listaDeContas.remove(i);
                System.out.println("Usuário excluído com sucesso.");
                break;
            }
        }
    }

    public static void transferir(double valor) {
        if (saldo < Conta.valor) {
            System.out.println("Você não pode transferir!");
        } else {
            saldo -= Conta.valor;
            System.out.print("Número da conta: ");
            Conta.valor = sc.nextInt();
            if (Conta.valor != numConta) {
                saldo -= valor;
                System.out.println("Transferência realizada!\n");
            } else {
                System.out.println("Você não pode transferir!\n");
            }
        }
    }

    public static void menuCorrente() {
        System.out.println("Qual o número da conta que deseja realizar uma operação?");
        int contaEscolhida = sc.nextInt();
        for (int i = 0; i < listaDeContas.size(); i++) {
            if (contaEscolhida == listaDeContas.get(i).getNumConta()) {
                int escolhaOperacao;
                System.out.println("MENU"
                        + "\n1 - Depositar"
                        + "\n2 - Sacar"
                        + "\n3 - Verificar Saldo"
                        + "\n4 - Transferir"
                        + "\n5 - Sair");
                escolhaOperacao = sc.nextInt();
                switch (escolhaOperacao) {
                    case 1: {
                        System.out.print("Qual valor você irá depositar?"
                                + "\nR$ ");
                        double valor = sc.nextDouble();
                        depositar(valor);
                        menuCorrente();
                        break;
                    }
                    case 2: {
                        System.out.print("Qual valor irá sacar?"
                                + "\nR$ ");
                        double valor = sc.nextDouble();
                        listaDeContas.get(i).sacar(valor);
                        menuCorrente();
                        break;
                    }
                    case 3:
                        System.out.println(listaDeContas.get(i).getInformacoesSaldo());
                        menuCorrente();
                    case 4:
                        System.out.print("Qual valor irá transferir?"
                                + "\nR$ ");
                        double valor = sc.nextDouble();
                        listaDeContas.get(i).transferir(valor);
                        menuCorrente();
                        break;
                    case 5:
                        Main.menuMovimentar();
                }
            }
        }
    }

    public static String depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Saldo: R$ " + saldo);
            return"";
        } else {
            System.out.println("Valor de depósito inválido.");
            return"";
        }

    }

    public boolean sacar(double valor) {
        if (saldo < valor) {
            System.out.println("Operação não realizada com sucesso. Saldo insuficiente.");
            return false;
        } else {
            saldo -= valor;
            System.out.println("Operação realizada com sucesso. Você sacou " + valor + " reais.");
            return true;
        }
    }

    public String getInformacoesSaldo() {
        return "Conta Corrente" +
                "\nNome: " + nome +
                "\nSaldo: " + saldo;
    }

    public void render(){
        saldo = saldo * 0.5;
    }

    public long getCpf() { return cpf; }

    public double getSaldo() { return saldo; }

    public int getNumConta() {return numConta; }

}