package modelo;

public class Pantalla {
	private String marca;
	private String modelo;
	private int ano;
	private Computador computador;

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Pantalla(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
}