public class Books {
	private int id;
	private String authorname;
	
	/**
	 * Constructor
	 **/ 
	
	public Books(int id, String authorname){
		this.id = id;
		this.authorname = authorname;
	}
	
	/**
	 * Getters & setters
	 **/
	public int getId(){
		return this.id;
	}
	
	public String getAuthorName(){
		return this.authorname;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public void setAuthorName(String AuthorName){
		this.authorname = authorname;
	}
}
