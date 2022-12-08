package personnages;
import java.util.Scanner;

public class Professeur extends Humain{
	public Professeur(String nom, String role, String genre) {
		super(nom, role, genre);
	}
	Scanner scanGenre = new Scanner(System.in);
	Scanner scanNom = new Scanner(System.in);
	public void bienvenue() {
		System.out.println("Bienvenue au monde Pokemon. Je m'appelle professeur " + getNom()+ ". J'étudie ces créatures connues comme Pokémon");
		System.out.println("Raconte moi un peu de toi. C'est quoi ton genre? ");
		String genre = scanGenre.nextLine();
		System.out.println("Okay alors t'es du genre " + genre + ". Maintenant dis-moi, comment tu t'apelles? ");
		String nom = scanNom.nextLine();
		System.out.println("Bienvenue " + nom + " tu seras un gros entraineur Pokemon un jour, mais pour cela tu dois d'abord choisir un");
	}
	
}
 