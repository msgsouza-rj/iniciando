
public class Carro {
	private int ano;
	private String modelo;
	private double preco;

	public Carro(int ano, String modelo, double preco) {
		if ( ano>=1891 ) {
			this.ano = ano;
		} else {
			System.out.println("O ano informado � inv�lido. O ano 2017 foi adotado.");
			this.ano = 2017;
		}
		
		if ( modelo != null) {
			this.modelo = modelo;
		} else {
			System.out.println("O modelo n�o foi informado. O modelo GOL foi adotado.");
			this.modelo = "Gol";
		}
		
		if ( preco > 0) {
			this.preco = preco;
		} else {
			System.out.println("O pre�o n�o � v�lido. O pre�o atribuido � 40000");
		}
		
	}

	public Carro(String modelo, double preco) {
		this(2017, modelo, preco);
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCarro() {

		return this.modelo + " " + this.ano + " " + this.preco;
	}
}
