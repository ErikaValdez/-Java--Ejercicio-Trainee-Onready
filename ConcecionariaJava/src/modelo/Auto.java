package modelo;

public class Auto extends Vehiculo{

	private String puertas;


	public Auto(String marca, String modelo, String puertas,double precio) {
		super(marca, modelo, precio);
		this.puertas = puertas;
	}

	public String getPuertas() {
		return puertas;
	}

	public void setPuertas(String puertas) {
		this.puertas = puertas;
	}

	@Override
	public String toString() {
		return "\n Marca=" + getMarca() + ", Modelo=" + getModelo()
				+" ,Puertas=" + puertas +  ", Precio=" + getPrecio() ;
	}

	

}
