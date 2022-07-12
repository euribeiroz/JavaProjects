import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int i = 1;
		
		while(num < 30000) {
			System.out.println("Informe os numeros:");
			num = sc.nextInt();
			i++;
		}
		System.out.println("Soma:"+(num+i));
		System.out.println("Quantidade de numero digitados:");
		System.out.println("Maior numero:");
		System.out.println("Menor numero:");
		System.out.println("Media dos numeros pares:");
		System.out.println("Porcentagem dos numero impares:");
	}

}
