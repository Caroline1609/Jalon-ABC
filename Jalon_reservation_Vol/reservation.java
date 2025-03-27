import java.util.List;

public class reservation {
    
    private List<Vol> Vols;
    private String nom;
    private String prenom;
    private int age;
    private double prixFinal;
    private boolean business;
    private int numVol;
    private String destination;
    
    
    public reservation (String nom, String prenom, int age, double prixFinal, boolean business, int numVol, String destination){
    
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.prixFinal = prixFinal;
        this.business = business;
        this.numVol = numVol;
        this.destination = destination;
    }

    public String ToString(){
            return "Réservation\n" + "Nom : " + this.nom + "\nPrenom : " + this.prenom + "\nAge : " + this.age + "\nPrix final : " + this.prixFinal + "\nNumeros de vol : " + this.numVol + " \nDestination : " + this.destination ;

    }

    public double reductionAge(double prixDepart){

        prixDepart = this.prixFinal;

        if(this.age < 66) {

            this.prixFinal -= this.prixFinal / (this.age * 0.1);
        } else {

            this.prixFinal -= this.prixFinal / (this.age * 0.05);
        }

        if (this.prixFinal <= prixDepart - 600) {

            this.prixFinal = prixDepart - 600;

            return prixDepart - this.prixFinal;

        } else {
            return prixDepart - this.prixFinal;
        }
    }






    





























} //fin de class
