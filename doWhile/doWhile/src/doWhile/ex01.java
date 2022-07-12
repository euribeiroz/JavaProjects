package doWhile;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite numero: ");
        int num = sc.nextInt();
        int i = 2;
        int divisao = 0;
        do{
            if(num % i == 0){
                divisao++;
            }
            i++;
        }while(i<num);

        if(divisao == 0 ){
            System.out.println("Numero é primo!");
        }
        else {
            System.out.println("Não é primo!");
        }

        sc.close();
	}

}
