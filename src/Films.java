public class Films {
	private int id; 
	private String tittle;
	private String Director;
	private int year;

	public Films(int id, String tittle, String Director, int year){
		this.id = id;
		this.tittle = tittle;
		this.Director = Director;
		this.year = year;
	}

	public String getTittle() {
	    return this.tittle;
	}

	public String getDirector() {
	    return this.Director;
	}

	public int getYear() {
	    return this.year;
	}
	
	public int getId() {
	    return this.id;
	}

	public void setTittle(String tittle) {
	    this.tittle = tittle;
	}

	public void setDirector(String Director) {
	    this.Director = Director;
	}

	public void setYear(int year) {
	    this.year = year;
	}

	public void setId(int id) {
	    this.id = id;
	}

	public String toString(){
		return "+id: " + this.id + "\n+Tittle: " + this.tittle + "\n+Director: " + this.Director + "\n+Id:" + this.id;
	}

}
