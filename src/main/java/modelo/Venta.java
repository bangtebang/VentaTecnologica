package modelo;

import java.util.ArrayList;

public class Venta {
	private int compra;
	private String fechaCompra;
	private ArrayList<DispositivoTecnologico> dispositivosTecnologicos = new ArrayList<DispositivoTecnologico>();
	private Cliente cliente;

	public String getFechaCompra() {
		return this.fechaCompra;
	}

	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public Venta(String fechaCompra, Cliente cliente, ArrayList<DispositivoTecnologico> dispositivosTecnologicos,int compra) {
		this.fechaCompra = fechaCompra;
		this.cliente = cliente;
		this.dispositivosTecnologicos = dispositivosTecnologicos;
		this.compra = compra;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public ArrayList<DispositivoTecnologico> getDispositivoTecnologico(){
		return this.dispositivosTecnologicos;
	}
	public int getCompra(){
		return this.compra;
	}
}