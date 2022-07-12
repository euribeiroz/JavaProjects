import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tabuada,x;
		
		System.out.println("Digite o numero da tabuada desejada:");
		tabuada = sc.nextInt();

		if(tabuada<0) {
			System.out.println("Numero invalido! Por favor reinicie o programa e use um numero valido!");
			System.exit(tabuada);
		}
		
		for(x=0;x<=10;x++) {
			System.out.println(tabuada+"x"+x+"="+tabuada*x);
		}
		sc.close();
	}

}