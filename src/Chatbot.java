import java.util.Scanner;

public class Chatbot {
	public static void main(String[] args) {
		bot();
	}

	public static void bot() {
		String palavra;

		System.out.println("Ol�, seja bem vindo(a), em que posso ajudar?");
		System.out.println("1 - Tirar d�vidas.");
		System.out.println("2 - Solicitar cart�o.");

		Scanner scanner = new Scanner(System.in);
		Scanner text = new Scanner(System.in);
		int opcao = scanner.nextInt();

		if (opcao == 1) {
			System.out.println(
					"Informe sua d�vida utilizando palavras-chave. \nExemplo: Se a d�vida tem rela��o com senhas, digite 'resetar senha', ou 'rastrear pedido, ou 'alterar dados' \n");

			palavra = text.nextLine();
			if (palavra.equals("resetar senha")) {
				System.out.println("Enviamos para fulano@gmail.com um link para redefini��o de senha.\n");
			} else if (palavra.equals("rastrear pedido")) {
				System.out.println("Seu pedido de numero 666 acabou de sair para a entrega.\n");
			} else if (palavra.equals("alterar dados")) {
				System.out.println("Um dos nossos atendentes entrar� em contato para a atualiza��o de dados.\n");
			} else {
				System.out.println(
						"Infelizmente n�o consigo te ajudar com essa d�vida, entre em contato com o SAC atrav�s do 0800 666-666.\n");
			}
			bot();

		}
		if (opcao == 2) {
			System.out.println(
					"Confirmamos os seus dados cadastrais e informamos que seu cart�o ser� entregue em at� 15 dias �teis.\n");
			bot();
		} else {
			System.out.println("Op��o inv�lida.\n");
			bot();
		}
	}
}
