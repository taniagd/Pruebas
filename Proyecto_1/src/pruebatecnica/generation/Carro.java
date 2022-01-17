package pruebatecnica.generation;

public class Carro extends Propietario {

	private String modelo;
	private String color;
	private int anio;
	private String marca;
	private String chasis;
	private String propietario;
	private int velocidadMax;
	private int velocidadActual;
	private int numeroPuertas;
	private boolean quemacocos;
	private int numeroMarchas;
	private boolean transmisionAtm;
	private float volumenCombustible;
	private double consumoPromedio; 
		
	public Carro(String nombre, String cpf, String rg, String calle, String colonia, String ciudad, String estado,
			int codigoPostal, String complemento) {
		super(nombre, cpf, rg, calle, colonia, ciudad, estado, codigoPostal, complemento);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getChasis() {
		return chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public int getVelocidadMax() {
		return velocidadMax;
	}

	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public boolean isQuemacocos() {
		return quemacocos;
	}

	public void setQuemacocos(boolean quemacocos) {
		this.quemacocos = quemacocos;
	}

	public int getNumeroMarchas() {
		return numeroMarchas;
	}

	public void setNumeroMarchas(int numeroMarchas) {
		this.numeroMarchas = numeroMarchas;
	}

	public boolean isTransmisionAtm() {
		return transmisionAtm;
	}

	public void setTransmisionAtm(boolean transmisionAtm) {
		this.transmisionAtm = transmisionAtm;
	}

	public float getVolumenCombustible() {
		return volumenCombustible;
	}

	public void setVolumenCombustible(float volumenCombustible) {
		this.volumenCombustible = volumenCombustible;
	}
	
	public double getConsumoPromedio() {
		return consumoPromedio;
	}
	
	public void setConsumoPromedio(double consumoPromedio) {
		this.consumoPromedio = consumoPromedio;
		}

	public void acelerar() {
		this.velocidadActual = velocidadActual + 1;
	}

	public void frenar() {
		this.velocidadActual = 0;
	}

	public void cambioMarcha() {
		this.numeroMarchas = numeroMarchas + 1;
	}

	public void reducirMarcha() {
		this.numeroMarchas = numeroMarchas - 1;
	}
	
	public void autonomiaViaje() {
		this.consumoPromedio = consumoPromedio * volumenCombustible;
	}

	public void mostrarDatosCarro() {

		System.out.println("-----------------------Datos del vehículo----------------------------\n");
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Color: " + this.color);
		System.out.println("Año: " + this.anio);
		System.out.println("Marca: " + this.marca);
		System.out.println("Tipo de chasis: " + this.chasis);
		System.out.println("El número de puertas es de: " + this.numeroPuertas);
		System.out.println("El número de marchas es de: " + this.numeroMarchas);
		System.out.println("El volumen de combustible es de: " + this.volumenCombustible + "litros");
		System.out.println("¿El auto cuenta con quemacocos? " + "Sí");
		System.out.println("¿El auto cuenta con transmisión automática? " + "No" + "\n");

	}
}
