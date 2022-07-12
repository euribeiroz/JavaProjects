import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod;
		
		System.out.println("Informe o código do seu cargo:");
		cod = sc.nextInt();
		
		switch(cod) {
		case 1:
			System.out.println("Escriturário:");
			System.out.println("Informe o salario atual:");
			double salarioAtual = sc.nextDouble();
			System.out.println("Novo salario é:"+salarioAtual*0.50);
			break;
			
		case 2:
			System.out.println("Secretario:");
			System.out.println("Informe o salario atual:");
			 salarioAtual = sc.nextDouble();
			System.out.println("Novo salario é:"+salarioAtual*0.35);
			break;
			
		case 3:
			System.out.println("Caixa:");
			System.out.println("Informe o salario atual:");
			 salarioAtual = sc.nextDouble();
			System.out.println("Novo salario é:"+salarioAtual*0.20);
			break;
			
		case 4:
			System.out.println("Gerente:");
			System.out.println("Informe o salario atual:");
		 salarioAtual = sc.nextDouble();
			System.out.println("Novo salario é:"+salarioAtual*0.10);
			break;
			
		case 5:
			System.out.println("Não tem aumento!");
			break;
			
		default:
			System.out.println("código errado");
			break;
		}	
		sc.close();
		
	}

}
