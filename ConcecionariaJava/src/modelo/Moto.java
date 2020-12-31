package modelo;

public class Moto extends Vehiculo {
		
	
	private String cilindrada;



	public Moto(String marca, String modelo, String cilindrada,double precio) {
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;
	}

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "\n Marca=" + getMarca() + ", Modelo=" + getModelo()
				+" ,Cilindrada= " + cilindrada +  ", Precio=" + getPrecio() ;
	}

	
	
		
	
	
	
	

}
