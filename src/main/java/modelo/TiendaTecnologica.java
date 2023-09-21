package modelo;

import java.util.ArrayList;
import modelo.DispositivoTecnologico;
import modelo.Cliente;

public class TiendaTecnologica {
	private String direccion;
	private ArrayList<DispositivoTecnologico> dispositivosTecnologicos = new ArrayList<DispositivoTecnologico>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public TiendaTecnologica() {
		throw new UnsupportedOperationException();
	}
}