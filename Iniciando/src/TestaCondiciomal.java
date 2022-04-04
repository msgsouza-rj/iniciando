
public class TestaCondiciomal {
	public static void main(String[] args) {
		System.out.println("Testa Condição");
		
		int idade = 18;
		// int idade = 16; //testa opcao menor idade
		
		boolean titulo = true;
		// boolean titulo = false; // testa ausencia de titulo
		
		if (idade < 18) {
			System.out.println("Você é menor e não pode voltar");
		}else	
			if (titulo) {
				System.out.println("Você é maior e tem título e pode voltar");
			
			}else {
				System.out.println("Você é maior mas não tem título então não pode voltar");
			
			}
							
	}
}
