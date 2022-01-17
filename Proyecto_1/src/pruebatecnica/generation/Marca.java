package pruebatecnica.generation;

public class Marca {

	private String nombreMarca;
	private int numeroModelos;
	private int anioLanzamiento;
	private String identificador;

	public Marca() {

	}

	public String getNombreMarca() {
		return nombreMarca;
	}

	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}

	public int getNumeroModelos() {
		return numeroModelos;
	}

	public void setNumeroModelos(int numeroModelo) {
		this.numeroModelos = numeroModelo;
	}

	public int getAnioLanzamiento() {
		return anioLanzamiento;
	}

	public void setAnioLanzamiento(int anioLanzamiento) {
		this.anioLanzamiento = anioLanzamiento;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public void mostrarDatosMarca() {

		System.out.println("------------------------Detalles de marca----------------------------\n");
		System.out.println("La marca es: " + this.nombreMarca);
		System.out.println("El número de modelos de este coche son: " + this.numeroModelos);
		System.out.println("Cuyo año de lanzamiento al mercado es: " + this.anioLanzamiento);
		System.out.println("Su número de identificador es el siguiente: " + this.identificador + "\n");
	}

}
