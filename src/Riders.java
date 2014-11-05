public class Riders{                  //Juan Muñoz
	private String nombre;
	private String moto;
	private int posicion;
	
	public Riders(String nombre, String moto, int posicion){
		this.nombre=nombre;
		this.moto=moto;
		this.posicion=posicion;
	}
	
	//creamos los getters
	public String getNombre(){
		return this.nombre;
	}
	
	public String getMoto(){
		return this.moto;
	}
	
	public int getPosicion(){
		return this.posicion;
	}
}
	
	//creamos los setters
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public void setMoto(String moto){
		this.moto=moto;
	}
	
	public void setPosicion(int posicion){
		this.posicion=posicion;
	}
}
