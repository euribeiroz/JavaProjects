import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double criterioA;
        double criterioB;
        
        System.out.println("Informe a quantidade de livros:");
        int qtdLivros = sc.nextInt();
        
        criterioA = (0.25*qtdLivros+7.50);
        criterioB = (0.50*qtdLivros+2.50);
        
        if (criterioA<criterioB) {
            System.out.println("Melhor opção é o critério A. Valor = " + criterioA);
        } else if (criterioB<criterioA)  {
            System.out.println("Melhor opção é o critério B. Valor = " + criterioB);

        }
    }

}