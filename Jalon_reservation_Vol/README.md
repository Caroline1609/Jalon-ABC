# Jalon-3-Vol

Jalons: POO
Objectif : En programmation orienté-objet, me faire un petit système de réservation de vol de billet d’avion en suivant les indications. L’UML des classes sont attendus
Note : Vous êtes libres de choisir le nom de vos attributs, de vos méthodes et même des classes, tant que cela respecte les demandes.

1)	Me faire une classe vol :
Attributs :
- id
- Destination
-Tarif
- nbPlaceTotale (toujours supérieur ou égale à 80)
- nbPlaceOccupee 

Méthode :
ToString (){
/*
 Afficher toutes les infos du vol, exemple :
	Id du Vol : 967
	Destination : Brazzaville
	Tarif : 1800.00
	Nombre de place total : 200
	Nombre de place occupée : 180
 */
}
2) Dans le Main, créer une liste de Vols suivantes du tableau (Avec le Java Collection Framework ArrayList ):
id	Destination	Montant	nbPlaceTotale	nbPlaceOccupee
244	New York	1000.00	210	89
365	Johannesburg	1200.25	180	50
777	Tokyo	1500.50	200	190
123	Rio de Janeiro	1300.75	210	210
457	Istanbul	900	210	3

Faire afficher tous les vols à l’aide de ToString


3) Faire une classe Réservation :

Attributs :
Nom : Chaîne de caractère
prénom : Chaîne de caractère
age : L’âge en entier
prixFinale : Double, attention le prix finale ne peut pas être renseigner au début de l’instance, il doit être par défaut à 0. Car cette état changera en fonction du vol choisit et des réductions.
Business : Si True ou False , c’est un vol en classe Business
numeroVol : Entier, il s’agit de l’id du vol dans votre liste
Destination : Chaîne de caractère, il s’agit de la destination de votre vol dans votre liste




Méthodes : 

EstCeComplet(Vol) {
	 /* Vérifier si le vol est complet, qu’il n’y a plus de place de place disponible */
return true
}

reductionAge(Vol) {
	/*  
La réduction dépend de l'age et ce fait grâce à cette formule. 
Prix / age * 0.1 ( 0.05 pour les plus de 65 ans
La réduction maximum est de 600€. Je demande qu’on réduise le prix pas qu’on me donne le côut de la réduction 
*/

/* ATTENTION !!!! : Ce code peut générer une erreur si vous renseignez un age = 0 , trouvez un moyen d’attraper cette erreur

}

changePrixPlace(Vol){
	/*
 En fonction du nombre de place, si le nombre place occupée est en dessous ou égale à 20% de la capacité de l’avion, on ajoute une réduction de -20%. Par contre si le nombre place occupée est supérieur ou égale à 80% de sa capacité, ça sera une augmentation de +20%  

*/ 
}

augmentationBusiness{
	/* augmentation du prix , on ajoute +70% 
}

minimumPrixFinale(){
	/* Si le prix finale après réductions et augmentation est en dessous de 500€, alors le prix sera 500€  */ 
}
ChoisirUnvolParId(ListeVols) {
/* Parcourez la liste des vols pour retrouver le vol correspondant à l’id, si vous ne trouvez rien retournez null */
return Vol;
}

ChoisirUnvolParDestination(ListeVols) {
/* Parcourez la liste des vols pour retrouver le vol correspondant à la Destination, si vous ne trouvez rien retournez null */
return Vol;
}

Note Optionnel : Vous pouvez pour gagner du temps créer une fonction prixFinale qui regroupe toutes les fonctions 
prixFinale(Vol){ reductionAge(Vol) ; …  }


4) Dans le main : 
Créer votre objet réservation

Retourner le vol que vous avez choisie via la fonction ChoisirUnvolParId() ou ChoisirUnvolParDestination(). Puis Afficher ses informations complètes grâce à tout toString

Vérifier si le vol est complet. Si le vol est complet alors le programme s’arrête, le calcul du prix ne se fera pas.

Afficher son prix final après les réductions et augmentations, en fonction de votre age, choix (Economique ou Business) et du nombre de place disponibles.


BON CHANCE !!!
