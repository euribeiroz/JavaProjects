import java.util.Scanner;

public class Excondicionais_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois numeros:");
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		
		if(numero1 > numero2) {
			System.out.print("O maior é:"+numero1);
		}else {
			System.out.print("O maior é:"+numero2);
		}
	}

}