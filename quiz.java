package quiz;

import java.util.Scanner;

public class quiz {
	//Tema ESPORTE
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Dados do usuario(Breno)
		System.out.println("Digite seu nome:");
		String nome = sc.next();
		System.out.println("Insira sua idade:");
		int idade = sc.nextInt();
		
		//Primeira questão(Breno)
		System.out.println("\nA duração normal de uma partida para todas as equipes com\njogadores de idade igual ou acima de_______ anos é de_______ tempos de_______ minutos.\nO intervalo de jogo é normalmente de_______ minutos.\nA sequência que preenche corretamente as lacunas do texto é\n");
		System.out.println("1 - 14|04|20|10\n2 - 12|02|25|20\n3 - 08|03|15|15\n4 - 16|02|30|10");
		int q1 = sc.nextInt();
		
		//Verifica se a alternativa esta 1 e 4(Eduarda)
		while(q1 <1 || q1 >4) {
			System.out.println("Alternativa invalida!");
			System.out.println("Tente novamente:");
			q1 = sc.nextInt();
		}
		
		//Analisa se a questão esta correta ou errada(Breno)
		if(q1 == 4) {
			System.out.println("Correto!");
		}else {
			System.out.println("Errado!");
		}
		
		
		
		//Segunda questão(Breno)
		System.out.println("\nI. O voleibol é uma modalidade esportiva rica em regras. Nesse esporte, não é permitido, por exemplo, fazer a bola passar sobre a rede, utilizar luvas durante o jogo e nem mesmo formar duplas para uma competição.");
		System.out.println("II. A prática do vôlei não exige a realização de movimentos dos membros superiores, pois os movimentos repetitivos praticados pelos atletas desse esporte compreendem apenas os movimentos dos membros inferiores.");
		System.out.println("\nMarque a alternativa CORRETA:");
		System.out.println("1 - As duas afirmativas são verdadeiras\n2 - A afirmativa I é verdadeira, e a II é falsa.\n3 - A afirmativa II é verdadeira, e a I é falsa.\n4 -As duas afirmativas são falsas.\n");
		int q2 = sc.nextInt();
		
		//Verifica se a alternativa esta 1 e 4(Eduarda)
		while(q2 <1 || q2 >4) {
			System.out.println("Alternativa invalida!");
			System.out.println("Tente novamente:");
			q2 = sc.nextInt();
		}
		
		//Analisa se a questão esta correta ou errada(Breno)
		if(q2 == 4) {
			System.out.println("Correto!");
		}else {
			System.out.println("Errado!");
		}
		
		//Terceira questão(Breno)
		System.out.println("\nI. O atletismo contribui para o desenvolvimento das habilidades motoras básicas dos alunos, que são utilizadas na maioria das atividades desportivas. Essas habilidades, quando trabalhadas de forma pontual, desencadeiam uma série de fatores intrínsecos ao desenvolvimento e aprimoramento dos fundamentos básicos e a própria cultura desportiva do educando.\r\n"
				+ "\r\n"
				+ "II. A ludicidade própria do atletismo molda o comportamento infantil, pois brincando de correr, pular e arremessar, as crianças aprendem e são motivadas a cooperar com os companheiros, a desobedecer as regras do jogo, a desrespeitar os direitos dos outros, a acatar a autoridade, a assumir responsabilidade e a aceitar penalidades que lhe são impostas.\r\n"
				+ "\r\n"
				+ "Marque a alternativa CORRETA:");
		System.out.println("1 - As duas afirmativas são verdadeiras.\n2 - A alternativa l é verdadeira, e a ll é falsa.\n3 - A afirmativa ll é verdadeira, e a l é falsa.\n4 - As duas afirmativas são falsas.\n");
		int q3 = sc.nextInt();
		
		//Verifica se a alternativa esta 1 e 4(Eduarda)
		while(q3 <1 || q3 >4) {
			System.out.println("Alternativa invalida!");
			System.out.println("Tente novamente:");
			q3 = sc.nextInt();
		}
		
		//Analisa se a questão esta correta ou errada(Breno)
		if(q3 == 2) {
			System.out.println("Correto!");
		}else {
			System.out.println("Errado!");
		}
		
		//Quarta questão(Breno)
		System.out.println("\nI. O atletismo é um esporte muito simples e barato, uma vez que não demanda de materiais caros para exercer sua prática, sendo, portanto, fácil de ser praticado pelos alunos em forma de oficinas. Essa prática proporciona infinitos benefícios aos educandos, entre eles a aquisição e manutenção de uma boa saúde, o desenvolvimento motor e afetivo, independência e a autonomia.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "II. O atletismo representa um conjunto de esportes constituído por várias modalidades, como a corrida, a marcha, os lançamentos e os saltos. De modo geral, no ambiente escolar, o Professor de Educação Física deve compelir o educando a realizar as atividades com insatisfação, evitando seguir quaisquer princípios de higiene ou de preservação da saúde dos alunos.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Marque a alternativa CORRETA:");
		System.out.println("1 - As duas afirmativas são verdadeiras.\n2 - A afirmativa I é verdadeira, e a II é falsa.\n3 - A afirmativa II é verdadeira, e a I é falsa.\n4 - As duas afirmativas são falsas.\n");
		int q4 = sc.nextInt();
		
		//Verifica se a alternativa esta 1 e 4(Eduarda)
		while(q4 <1 || q4 >4) {
			System.out.println("Alternativa invalida!");
			System.out.println("Tente novamente:");
			q4 = sc.nextInt();
		}
		
		//Analisa se a questão esta correta ou errada(Breno)
		if(q4 == 2) {
			System.out.println("Correto!");
		}else {
			System.out.println("Errado!");
		}
		
		//Quinta questão(Breno)
		System.out.println("I. O voleibol busca promover a desagregação do grupo de atletas, pois trata-se de um esporte competitivo e que deve ser praticado exclusivamente em torneios.\r\n"
				+ "\r\n"
				+ "II. No voleibol, não é permitido fazer a bola passar sobre a rede, o que caracteriza uma falta. Assim, para marcar um ponto, o jogador deve acertar a bola na rede do time adversário após um saque único.\r\n"
				+ "\r\n"
				+ "Marque a alternativa CORRETA:");
		System.out.println("1 - As duas afirmativas são verdadeiras.\n2 - A afirmativa I é verdadeira, e a II é falsa.\n3 - A afirmativa II é verdadeira, e a I é falsa.\n4 - As duas afirmativas são falsas.\n");
		int q5 = sc.nextInt();
		
		//Verifica se a alternativa esta 1 e 4(Eduarda)
		while(q5 <1 || q5 >4) {
			System.out.println("Alternativa invalida!");
			System.out.println("Tente novamente:");
			q5 = sc.nextInt();
		}
		
		//Analisa se a questão esta correta ou errada(Breno)
		if(q5 == 4) {
			System.out.println("Correto!");
		}else {
			System.out.println("Errado!");
		}
		
		//Sexta questão(Breno)
		System.out.println("I. O voleibol é um esporte jogado com uma bola e inclui diversos passes com as mãos. O objetivo principal desse jogo é lançar a bola por cima da rede e fazê-la tocar no chão do lado do adversário.\r\n"
				+ "\r\n"
				+ "II. O treinamento de defesa para o voleibol escolar pode ser um dos fundamentos mais difíceis de se praticar e treinar quando se dispõe apenas de quadras de cimento.\r\n"
				+ "\r\n"
				+ "Marque a alternativa CORRETA:");
		System.out.println("1 -  As duas afirmativas são verdadeiras\n2 - A afirmativa I é verdadeira, e a II é falsa.\n3 - A afirmativa II é verdadeira, e a I é falsa.\n4 - As duas afirmativas são falsas.\n");
		int q6 = sc.nextInt();
		
		//Verifica se a alternativa esta 1 e 4(Eduarda)
		while(q6 <1 || q6 >4) {
			System.out.println("Alternativa invalida!");
			System.out.println("Tente novamente:");
			q6 = sc.nextInt();
		}
		
		//Analisa se a questão esta correta ou errada(Breno)
		if(q6 == 1) {
			System.out.println("Correto!");
		}else {
			System.out.println("Errado!");
		}
		
		//Setima questão(Breno)
		System.out.println("I. O voleibol busca promover a desagregação do grupo de atletas, pois trata-se de um esporte competitivo e que deve ser praticado exclusivamente em torneios.\r\n"
				+ "\r\n"
				+ "II. No voleibol, não é permitido fazer a bola passar sobre a rede, o que caracteriza uma falta. Assim, para marcar um ponto, o jogador deve acertar a bola na rede do time adversário após um saque único.\r\n"
				+ "\r\n"
				+ "Marque a alternativa CORRETA:");
		System.out.println("1 - As duas afirmativas são verdadeiras.\n2 -  A afirmativa I é verdadeira, e a II é falsa.\n3 - A afirmativa II é verdadeira, e a I é falsa.\n4 - As duas afirmativas são falsas.\n");
		int q7 = sc.nextInt();
		
		//Verifica se a alternativa esta 1 e 4(Eduarda)
		while(q7 <1 || q7 >4) {
			System.out.println("Alternativa invalida!");
			System.out.println("Tente novamente:");
			q7 = sc.nextInt();
		}
		
		//Analisa se a questão esta correta ou errada(Breno)
		if(q7 == 4) {
			System.out.println("Correto!");
		}else {
			System.out.println("Errado!");
		}
		
		//Oitava questão(Breno)
		System.out.println("I. A dança, na Educação Física escolar, oferece oportunidade aos alunos de experimentar atividades diversificadas que contemplam a pluralidade cultural, pois por meio da dança é possível aos alunos desenvolver diferentes movimentos corporais e reconhecer seu próprio corpo.\r\n"
				+ "\r\n"
				+ "II. As danças e as brincadeiras cantadas que têm como características comuns a intenção de expressão e comunicação mediante gestos e a presença de estímulos sonoros, no contexto da Educação Física escolar e à luz dos Parâmetros Curriculares Nacionais, são consideradas atividades rítmicas e expressivas.\r\n"
				+ "\r\n"
				+ "Marque a alternativa CORRETA: ");
		System.out.println("1 - As duas afirmativas são verdadeiras.\n2 - A afirmativa I é verdadeira, e a II é falsa.\n3 - A afirmativa II é verdadeira, e a I é falsa.\n4 - As duas afirmativas são falsas.\n");
		int q8 = sc.nextInt();
		
		//Verifica se a alternativa esta 1 e 4(Eduarda)
		while(q8 <1 || q8 >4) {
			System.out.println("Alternativa invalida!");
			System.out.println("Tente novamente:");
			q8 = sc.nextInt();
		}
		
		//Analisa se a questão esta correta ou errada(Breno)
		if(q8 == 1) {
			System.out.println("Correto!");
		}else {
			System.out.println("Errado!");
		}
		
		//Nona questão(Breno)
		System.out.println("Analise as afirmativas a seguir:\r\n"
				+ "\r\n"
				+ "I. No contexto da Educação Física escolar, a dança permite criar condições para que os educandos possam desenvolver seu sentimento de coletividade, suas capacidades criativas, superar desafios, valorizar a ética e organizar os próprios conflitos internos e externos.\r\n"
				+ "\r\n"
				+ "II. A dança, na Educação Física escolar, permite criar condições para os educandos descobrirem novos espaços e formas, superando as suas limitações e condições para enfrentar novos desafios em relação aos aspectos motores, sociais, afetivos e cognitivos.\r\n"
				+ "\r\n"
				+ "Marque a alternativa CORRETA:");
		System.out.println("1 - As duas afirmativas são verdadeiras.\n2 - A afirmativa I é verdadeira, e a II é falsa\n3 - A afirmativa II é verdadeira, e a I é falsa.\n4 - As duas afirmativas são falsas.\n");
		int q9 = sc.nextInt();
		
		//Verifica se a alternativa esta 1 e 4(Eduarda)
		while(q9 <1 || q9 >4) {
			System.out.println("Alternativa invalida!");
			System.out.println("Tente novamente:");
			q9 = sc.nextInt();
		}
		
		//Analisa se a questão esta correta ou errada(Breno)
		if(q9 == 1) {
			System.out.println("Correto!");
		}else {
			System.out.println("Errado!");
		}
		
		//Decima questão(Breno)
		System.out.println("Informe se é verdadeiro (V) ou falso (F) o que se afirma sobre o voleibol.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "( ) A bola será esférica, dotada de uma capa flexível de couro ou couro sintético, além de uma câmara interior feita de borracha ou material similar.\r\n"
				+ "\r\n"
				+ "( ) A quadra de jogo é um retângulo medindo 18 metros x 9 metros, circundada por uma zona livre de, no mínimo, 3 metros de largura em todos os lados.\r\n"
				+ "\r\n"
				+ "( ) A rede é colocada verticalmente sobre a linha central; sua parte superior é ajustada a 2,43 metros do solo para as mulheres e a 2,24 metros para os homens.\r\n"
				+ "\r\n"
				+ "( ) A superfície para a sua prática deve ser plana, horizontal e uniforme; não deve apresentar nenhum perigo de lesão aos jogadores. É proibido jogar sobre uma superfície rugosa ou escorregadia.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "De acordo com as afirmações, a sequência correta é");
		System.out.println("1 - V, V, F, V.\n2 - F, V, V, F.\n3 - V, F, F, V.\n4 - F, F, V, F.\n");
		int q10 = sc.nextInt();

		//Verifica se a alternativa esta 1 e 4(Eduarda)
		while(q10 <1 || q10 >4) {
			System.out.println("Alternativa invalida!");
			System.out.println("Tente novamente:");
			q10 = sc.nextInt();
		}
		
		//Analisa se a questão esta correta ou errada(Breno)
		if(q10 == 1) {
			System.out.println("Correto!");
		}else {
			System.out.println("Errado!");
		}
		
		System.out.println("Obrigado por responder nosso quiz "+nome+"!");
		System.out.println("Criado por Breno e Eduarda!");
		
		sc.close();
	}

}
