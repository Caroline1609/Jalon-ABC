

/* Programme à réaliser :
 
[Réception d'un message électronique] 
 
Lorsqu’un email est réceptionné par un serveur de messagerie, quelques vérifications sont nécessaires avant que l’email soit transmis à son destinataire final.  
 
Il est indispensable de contrôler que l’adresse email du destinataire existe et que la boite de réception du destinataire dispose de suffisamment d’espace disponible. Une analyse antivirus est systématiquement faite sur les pièces jointes (le serveur n’accepte que les pièces jointes inférieures à 25Mo).  
 
Si toutes les contrôles sont satisfaisants, l’email est transmis au destinataire.  
 
Le destinataire a peut-être activé un message d’absence (réponse automatique). Si tel est le cas, celui-ci est transmis à l’expéditeur. */



public class exo {
    public static void main(String[] args) {
                
        String EmailDesti = "rrrrr.XXXXXXX@wwwwwwww.ccc"; // Le mail du destinataire.
        String verifEmailDesti = "rrrrrr.XXXXXXX@wwwwwwww.ccc"; // On vérifie si elle est valide.

        int DestiEspace = 35; // Espace disponible dans la boite mail du destinataire.
        int Destiverifemail = 85; // Vérification de la taille de l'email.

        int analyseAV = 25; // L'analyse antivirus qui n'accepte pas les Pièces joints inférieur à 25 Mo.
        int Pj = 0; // taille de la pièce jointe.

        int MessageAuto = 0; // Message automatique


        
        if (EmailDesti.equals(verifEmailDesti) && Destiverifemail < DestiEspace ){ // Adresse mail ok et taille de l'email ok

            System.out.println("Message envoyer"); //Afficher.

        } else if (EmailDesti.equals(verifEmailDesti) && Destiverifemail < DestiEspace && Pj >= analyseAV ) { //Adresse mail ok et taille de l'email ok et pièce jointe ok .
            System.out.println("Message envoyer"); //Afficher.
            
        } else if (EmailDesti.equals(verifEmailDesti) && Destiverifemail < DestiEspace && Pj >= analyseAV && MessageAuto ==1 ){ // si le mail rempli toute les conditions. Et que le destinaire est mis un message automatique.

            System.out.println("Message envoyer"); //Afficher.
            System.out.println("Message automatique de votre destinaire : "); //Afficher.
            System.out.println("Je suis en vacance, je vous réponderais utérieurement"); //Afficher.

        } else { // sinon si une des conditions des fausses renvoyer.
            System.out.println("envoi impossible, veuillez respecter les régles d'envoi de mail."); // afficher
        }


        //Vérification.

        System.out.println("Vérification");
        System.out.println("Vérification du mail");
        
        if (EmailDesti.equals(verifEmailDesti)){ // Vérification que le mail est correct
            System.out.println("Email existe");
        } else{
            System.out.println("Email invalide");
        }

        System.out.println("Vérification taille du mail");
        if (Destiverifemail < DestiEspace){ //Vérifie si le destinataire a assez espace.
            System.out.println("Assez de place");
        } else {
            System.out.println("Pas assez de place");
        }


        System.out.println("Vérification de la pièce jointe (s'il y en n'a)");
        if (Pj >= analyseAV){ //Analyse de la pièce jointe
            System.out.println("Pièce jointe conforme");
        } else if (Pj < 25){
            System.out.println("pièce jointe inférieur");
        } else if (Pj <= 0){
            System.out.println("Pas de pièce jointes");
        }
            
    }
}









