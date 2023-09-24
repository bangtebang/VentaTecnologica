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

	public Tablet(String marca, String modelo,String memoriaRam, String memoriaAlmacenamiento,String procesador, int precio, int cantidadStock, int anoFabricacion, String resolucionPantalla, String accesoriosIncorporados) {
		super(marca, modelo, memoriaRam, memoriaAlmacenamiento, procesador, precio, cantidadStock, anoFabricacion);
		this.resolucionPantalla = resolucionPantalla;
		this.accesoriosIncorporados = accesoriosIncorporados;
	}

	public String getTipo() {
		return "Tablet";
	}
}