package test;

import java.util.Collections;
import modelo.Sistema;


public class test {

	public test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Sistema sistema =new Sistema();
		
		try {
			
			sistema.agregarAuto("Peugeot","206", "4", 200000);
			sistema.agregarMoto("Honda","Titan","125cc",60000);
			sistema.agregarAuto ("Peugeot","208", "5", 250000);
			sistema.agregarMoto("Yamaha", "YBR", "160cc",80500);
		}catch(Exception e){
			 System.out.println(e.getMessage());
			
		}
		
		System.out.println("-----Ejercicio Trainee Onready-----");
		
		System.out.println("");
		System.out.println(sistema.getLstVehiculos());
		
		System.out.println("=============================");
		System.out.println(sistema.OrdenarMaxMin());
		System.out.println(sistema.VehiculoLetra("Y"));
		System.out.println("=============================");
		
		Collections.sort(sistema.getLstVehiculos(),new Sistema());
		System.out.println("Vehículos ordenados por precio de mayor a menor:");
			
		for(int i =0 ; i< sistema.getLstVehiculos().size(); i++) {
			System.out.print(" "+ sistema.getLstVehiculos().get(i).getMarca()+" ");
			System.out.println (sistema.getLstVehiculos().get(i).getModelo() );
		}
		
		System.out.println("=============================");
	
		
		

	}//FIN MAIN

}//FIN CLASE
