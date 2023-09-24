package modelo;

public class Computador extends DispositivoTecnologico {
	private String tarjetaVideo;
	private String fuentePoder;
	private String chasis;
	private Pantalla pantalla;

	public String getTarjetaVideo() {
		return this.tarjetaVideo;
	}

	public void setTarjetaVideo(String tarjetaVideo) {
		this.tarjetaVideo = tarjetaVideo;
	}

	public String getFuentePoder() {
		return this.fuentePoder;
	}

	public void setFuentePoder(String fuentePoder) {
		this.fuentePoder = fuentePoder;
	}

	public String getChasis() {
		return this.chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public Computador(String marca, String modelo,String memoriaRam, String memoriaAlmacenamiento,String procesador, int precio, int cantidadStock, int anoFabricacion, String tarjetaVideo, String fuentePoder, String chasis, Pantalla pantalla) {
		super(marca, modelo, memoriaRam, memoriaAlmacenamiento, procesador, precio, cantidadStock, anoFabricacion);
		this.tarjetaVideo = tarjetaVideo;
		this.fuentePoder = fuentePoder;
		this.chasis = chasis;
		this.pantalla = pantalla;
	}

	public String getTipo() {
		return "Computador";
	}
}