/**
 * Universidad de San Carlos de Guatemala
 * Facultad de Ingenieria
 * Ingenieria en Ciencias y Sistemas
 * Esdras Benjamin Cotto Revolorio
 * Carnet: 200412823
 */

package Principal;

import static Principal.Principal.webClient;
import java.net.URL;
import javax.swing.JTextField;
import java.io.IOException;
import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import java.util.ArrayList;
import org.json.*;

/**
 *
 * @author Ben
 */
public class ConectarWebService {

    public ConectarWebService() {
    }    
    
    //con este metodo meto el aeropuerto a la lista doble
    public static void crearAeropuerto(String nombr, String Passwordd,String ppais) throws IOException{
        URL url = new URL("http://localhost:5000/aeropuerto/insertar");

	RequestBody formBody = new FormEncodingBuilder()
                .add("NombreAeropuerto", nombr)
                .add("Contrasenia", Passwordd)
                .add("Pais", ppais)            
                .build();

	Request request = new Request.Builder().url(url).post(formBody).build();
        System.out.println("*******************************************************");
        System.out.println("*******************************************************");
        System.out.println("*******************************************************");
        System.out.println(request);
	Response response = webClient.newCall(request).execute();
	String response_string = response.body().string();
        System.out.println("********************* Este se ingreso ************************+");
	System.out.println(response_string);
        
    }
    
    //con este metodo meto el usuario al arbol de usuarios
    public static void crearUsuario(String nombr, String Passwordd,String nicc,String dirre, String telle, String creddit,String dirAcctu) throws IOException{
        URL url = new URL("http://localhost:5000/usuario/insertar");

	RequestBody formBody = new FormEncodingBuilder()
                .add("Nombre", nombr)
                .add("Contrasenia", Passwordd)
                .add("NameUsuario", nicc)
                .add("Direccion", dirre)
                .add("Telefono", telle)
                .add("TarjetaCredito", creddit)
                .add("DireccionActual", dirAcctu)
                .build();

	Request request = new Request.Builder().url(url).post(formBody).build();
        System.out.println("*******************************************************");
        System.out.println("*******************************************************");
        System.out.println("*******************************************************");
        System.out.println(request);
	Response response = webClient.newCall(request).execute();
	String response_string = response.body().string();
        System.out.println("********************* Este se ingreso ************************+");
	System.out.println(response_string);
        
    }
    
    //con este metodo meto el vuelo al arbol de vuelos
    public static void crearVuelo(String LugarSalida,String LugarLlegada,String HoraSalida,String FechaSalida,String HoraLLegada,String FechaLLegada,int CantPrimeraClase,int CostoPrimeraClase,int CantTurista,int CostoTurista,int CantEjecutiva,int CostoEjecutiva, String EstadoVuelo) throws IOException{
        URL url = new URL("http://localhost:5000/vuelos/insertar");

	RequestBody formBody = new FormEncodingBuilder()
                .add("LugarSalida", LugarSalida)
                .add("LugarLlegada", LugarLlegada)
                .add("HoraSalida", HoraSalida)
                .add("FechaSalida", FechaSalida)
                .add("HoraLlegada", HoraLLegada)
                .add("FechaLlegada", FechaLLegada)
                .add("CantPrimeraClase", Integer.toString(CantPrimeraClase))
                .add("CostoPrimeraClase", Integer.toString(CostoPrimeraClase))
                .add("CantTurista", Integer.toString(CantTurista))
                .add("CostoTurista", Integer.toString(CostoTurista))
                .add("CantEjecutiva", Integer.toString(CantEjecutiva))
                .add("CostoEjecutiva", Integer.toString(CostoEjecutiva))
                .add("EstadoVuelo", EstadoVuelo)
                .build();

	Request request = new Request.Builder().url(url).post(formBody).build();
        System.out.println(request);
	Response response = webClient.newCall(request).execute();
	String response_string = response.body().string();
        if(response_string.equalsIgnoreCase("success")){
            System.out.println("******** GUARDADO CON EXITO *********");
        }else {
             System.out.println("******** NO SE PUEDE *********");
        }
        //return devuelve;
        
    }
    
    //este es un metodo de pruebas 
    public static void holaMundo(JTextField textoArea) throws IOException{
        URL url = new URL("http://localhost:5000/bienvenido");
	Request request = new Request.Builder().url(url).build();
	Response response = webClient.newCall(request).execute();
	String response_string = response.body().string();
        textoArea.setText(response_string);
    }
    
    //este metodo servira para saber si se logueo 
    public boolean  loguearAlUsuario(String niccc,String passs) throws IOException{
        boolean devuelve=false;
       URL url = new URL("http://localhost:5000/usuario/loguear");

	RequestBody formBody = new FormEncodingBuilder()
                .add("Nicckkk", niccc)
                .add("Passwwww", passs)                        
                .build();

	Request request = new Request.Builder().url(url).post(formBody).build();
        System.out.println(request);
	Response response = webClient.newCall(request).execute();
	String response_string = response.body().string();
        if(response_string.equalsIgnoreCase("success")){
            devuelve=true;
        }else {
            devuelve=false;
        }
        return devuelve;
    }
    
    //este metodo servira para asignar a un usuario a un vuelo
    public void AsignarseAlVuelo(String codigoVuelo, String niccc,String Categoria) throws IOException{
      
       URL url = new URL("http://localhost:5000/usuario/agregarAlVuelo");

	RequestBody formBody = new FormEncodingBuilder()               
                .add("IdVuelo", codigoVuelo)            
                .add("NameUsuario", niccc)
                .add("Categoria", Categoria)
                .build();

	Request request = new Request.Builder().url(url).post(formBody).build();
        System.out.println(request);
	Response response = webClient.newCall(request).execute();
	String response_string = response.body().string();
        System.out.println("Felicidades");     
    }
    
    //este metodo servira para saber si se logueo  el aeropuerto
    public boolean  loguearAlAeropuerto(String niccc,String passs) throws IOException{
        boolean devuelve=false;
       URL url = new URL("http://localhost:5000/usuario/loguearAeropuerto");

	RequestBody formBody = new FormEncodingBuilder()
                .add("Nicckkk", niccc)
                .add("Passwwww", passs)                        
                .build();

	Request request = new Request.Builder().url(url).post(formBody).build();
        System.out.println(request);
	Response response = webClient.newCall(request).execute();
	String response_string = response.body().string();
        if(response_string.equalsIgnoreCase("success")){
            devuelve=true;
        }else {
            devuelve=false;
        }
        return devuelve;
    }
    
    //este metodo me devuelve todos los aeropuertos
    public static void holaMundo() throws IOException{
        URL url = new URL("http://localhost:5000/bienvenido");
	Request request = new Request.Builder().url(url).build();
	Response response = webClient.newCall(request).execute();
	String response_string = response.body().string();        
    }
    
    
    public  JSONArray VerTodosVuelos() throws IOException {
		URL url = new URL("http://localhost:5000/verTodosVuelos");
		Request request = new Request.Builder().url(url).build();
		Response response = webClient.newCall(request).execute();
		String response_string = response.body().string();

		JSONArray objects_array = new JSONArray(response_string);
		for (int i = 0; i < objects_array.length(); i++) {
			JSONObject vuelito = objects_array.getJSONObject(i);
                        
//			System.out.println("name: " + avion.get("name"));
//			System.out.println("id: " + avion.get("id"));
		}
                return objects_array;
                
	}
    
    
    public JSONArray VerTodosAeropuertos() throws IOException {
	URL url = new URL("http://localhost:5000/verTodosAeropuertos");
	Request request = new Request.Builder().url(url).build();
	Response response = webClient.newCall(request).execute();
	String response_string = response.body().string();
	JSONArray objects_array = new JSONArray(response_string);
	for (int i = 0; i < objects_array.length(); i++) {
            JSONObject aeropuertito = objects_array.getJSONObject(i);
//		System.out.println("name: " + avion.get("name"));
//		System.out.println("id: " + avion.get("id"));
	}
        return objects_array;
}
    
    
    public JSONArray  VerTodosUsuario() throws IOException {
	URL url = new URL("http://localhost:5000/verTodosUsuario");
	Request request = new Request.Builder().url(url).build();
	Response response = webClient.newCall(request).execute();
	String response_string = response.body().string();

	JSONArray objects_array = new JSONArray(response_string);
	for (int i = 0; i < objects_array.length(); i++) {
            JSONObject usuario = objects_array.getJSONObject(i);
//      	System.out.println("name: " + avion.get("name"));
//		System.out.println("id: " + avion.get("id"));
	}
        return objects_array;
    }
    
    public JSONArray VerTodosUsuarioEnUnVuelo() throws IOException {
	URL url = new URL("http://localhost:5000/verTodosUsuariosEnVuelo");
	Request request = new Request.Builder().url(url).build();
	Response response = webClient.newCall(request).execute();
	String response_string = response.body().string();

        JSONArray objects_array = new JSONArray(response_string);
	for (int i = 0; i < objects_array.length(); i++) {
		JSONObject usuario = objects_array.getJSONObject(i);
//		System.out.println("name: " + avion.get("name"));
//		System.out.println("id: " + avion.get("id"));
	}
        return objects_array;
    }
    
}
