package modelo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Sistema implements Comparator<Vehiculo> {

		List <Vehiculo> lstVehiculos = new ArrayList <Vehiculo>();
		
		
		public List<Vehiculo> getLstVehiculos() {
			return lstVehiculos;
		}


		public void setLstVehiculos(List<Vehiculo> lstVehiculos) {
			this.lstVehiculos = lstVehiculos;
		}

	
		
		@Override
		public String toString() {
			return "Sistema [lstVehiculos=" + lstVehiculos +  "]";
		}


		public Vehiculo traerVehiculo(String marca,String modelo) { // validacion si existe vehiculo de igual marca y modelo
			Vehiculo vehiculo = null;
			int i =0;
			
			while( vehiculo== null  && i<lstVehiculos.size()){
				if (this.lstVehiculos.get(i).getModelo().equalsIgnoreCase(modelo)) {
					
					if(this.lstVehiculos.get(i).getMarca().equalsIgnoreCase(marca)){
				
							vehiculo= this.lstVehiculos.get(i) ;
				
							}
					}
				i++;
			}
			
			return vehiculo;
			
			}
			
		
		public boolean traerModelo(String modelo) { // existe modelo
		boolean modelo1 = false;
		int i =0;
		
		while( modelo1== false  && i<lstVehiculos.size()){
			if ( this.lstVehiculos.get(i).getModelo().equalsIgnoreCase(modelo)) {
				modelo1= true ;
			}
			i++;
		}
		
		return modelo1;
		
		}//fin traer
		
		
		public void agregarAuto(String marca,String modelo,String puertas,double precio) throws Exception {
			//VALIDAR VEHICULO		
			if (this.traerVehiculo(marca,modelo)== null) {
			
			Auto vehiculo = new Auto(marca,modelo,puertas,precio);
			lstVehiculos.add(vehiculo);
			
			
			
			}else {
				throw new Exception("El vehiculo ingresado ya existe en el sistema");
				}
		}
		
			
		public void agregarMoto(String marca,String modelo,String cilindrada,double precio) throws Exception {
			//VALIDAR VEHICULO		
			if (this.traerVehiculo(marca,modelo)== null) {
			
			Moto vehiculo = new Moto(marca,modelo,cilindrada,precio);
			lstVehiculos.add(vehiculo);
			
			
			}else {
				throw new Exception("El vehiculo ingresado ya existe en el sistema");
				}
		}
		
		
		public String OrdenarMaxMin() {
		int i=0;	
		String max = null, min=null,modelo1=null,modelo2=null, resultado; // retorna el resultadoo
		double maximo =lstVehiculos.get(i).getPrecio();
		double minimo= lstVehiculos.get(i).getPrecio();
		
		for ( i = 0; i < lstVehiculos.size(); i++) {
            
	        if(lstVehiculos.get(i).getPrecio() >= maximo){
	        
	            maximo=lstVehiculos.get(i).getPrecio();
	            max= lstVehiculos.get(i).getMarca();
	            modelo1= lstVehiculos.get(i).getModelo();
	        }
	        
	        if(lstVehiculos.get(i).getPrecio() <minimo){
	        
	            minimo=lstVehiculos.get(i).getPrecio();
	            min= lstVehiculos.get(i).getMarca();								
	            modelo2= lstVehiculos.get(i).getModelo();
	        }
	    }		
		
			return resultado = "Vehículo más caro:" +max+" "+modelo1 +",\nVehículo más barato:" +min+" "+modelo2;
			
		}
		
		
	// Vehículo que contiene en el modelo la letra ‘Y’:
		
		public String VehiculoLetra(String letra) {
		String resultado2=null;
		

		for (int i= 0; i < lstVehiculos.size(); i++) {
			String sCadena =lstVehiculos.get(i).getModelo();
			String sCadena2=lstVehiculos.get(i).getMarca();
			
			if(sCadena.contains(letra)   )  {
				
				 resultado2 ="Vehículo que contiene en el modelo la letra  "+letra+ " es : "+sCadena+" "+sCadena2+" $"+this.lstVehiculos.get(i).getPrecio();
				
				}
			}
		
		 return resultado2;
			
		}
		
		


		@Override
		public int compare(Vehiculo o1, Vehiculo o2) {

			Vehiculo veh1= (Vehiculo) o1;
			Vehiculo veh2= (Vehiculo) o2;
			
		int rpta=0;
		if(veh1.getPrecio() < veh2.getPrecio()) {

			rpta=1;
		}else if  (veh1.getPrecio() > veh2.getPrecio()) 
				
				rpta= -1;	
			else {
				rpta=0;
			}
		
			return rpta ;
		}
		


}//fin clase
