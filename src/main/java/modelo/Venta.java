package modelo;

import java.util.ArrayList;
import modelo.DispositivoTecnologico;

public class Venta {
	private String fechaCompra;
	private ArrayList<DispositivoTecnologico> dispositivosTecnologicos = new ArrayList<DispositivoTecnologico>();
	private Cliente cliente;

	public String getFechaCompra() {
		return this.fechaCompra;
	}

	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public Venta(String fechaCompra, Cliente cliente) {
		this.fechaCompra = fechaCompra;
		this.cliente = cliente;
	}
}