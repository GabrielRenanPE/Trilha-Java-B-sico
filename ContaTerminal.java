package ContaBanco;

import java.util.Scanner;
import java.util.Random;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		double maxConta = 999.999;
		double doubleValorRandom = rand.nextDouble(maxConta);

		System.out.println("Digite o seu nome:");
		String nome = scan.next();

		System.out.println("Digite o seu agencia:");
		String agencia = scan.next();

		System.out.println("Digite o seu numero da conta:");
		int conta = scan.nextInt();

		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua " + "agência é %s, "
				+ "conta %s e seu " + "saldo %.6s. " + "já está disponível para saque.", nome, agencia, conta,
				doubleValorRandom);
	}
}
