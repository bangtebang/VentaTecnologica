package modelo;

import java.util.ArrayList;

public class TiendaTecnologica {
	private ArrayList<Venta> ventas = new ArrayList<Venta>();
	private String direccion;
	private ArrayList<DispositivoTecnologico> dispositivosTecnologicos = new ArrayList<DispositivoTecnologico>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public TiendaTecnologica(String direccion) {
		this.direccion = direccion;
	}
	public void agregarDispositivoTecnologico(DispositivoTecnologico dispositivoTecnologico) {
		for (DispositivoTecnologico d : dispositivosTecnologicos) {
			if (d.getMarca().equals(dispositivoTecnologico.getMarca()) && d.getModelo().equals(dispositivoTecnologico.getModelo())) {
				System.out.println("El dispositivo ya existe");
				return;
			}
		}
		dispositivosTecnologicos.add(dispositivoTecnologico);
	}
	public void agregarCliente(Cliente cliente) {
		for (Cliente c : clientes) {
			if (c.getNombre().equals(cliente.getNombre())) {
				System.out.println("El cliente ya existe");
				return;
			}
		}
		clientes.add(cliente);
	}
	public void realizarVenta(Venta venta,ArrayList<DispositivoTecnologico> dispositivosTecnologicos,int compra) {
		for (DispositivoTecnologico d : dispositivosTecnologicos) {
			if (d.getCantidadStock() < compra) {
				System.out.println("No hay suficiente stock");
				return;
			}
		}
		for (DispositivoTecnologico d : dispositivosTecnologicos) {
			d.setCantidadStock(d.getCantidadStock() - compra);
		}
		ventas.add(venta);
	}
	public void obtenerInformacionDispositivoTecnologico(DispositivoTecnologico dispositivoTecnologico) {
		System.out.println("Marca: " + dispositivoTecnologico.getMarca());
		System.out.println("Modelo: " + dispositivoTecnologico.getModelo());
		System.out.println("Memoria RAM: " + dispositivoTecnologico.getMemoriaRam());
		System.out.println("Memoria de almacenamiento: " + dispositivoTecnologico.getMemoriaAlmacenamiento());
		System.out.println("Procesador: " + dispositivoTecnologico.getProcesador());
		System.out.println("Precio: " + dispositivoTecnologico.getPrecio());
		System.out.println("Cantidad en stock: " + dispositivoTecnologico.getCantidadStock());
		System.out.println("Año de fabricación: " + dispositivoTecnologico.getAnoFabricacion());
		System.out.println("Tipo: " + dispositivoTecnologico.getTipo());
	}

	public ArrayList<Cliente> getClientes() {
		return this.clientes;
	}

	public ArrayList<DispositivoTecnologico> getCatalogo() {
		return this.dispositivosTecnologicos;
	}

	public ArrayList<Venta> getVentas() {
		return this.ventas;
	}
}