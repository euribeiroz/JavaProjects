import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade = 0,peso =0, time1, time2, qntMenor = 0, mediaIdade =0, qntPeso = 0;
		double altura = 0, mediaAltura = 0;
		
		for(time1 = 0;time1 <=3;time1++) {
			System.out.println("Time 1");
			System.out.println("Informe sua idade:");
			idade  = sc.nextInt();
			
			System.out.println("Informe seu peso:");
			peso = sc.nextInt();
			
			System.out.println("Informe sua altura:");
			altura = sc.nextDouble();
			
		}
		
		mediaIdade = idade/11;
		mediaAltura = altura/11;
		
		
		
		if(idade <18) {
			qntMenor++;
		}
		
		if(peso > 80) {
			qntPeso++;
		}
		
		
		
		System.out.println("Menores de idade:"+qntMenor);
		System.out.println("Media de idade:"+mediaIdade);
		System.out.println("Media de altura:"+mediaAltura);
		
		for(time2 = 0;time2 <=3;time2++) {
			System.out.println("Time 2");
			System.out.println("Informe sua idade:");
			idade  = sc.nextInt();
			
			System.out.println("Informe seu peso:");
			peso = sc.nextInt();
			
			System.out.println("Informe sua altura:");
			altura = sc.nextDouble();
			
		}
		System.out.println("Porcentagem de jogadores com de 80kg:"+(qntPeso/100)+"%");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
