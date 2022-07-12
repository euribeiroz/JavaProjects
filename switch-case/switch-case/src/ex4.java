import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int formatoPagamento;
        double valorCompra;
        
        System.out.println("Informe o formato de parcelamento: "
                + "\n1 - Pagamento à vista com 15% de desconto."
                + "\n2 - Pagamento com cheque pré-datado para 30 dias - 10% de desconto."
                + "\n3 - Pagamento parcelado em 6 vezes - não tem desconto."
                + "\n4 - Pagamento parcelado em 12 vezes - 8% de acréscimo. ");
        formatoPagamento = sc.nextInt();
        
        switch (formatoPagamento) {
        case 1: 
            System.out.println("Pagamento à vista com 15% de desconto.");
            System.out.println("Informe o valor da compra: ");
            valorCompra = sc.nextDouble();
            System.out.println("Valor com desconto: " + (valorCompra*0.15 - valorCompra));
            break;
        case 2:
            System.out.println("Pagamento com cheque pré-datado para 30 dias - 10% de desconto.");
            System.out.println("Informe o valor da compra: ");
            valorCompra = sc.nextDouble();
            System.out.println("Valor com desconto: " + (valorCompra*0.1 - valorCompra));
            break;
        case 3:
            System.out.println("Pagamento parcelado em 6 vezes - não tem desconto.");
            System.out.println("Informe o valor da compra: ");
            valorCompra = sc.nextDouble();
            System.out.println("Sem desconto");
            System.out.println("Valor da parcela: " + (valorCompra/6));
            break;
        case 4:
            System.out.println("Pagamento parcelado em 12 vezes - 8% de acréscimo.");
            System.out.println("Informe o valor da compra: ");
            valorCompra = sc.nextDouble();
            System.out.println("Valor com acréscimo: " + (valorCompra*0.08 + valorCompra));
            System.out.println("Valor da parcela: " + (valorCompra*0.08 + valorCompra)/12 );
            break;
        }
        
    }

}