package br.com;

public abstract class Cake {
	private String description;
    
	public Cake (String description) {
		super();
		this.description = description;
	}
    
	public String getDescription() {
		return description;
	}
    
	public abstract double cost();

}