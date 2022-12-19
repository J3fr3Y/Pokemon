package histoire;

import java.util.Scanner;
import java.util.Random;

import personnages.Professeur;
import personnages.PersonnagePrincipale;
import personnages.Adversaire;

public class Histoire {

	public static void main(String[] args) {
		Professeur oak = new Professeur("Oak", "professeur","masculin");
		
		try (Scanner scanGenre = new Scanner(System.in);
				Scanner scanNom = new Scanner(System.in);
				Scanner scanBool = new Scanner(System.in);
				Scanner scanPokemon = new Scanner(System.in)) {
			System.out.println("Bienvenue au monde Pokemon. Je m'appelle " + oak.getRole() + " " + oak.getNom()+ ". J'étudie ces créatures connues comme Pokémon");
			System.out.println("Raconte moi un peu de toi. C'est quoi ton genre? ");
			String genre = scanGenre.nextLine();
			System.out.println("Okay alors t'es du genre " + genre + ". Maintenant dis-moi, comment tu t'apelles? ");
			String nom = scanNom.nextLine();
			System.out.println("Bienvenu " + nom + " tu seras un grand entraineur Pokemon un jour, mais pour cela tu dois d'abord choisir un Pokémon initial.");

			PersonnagePrincipale moi = new PersonnagePrincipale(nom,"entraineur",genre);
			
			System.out.println("J'ai 3 pokéballs contenant chacune un pokémon de différent type, tu veux savoir leur type et sa déscription?(Tapez oui/non)");
			String rep = scanBool.nextLine();
			
			while (!"oui".equals(rep) && !"non".equals(rep) ) {
				System.out.println("Cette option n'est pas possible, tapez bien une valeur possible(oui/non)");
				rep = scanBool.nextLine();
			}
			
			if ("oui".equals(rep)) {
				System.out.println("-1:Bulbizarre: pokémon de type plante/poison");
				System.out.println("-2:Salamèche: pokémon de type feu");
				System.out.println("-3:Carapuce: pokémon de type eau");
			}else if ("non".equals(rep)) {
				System.out.println("T'as comme option les pokémons: 1:'Bulbizarre', 2:'Salamèche' et 3:'Carapuce'.");
			}
			System.out.println("Tu veux choisir lequel comme ton accompagnant?(Tapez un entier: 1/2/3)");
			System.out.print("1:Bulbizarre\n2:Salamèche\n3:Carapuce\n");
			int pokemon = scanPokemon.nextInt();
			
			while (pokemon<1 || pokemon>3) {
				System.out.println("Cette option n'est pas valide!(Tapez une valeur parmi 1/2/3)");
				pokemon = scanPokemon.nextInt();
			}
			
			switch (pokemon) {
			case 1:
				System.out.println("Félicitations t'as choisi Bulbizarre comme ton pokémon initial.");
				break;
			case 2:
				System.out.println("Félicitations t'as choisi Salamèche comme ton pokémon initial.");
				break;
			default:
				System.out.println("Félicitations t'as choisi Carapuce comme ton pokémon initial.");
				break;
			
			}
			System.out.println("Maintenant t'es prêt pour te prommener en toute sécurité mais d'abord il faut que t'ais un premier combat.");
			Adversaire bleu = new Adversaire("Bleu","entraineur","masculin");
			System.out.println("Je te présente mon neveu " +bleu.nom + " lui aussi il est un nouveau " + bleu.role + " pokémon. Il doit choisir un des deux pokémons restants.");
			Random rand = new Random();
			int int_random= rand.nextInt(4);
			if (int_random != pokemon) {
				switch (int_random) {
				case 1:
					System.out.println("Félicitations " + bleu.nom + " a choisi Bulbizarre comme ton pokémon initial.");
					break;
				case 2:
					System.out.println("Félicitations " + bleu.nom + " a choisi Bulbizarre comme ton pokémon initial.");
					break;
				default:
					System.out.println("Félicitations " + bleu.nom + " a choisi Bulbizarre comme ton pokémon initial.");
					break;
				
				}
			}else if (int_random == pokemon) {
				while(int_random == pokemon) {
					int_random = rand.nextInt();
				}
				switch (int_random) {
				case 1:
					System.out.println("Félicitations " + bleu.nom + " a choisi Bulbizarre comme ton pokémon initial.");
					break;
				case 2:
					System.out.println("Félicitations " + bleu.nom + " a choisi Bulbizarre comme ton pokémon initial.");
					break;
				default:
					System.out.println("Félicitations " + bleu.nom + " a choisi Bulbizarre comme ton pokémon initial.");
					break;
				
				}
			}
		}
	
	
	}
}
