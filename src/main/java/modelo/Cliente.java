package modelo;

import java.util.ArrayList;
import modelo.Venta;

public class Cliente {
	private String nombre;
	private String apellido;
	private String correoElectronico;
	private int numeroContacto;
	private String estadoCivil;
	private String ciudad;
	private TiendaTecnologica tiendaTecnologica;
	private ArrayList<Venta> ventas = new ArrayList<Venta>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public int getNumeroContacto() {
		return this.numeroContacto;
	}

	public void setNumeroContacto(int numeroContacto) {
		this.numeroContacto = numeroContacto;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Cliente() {
		throw new UnsupportedOperationException();
	}
}