package Combinación;
 
/**
 * @author Yazmín Vega
 * @date 03/09/17
 */
 
public class Deportista extends Persona {
 
	private String deporte;
	public String getDeporte() { // Se crea un constructor el cual se encuentra vacío
		return deporte;
}
 
public Deportista(String nombre, String deporte) {
	this(nombre);
	this.deporte = deporte;
}
 
public void setDeporte(String deporte) {
	this.deporte = deporte;
}
 
public Deportista(String nombre) {
	super(nombre); // Constructor generado automáticamente
}
}