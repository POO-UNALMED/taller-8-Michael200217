package futbol;
import java.lang.Comparable;
public class Futbolista implements Comparable<Object> {
	private String nombre;
	private int edad;
	private final String posicion;
	public Futbolista(String nombre,int edad,String posicion){
		this.nombre=nombre;
		this.edad=edad;
		this.posicion=posicion;
	}
	public Futbolista() {
		this.nombre="Maradona";
		this.edad=30;
		this.posicion="delantero";
	}
	public String toString() {
		return ("El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion());
	}
	public int compareTo(Object Futbolista) {
		if(this.equals(Futbolista)) {
			return 1;
		}
		else {
			return 0;
		}
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getPosicion() {
		return posicion;
	}
	public boolean jugarConLasManos() {
		if(this.getPosicion()=="Portero") {
			return true;
		}
		else {
			return false;
		}
	}
}
