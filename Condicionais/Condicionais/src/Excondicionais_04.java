import java.util.Scanner;

public class Excondicionais_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite tres numeros:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a <= b && a <= c && b <= c) {
			System.out.println(a+" "+b+" "+c);
		}
		if (a <= b && a <=c && c <= b) {
			System.out.println(a+" "+c+" "+b);
		}
		if (b <= a && b <= c && a <= c) {
			 System.out.println(b+" "+a+" "+c);
		}
		if (b <= a && b <= c && c <= a) {
			System.out.println(b+" "+c+" "+a);
		}
		if (c <= a && c <= b && a <=b) {
			System.out.println(c+" "+a+" "+b);
		}
		if (c >= a && c >= b && b >= a) {
			System.out.println(c+" "+b+" "+a);
		}
		sc.close();
	}

}