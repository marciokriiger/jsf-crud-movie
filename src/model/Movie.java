package model;

public class Movie {
	
	// Attributes
	private int id;	
	private String name;
	private String genrer;
	private String director;
	private Integer year;
	private boolean editable;
         
	@Override
	public String toString() {
		return name;
	}
	
	// Getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenrer() {
		return genrer;
	}
	public void setGenrer(String genrer) {
		this.genrer = genrer;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public boolean isEditable() {
        return editable;
    }
    public void setEditable(boolean editable) {
        this.editable = editable;
    }
	// Getters and setters
	
	
}
