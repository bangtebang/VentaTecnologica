package modelo;

import java.util.ArrayList;
import modelo.Venta;

public abstract class DispositivoTecnologico {
	private String marca;
	private String modelo;
	private String memoriaRam;
	private String memoriaAlmacenamiento;
	private String procesador;
	private int precio;
	private int cantidadStock;
	private int anoFabricacion;
	private TiendaTecnologica tiendaTecnologica;
	private ArrayList<Venta> ventas = new ArrayList<Venta>();

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

	public String getMemoriaRam() {
		return this.memoriaRam;
	}

	public void setMemoriaRam(String memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public String getMemoriaAlmacenamiento() {
		return this.memoriaAlmacenamiento;
	}

	public void setMemoriaAlmacenamiento(String memoriaAlmacenamiento) {
		this.memoriaAlmacenamiento = memoriaAlmacenamiento;
	}

	public String getProcesador() {
		return this.procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getAnoFabricacion() {
		throw new UnsupportedOperationException();
	}

	public void setAnoFabricacion(String anoFabricacion) {
		throw new UnsupportedOperationException();
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCantidadStock() {
		return this.cantidadStock;
	}

	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

	public void setAnoFabricacion(int anoFabricacion) {
		this.anoFabricacion = anoFabricacion;
	}

	public abstract String getTipo();

	public DispositivoTecnologico(String marca, String modelo, String memoriaRam, String memoriaAlmacenamiento,
			String procesador, int precio, int cantidadStock, int anoFabricacion) {
		this.marca = marca;
		this.modelo = modelo;
		this.memoriaRam = memoriaRam;
		this.memoriaAlmacenamiento = memoriaAlmacenamiento;
		this.procesador = procesador;
		this.precio = precio;
		this.cantidadStock = cantidadStock;
		this.anoFabricacion = anoFabricacion;
	}
}