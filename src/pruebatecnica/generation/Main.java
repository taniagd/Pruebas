package pruebatecnica.generation;

public class Main {

	public static void main(String[] args) {

		Carro carro = new Carro("Frida Guzmán", "GOFC970105KLSMSJUF", "GOFC970105UHJS5", "Ferrocarrileros", "La Huerta",
				"León", "Guanajuato", 37658, "Edificio detrás de Oxxo");
		carro.setModelo("Pointer");
		carro.setColor("Blanco");
		carro.setAnio(2007);
		carro.setMarca("Volkswagen");
		carro.setChasis("Central");
		carro.setVelocidadMax(200);
		carro.setVelocidadActual(45);
		carro.setNumeroPuertas(4);
		carro.setQuemacocos(true);
		carro.setNumeroMarchas(7);
		carro.setTransmisionAtm(false);
		carro.setVolumenCombustible(51);
		carro.setConsumoPromedio(9.7);
		carro.mostrarDatosCarro();

		System.out.println("----------------------Velocidad----------------------\n");
		System.out.println("El carro tiene una velocidad máxima de: " + carro.getVelocidadMax() + "km/h");
		System.out.println("La velocidad actual es de: " + carro.getVelocidadActual() + "km/h");
		carro.acelerar();
		System.out.println("Una vez que acelera, su velocidad cambia a: " + carro.getVelocidadActual() + "km/h");
		carro.frenar();
		System.out.println("Al frenar, la velocidad cambia a: " + carro.getVelocidadActual() + "km/h" + "\n");
		carro.autonomiaViaje();
		System.out.println("La autonomía de viaje del vehículo es de: " + carro.getConsumoPromedio() + "\n");

		System.out.println("----------------------Cambio de marcha----------------\n");
		System.out.println("El numero de marchas es de: " + carro.getNumeroMarchas());
		carro.cambioMarcha();
		System.out.println("Una vez efectuado el cambio de marcha ésta cambia a: " + carro.getNumeroMarchas());
		carro.reducirMarcha();
		System.out.println(
				"Una vez efectuada la reducción de marchas, ésta cambia a: " + carro.getNumeroMarchas() + "\n");

		System.out.println("----------------Datos del propietario----------------\n");

		Propietario propietario = new Propietario("Jorge Domínguez", "DODJ200728MYHSM02", "DODJ20728SA64");
		System.out.println("El propietario es: " + propietario.getNombre());
		System.out.println("Con CPF: " + propietario.getCpf());
		System.out.println("Y RG: " + propietario.getRg());

		Direccion direccion = new Direccion("Emiliano Zapata", "Arboledas", "Morelia", "Michoacán", 45627,
				"Esquina con Francisco Villa");
		System.out.println("La dirección de este propietario es:" + "Calle " + direccion.getCalle() + ". colonia "
				+ direccion.getColonia());
		System.out.println("Código postal " + direccion.getCodigoPostal());
		System.out.println("En la ciudad de " + direccion.getCiudad() + " del estado de " + direccion.getEstado());
		System.out.println("Más referencias: " + direccion.getComplemento() + "\n");

		Marca marca = new Marca();
		marca.setNombreMarca("Volkswagen");
		marca.setNumeroModelos(200);
		marca.setAnioLanzamiento(2007);
		marca.setIdentificador("7HMJS43XLYT109873");
		marca.mostrarDatosMarca();

		System.out.println("--------------Fin del registro solicitado--------------");
	}

}
