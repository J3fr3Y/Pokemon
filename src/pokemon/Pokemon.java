package pokemon;

public class Pokemon {
	public String nom;
	public String type;
	public int niveau;
	public int hp;
	public int attaque;
	public int defense;
	
	public Pokemon(String nom, int niveau, String type, int hp, int attaque, int defense) {
		super();
		this.nom=nom;
		this.niveau=niveau;
		this.type=type;
		this.hp=hp;
		this.attaque=attaque;
		this.defense=defense;
	}
	
	public String getNom() {
		return nom;
	}
	public int getNiveau() {
		return niveau;
	}
	public String getType() {
		return type;
	}
	public int getHp() {
		return hp;
	}
	public int getAttaque() {
		return attaque;
	}
	public int getDefense() {
		return defense;
	}
	
}
