import java.util.Scanner;
public class Excondicionais_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int notaLab, notaAva, notaExame;
		
		System.out.println("Qual a nota do Trabalho de laboratório:");
		notaLab = sc.nextInt();
		notaLab = notaLab * 2;
		
		System.out.println("Qual a nota do Avaliação semestral:");
		notaAva = sc.nextInt(); 
		notaAva = notaAva * 3;
		
		System.out.println("Qual a nota do Exame final:");
		notaExame = sc.nextInt();
		notaExame = notaExame * 5;
		
		float media = (notaLab+notaAva+notaExame)/3;
		
		if(media >= 8 && media <= 10) {
			System.out.println("Conceito A");
		}
		if(media >= 7 && media <= 8) {
			System.out.println("Conceito B");
		} 
		if(media >= 6 && media <=7) {
			System.out.println("Conceito C");
		}
		if(media >=5 && media <=6) {
			System.out.println("Conceito D");
		}
		if(media < 5) {
			System.out.println("Conceito E");
		}
		
	}

}