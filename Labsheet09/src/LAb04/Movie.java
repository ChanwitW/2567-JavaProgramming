package LAb04;

public class Movie {
    private String id;
	private String name;
	private director director;
	
	
	public Movie(String id , String name , director director) {
		this.id = id;
		this.name = name;
		this.director = director;
	}

	public Movie() {}

	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public director getDirector() {
		return director;
	}

	public void setDirector() {
		this.director = director;
	}

	public String toString() {
		return getId() + " " + getName() + " direct by " + director.toString();
	}
 }
