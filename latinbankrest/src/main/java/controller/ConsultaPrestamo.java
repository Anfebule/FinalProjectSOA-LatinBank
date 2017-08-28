package controller;

import java.util.HashMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/prestamo")
public class ConsultaPrestamo {
	
	@Path("/consultar")
	@GET
	@Produces("application/json")
	public HashMap<String, String> consultaPrestamo(){
		
		HashMap<String, String> respuesta = new HashMap<String, String>();
		respuesta.put("Tasa", "30");
		respuesta.put("Tipo", "EA");
		return respuesta;
	}
	
}
