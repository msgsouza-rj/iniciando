
public class TestaCondicionalMelhor {

	public static void main(String[] args) {

		System.out.println("Testa Condição");

		int idade = 18;
		// int idade = 16; //testa opcao menor idade

		boolean titulo = true;
		// boolean titulo = false; // testa ausencia de titulo

		if (idade >= 18 && titulo) {
			System.out.println("Você pode votar");
		} else {

			System.out.println("Você não pode votar");
		}

	}
}
