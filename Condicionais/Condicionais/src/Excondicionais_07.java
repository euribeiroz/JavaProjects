import java.util.Scanner;

public class Excondicionais_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("valor de I:");
		int i = sc.nextInt();
		
		System.out.println("valor de a, b e c:");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		
		if (i == 1){
			if (a > b && a > c && b > c){
				System.out.println(c+""+b+""+a);
			}
	 		else if (a > b && a > c && c > b){
	 			System.out.println(b+""+c+""+a);
			}
			else if ( b > a && b > c && a > c){
				System.out.println(c+""+a+""+b);
			}
			else if ( b > a && b > c && c > a){
				System.out.println(a+""+c+""+b);
			}
			else if ( c > a && c > b && b > a){
				System.out.println(a+""+b+""+c);
			}
			else if ( c > a && c > b && a > b){
				System.out.println(b+""+a+""+c);
			}
		}
		if (i == 2){
			if (a < b && a < c && b < c){
				System.out.println(c+""+b+""+a);
			}
			else if (a < b && a < c && c < b){
				System.out.println(b+""+c+""+a);
			}
			else if ( b < a && b < c && a < c){
				System.out.println(c+""+a+""+b);
			}
			else if ( b < a && b < c && c < a){
				System.out.println(a+""+c+""+b);
			}
			else if ( c < a && c < b && b < a){
				System.out.println(a+""+b+""+c);
			}
			else if ( c < a && c < b && a < b){
				System.out.println(b+""+a+""+c);
			}
		}
		if (i == 3){
			if (a < b && a < c && b < c){
				System.out.println(b+""+c+""+a);
			}
			else if (a < b && a < c && c < b){
				System.out.println(c+""+b+""+a);
			}
			else if ( b < a && b < c && a < c){
				System.out.println(a+""+c+""+b);
			}
			else if ( b < a && b < c && c < a){
				System.out.println(c+""+a+""+b);
			}
			else if ( c < a && c < b && b < a){
				System.out.println(b+""+a+""+c);
			}
			else if ( c < a && c < b && a < b){
				System.out.println(a+""+b+""+c);
			}
		}

	}
}