package pruebatecnica.generation;

import java.util.Date;

public class Propietario extends Direccion {

	private String nombre;
	private String cpf;
	private String rg;
	private Date fechaNacimiento;

	public Propietario(String nombre, String cpf, String rg) {
		this.nombre = nombre;
		this.cpf = cpf;
		this.rg = rg;
	}

	public Propietario(String nombre, String cpf, String rg, String calle, String colonia, String ciudad, String estado,
			int codigoPostal, String complemento) {
		super(calle, colonia, ciudad, estado, codigoPostal, complemento);

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}