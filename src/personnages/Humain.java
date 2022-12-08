package personnages;

public class Humain {
	private String nom;
	private String role;
	private String genre;
	
	public Humain(String nom, String role,String genre) {
		super();
		this.nom=nom;
		this.role=role;
		this.genre=genre;
	}
	
	public String getNom() {
		return nom;
	}
	public String getRole() {
		return role;
	}
	public String getGenre() {
		return genre;
	}
}
