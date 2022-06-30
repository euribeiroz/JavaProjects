import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int num;
	
	System.out.println("Insira um número inteiro ímpar");
		num = sc.nextInt();
		
		if(num %2 == 1) {
			System.out.println("    *\r\n"
					+ "   ***\r\n"
					+ "  *****\r\n"
					+ " *******\r\n"
					+ "*********\r\n"
					+ " *******\r\n"
					+ "  *****\r\n"
					+ "   ***\r\n"
					+ "    *");
		}else {
			System.out.println("Número inválido.");
		}

	
	sc.close();
	
		}

	}
