
public class ExercitaWhile {

	public static void main(String[] args) {

		int incremento = 0;
		
		while (incremento <= 10) {
			
			System.out.println(incremento);
			
			// incremento = incremento + 1;
			// incremento += 1;
			
			incremento++;
		}
		
		System.out.println("fora do loop While: " + incremento);

	}

}
