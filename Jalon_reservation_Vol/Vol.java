
public class Vol{
    
    private int id;
    private String destination;
    private double tarif;
    private int nombreDePlaceTotal;
    private int nombreDePlaceOccuper;


    public Vol(int id, String destination, double tarif, int nombreDePlaceTotal, int nombreDePlaceOccuper){
        this.id = id;
        this.destination = destination;
        this.tarif = tarif;
        this.nombreDePlaceTotal = nombreDePlaceOccuper;
        this.nombreDePlaceOccuper = nombreDePlaceOccuper;
    }

    public String ToString(){
        return "L'Id du vol n°"+this.id+" en destination de "+this.destination+" a un nombre de place de "+this.nombreDePlaceTotal+" deja "+this.nombreDePlaceOccuper;
 
    }











}