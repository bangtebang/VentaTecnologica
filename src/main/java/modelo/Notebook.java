package modelo;

public class Notebook extends DispositivoTecnologico {
	private String resolucionPantalla;
	private String tipoTeclado;
	private String bateria;

	public String getResolucionPantalla() {
		return this.resolucionPantalla;
	}

	public void setResolucionPantalla(String resolucionPantalla) {
		this.resolucionPantalla = resolucionPantalla;
	}

	public String getTipoTeclado() {
		return this.tipoTeclado;
	}

	public void setTipoTeclado(String tipoTeclado) {
		this.tipoTeclado = tipoTeclado;
	}

	public String getBateria() {
		return this.bateria;
	}

	public void setBateria(String bateria) {
		this.bateria = bateria;
	}

	public Notebook() {
		throw new UnsupportedOperationException();
	}

	public void getTipo() {
		throw new UnsupportedOperationException();
	}
}