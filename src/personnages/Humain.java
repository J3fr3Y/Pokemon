package personnages;

public class Humain {
	public String nom;
	public String role;
	public String genre;
	
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
	public void setNom(String nom) {
		this.nom=nom;
	}
	public void setRole(String role) {
		this.role=role;
	}
	public void setGenre(String genre) {
		this.genre=genre;
	}
}
