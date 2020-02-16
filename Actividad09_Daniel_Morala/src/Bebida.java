

public class Bebida {
	
	private String bebida;
	private double precio;
	
	public Bebida(String bebida, double precio) {
		super();
		this.bebida = bebida;
		this.precio = precio;
	}

	public String getBebida() {
		return bebida;
	}

	public double getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return "Servicio [bebida=" + bebida + ", precio=" + precio + "]";
	}

	
	
}
