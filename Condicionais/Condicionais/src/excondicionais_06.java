import java.util.Scanner;

public class excondicionais_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = sc.nextInt();
	
	
	if(numero %2 == 0) {
		System.out.println("Esse numero é par!");
	}if(numero %2 ==1) {
		System.out.println("Esse numero é impar!");
	}
	sc.close();
	}
}