import java.util.Scanner;

public class Chatbot {
	public static void main(String[] args) {
		bot();
	}

	public static void bot() {
		String palavra;

		System.out.println("Olá, seja bem vindo(a), em que posso ajudar?");
		System.out.println("1 - Tirar dúvidas.");
		System.out.println("2 - Solicitar cartão.");

		Scanner scanner = new Scanner(System.in);
		Scanner text = new Scanner(System.in);
		int opcao = scanner.nextInt();

		if (opcao == 1) {
			System.out.println(
					"Informe sua dúvida utilizando palavras-chave. \nExemplo: Se a dúvida tem relação com senhas, digite 'resetar senha', ou 'rastrear pedido, ou 'alterar dados' \n");

			palavra = text.nextLine();
			if (palavra.equals("resetar senha")) {
				System.out.println("Enviamos para fulano@gmail.com um link para redefinição de senha.\n");
			} else if (palavra.equals("rastrear pedido")) {
				System.out.println("Seu pedido de numero 666 acabou de sair para a entrega.\n");
			} else if (palavra.equals("alterar dados")) {
				System.out.println("Um dos nossos atendentes entrará em contato para a atualização de dados.\n");
			} else {
				System.out.println(
						"Infelizmente não consigo te ajudar com essa dúvida, entre em contato com o SAC através do 0800 666-666.\n");
			}
			bot();

		}
		if (opcao == 2) {
			System.out.println(
					"Confirmamos os seus dados cadastrais e informamos que seu cartão será entregue em até 15 dias úteis.\n");
			bot();
		} else {
			System.out.println("Opção inválida.\n");
			bot();
		}
	}
}
