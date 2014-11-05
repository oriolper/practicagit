public class Singers {
	private int id; 
	private String name;
	private String firstSong;
	private int age;

	public Singers(int id, String name, String firstSong, int age){
		this.id = id;
		this.name = name;
		this.firstSong = firstSong;
		this.age = age;
	}

	public String getName() {
	    return this.name;
	}

	public String getFirstSong() {
	    return this.firstSong;
	}

	public int getAge() {
	    return this.age;
	}

	public void setName(String name) {
	    this.name = name;
	}

	public void setFirstSong(String firstSong) {
	    this.firstSong = firstSong;
	}

	public void setAge(int age) {
	    this.age = age;
	}
	public int getId() {
	    return this.id;
	}

	public void setId(int id) {
	    this.id = id;
	}

	public String toString(){
		return "+id: " + this.id + "\n+Name: " + this.name + "\n+First song: " + this.firstSong + "\n+age:" + this.age;
	}

}