import java.util.Scanner;
public class Excondicionais_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float nota1, nota2, nota3, media = 6;
		
		System.out.println("Digite a primeira nota:");
		nota1 = sc.nextFloat();
		
		System.out.println("Digite a segunda nota:");
		nota2 = sc.nextFloat();
		
		System.out.println("Digite a terceira nota:");
		nota3 = sc.nextFloat();
		
		float mediaFinal = (nota1+nota2+nota3)/3;
		float exame = mediaFinal - media;
		
		if(media < 3) {
			System.out.println("Reprovado!");
			sc.close();
		}else if(media >= 7 && media <= 10) {
			System.out.println("Aprovado!");
			sc.close();
		}else if(media >= 3 && media < 7) {
			System.out.println("Exame");
			System.out.println("A sua nota faltante é:"+exame);
			sc.close();
		}
	}
}