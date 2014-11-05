public class Usuarios {
	private int id; 
	private String usuario;
	private String contra;

	public User(int id, String usuario, String contra){
		this.id = id;
		this.usuario = usuario;
		this.contra = contra;
	}

	public String getUsuario() {
	    return this.usuario;
	}

	public String getContra() {
	    return this.contra;
	}

	public void setUsuario(String usuario) {
	    this.usuario = usuario;
	}

	public void setContra(String contra) {
	    this.contra = contra;
	}

	public int getId() {
	    return this.id;
	}

	public void setId(int id) {
	    this.id = id;
	}

	public String toString(){
		return "+id: " + this.id + "\n+User: " + this.usuario + "\n+contra: " + this.contra;
	}

}
