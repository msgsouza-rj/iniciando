
public class TestaCondiciomal {
	public static void main(String[] args) {
		System.out.println("Testa Condi��o");
		
		int idade = 18;
		// int idade = 16; //testa opcao menor idade
		
		boolean titulo = true;
		// boolean titulo = false; // testa ausencia de titulo
		
		if (idade < 18) {
			System.out.println("Voc� � menor e n�o pode votar");
		}else	
			if (titulo) {
				System.out.println("Voc� � maior e tem t�tulo e pode votar");
			
			}else {
				System.out.println("Voc� � maior mas n�o tem t�tulo ent�o n�o pode votar");
			
			}
							
	}
}
