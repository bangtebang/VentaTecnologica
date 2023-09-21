package modelo;

public class Tablet extends DispositivoTecnologico {
	private String resolucionPantalla;
	private String accesoriosIncorporados;

	public String getResolucionPantalla() {
		return this.resolucionPantalla;
	}

	public void setResolucionPantalla(String resolucionPantalla) {
		this.resolucionPantalla = resolucionPantalla;
	}

	public String getAccesoriosIncorporados() {
		return this.accesoriosIncorporados;
	}

	public void setAccesoriosIncorporados(String accesoriosIncorporados) {
		this.accesoriosIncorporados = accesoriosIncorporados;
	}

	public Tablet() {
		throw new UnsupportedOperationException();
	}

	public void getTipo() {
		throw new UnsupportedOperationException();
	}
}