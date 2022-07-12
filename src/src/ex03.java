import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numOperario, numPecas, sexoOperario;
		double salarioMinimo;
		
		System.out.println("Numero do operario:");
		numOperario = sc.nextInt();
		
		System.out.println("Numero de peças fabrica por mes:");
		numPecas = sc.nextInt();
		
		System.out.println("Sexo do operario:");
		sexoOperario = sc.nextInt();
		
		switch(numOperario) {
		case 1:
			System.out.println("Salario minimo:");
			salarioMinimo = sc.nextDouble();
			System.out.println("");
			
		case 2:
			System.out.println("Salario minimo:");
			salarioMinimo = sc.nextDouble();
			double salarioMinimo2 = salarioMinimo*0.03;
			System.out.println("Salario total:"+(salarioMinimo2 + salarioMinimo));
			
		case 3:
			System.out.println("Salario minimo:");
			salarioMinimo = sc.nextDouble();
			double salarioMinimo3 = salarioMinimo*0.05;
			System.out.println("Salario total:"+(salarioMinimo3 + salarioMinimo));
			
		default:
			System.out.println("Codigo invalido!");
		}
	
	}

}
