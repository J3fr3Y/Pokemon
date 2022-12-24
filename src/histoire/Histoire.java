package histoire;


import java.util.Scanner;
import java.util.Random;

import personnages.Professeur;
import personnages.PersonnagePrincipale;
import personnages.Adversaire;
import pokemon.Pokemon;

public class Histoire {


	public static void main(String[] args) {
		Professeur oak = new Professeur("Oak", "professeur","masculin");
		
		try (Scanner scanGenre = new Scanner(System.in);
				Scanner scanNom = new Scanner(System.in);
				Scanner scanBool = new Scanner(System.in);
				Scanner scanPokemon = new Scanner(System.in)) {
			System.out.println("Bienvenue au monde Pokemon. Je m'appelle " + oak.getRole() + " " + oak.getNom()+ ". J'étudie ces créatures connues comme Pokémon");
			System.out.println("Raconte moi un peu de toi. C'est quoi ton genre?(masculin/féminin/autre) ");
			String genre = scanGenre.nextLine();
			while (!"masculin".equals(genre) && !"féminin".equals(genre) && !"autre".equals(genre) ) {
				System.out.println("T'as bien tapé une des options? (masculin/féminin/autre) ");
				genre = scanGenre.nextLine();
			}
			System.out.println("Okay alors t'es du genre " + genre + ". Maintenant dis-moi, comment tu t'apelles? ");
			String nom = scanNom.nextLine();
			
			
			if ("masculin".equals(genre)) {
				System.out.println("Bienvenu " + nom + " tu seras un grand entraîneur Pokemon un jour, mais pour cela tu dois d'abord choisir un Pokémon initial.");
			}else if ("féminin".equals(genre)) {
				System.out.println("Bienvenu " + nom + " tu seras une grande entraîneuse Pokemon un jour, mais pour cela tu dois d'abord choisir un Pokémon initial.");
			}
			else {
				System.out.println("Bienvenu " + nom + " tu seras un grand entraîneur Pokemon un jour, mais pour cela tu dois d'abord choisir un Pokémon initial.");
			}

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
			String[] mesPokemons = new String[6];
			while (pokemon<1 || pokemon>3) {
				System.out.println("Cette option n'est pas valide!(Tapez une valeur parmi 1/2/3)");
				pokemon = scanPokemon.nextInt();
			}
			
			switch (pokemon) {
			case 1:
				Pokemon monBulbizarre = new Pokemon("Bulbizarre",1,"plante,poison",45,49,49);
				System.out.println("Félicitations t'as choisi "+ monBulbizarre.nom +" comme ton pokémon initial.");
				mesPokemons [0]=monBulbizarre.getNom();
				break;
			case 2:
				Pokemon monSalameche = new Pokemon("Salamèche",1,"feu",39,52,43);
				System.out.println("Félicitations t'as choisi "+monSalameche.nom+" comme ton pokémon initial.");
				mesPokemons [0]=monSalameche.getNom();
				break;
			default:
				Pokemon monCarapuce = new Pokemon("Carapuce",1,"eau",44,48,65);
				System.out.println("Félicitations t'as choisi "+monCarapuce.nom+" comme ton pokémon initial.");
				mesPokemons [0]=monCarapuce.getNom();
				break;
			}
			
			System.out.println("Maintenant t'es prêt pour te prommener en toute sécurité mais d'abord il faut que t'ais un premier combat.");
			Adversaire bleu = new Adversaire("Bleu","entraineur","masculin");
			System.out.println("Je te présente mon neveu " +bleu.nom + " lui aussi il est un nouveau " + bleu.role + " pokémon. Il doit choisir un des deux pokémons restants.");
			String[] bleuPokemons = new String[6];
			Random rand = new Random();
			int int_random= rand.nextInt(4);
			
			
			if (int_random != pokemon) {
				switch (int_random) {
				case 1:
					Pokemon bleuBulbizarre = new Pokemon("Bulbizarre",1,"plante,poison",45,49,49);
					System.out.println("Félicitations " + bleu.nom + " a choisi " +bleuBulbizarre.nom+ " comme son pokémon initial.");
					bleuPokemons [0]=bleuBulbizarre.getNom();
					break;
				case 2:
					Pokemon bleuSalameche = new Pokemon("Salamèche",1,"feu",39,52,43);
					System.out.println("Félicitations " + bleu.nom + " a choisi " +bleuSalameche.nom+" comme son pokémon initial.");
					bleuPokemons [0]=bleuSalameche.getNom();
					break;
				default:
					Pokemon bleuCarapuce = new Pokemon("Carapuce",1,"eau",44,48,65);
					System.out.println("Félicitations " + bleu.nom + " a choisi " +bleuCarapuce.nom+" comme son pokémon initial.");
					bleuPokemons [0]=bleuCarapuce.getNom();
					break;
				}
			}else{
				while(int_random == pokemon) {
					int_random = rand.nextInt();
				}
				switch (int_random) {
				case 1:
					Pokemon bleuBulbizarre = new Pokemon("Bulbizarre",1,"plante,poison",45,49,49);
					System.out.println("Félicitations " + bleu.nom + " a choisi " +bleuBulbizarre.nom+ " comme son pokémon initial.");
					bleuPokemons [0]=bleuBulbizarre.getNom();
					break;
				case 2:
					Pokemon bleuSalameche = new Pokemon("Salamèche",1,"feu",39,52,43);
					System.out.println("Félicitations " + bleu.nom + " a choisi " +bleuSalameche.nom+" comme son pokémon initial.");
					bleuPokemons [0]=bleuSalameche.getNom();
					break;
				default:
					Pokemon bleuCarapuce = new Pokemon("Carapuce",1,"eau",44,48,65);
					System.out.println("Félicitations " + bleu.nom + " a choisi " +bleuCarapuce.nom+" comme son pokémon initial.");
					bleuPokemons [0]=bleuCarapuce.getNom();
					break;
				}
			}
			System.out.println("Mon pokémon est " + mesPokemons[0]);
			System.out.println("Le Pokémon de Bleu est " + bleuPokemons[0]);
		}
	
	
	}
}
