import java.util.ArrayList;

public class main{
    public static void main(String[] args) {
        
        ArrayList<Vol> listVol = new ArrayList<>();

        listVol.add(new Vol(244, "New York", 1000.00, 210, 89));
        listVol.add(new Vol(365, "Johannesburg", 1200.25, 180, 50));
        listVol.add(new Vol(777, "Tokyo", 1500.50,200, 190));
        listVol.add(new Vol(123, "Rio de Janeiro", 1300.75, 210, 210));
        listVol.add(new Vol(457, "Istenbul", 900.00, 210, 3));

        // System.out.println("Réservation" + );

        reservation client1 = new reservation("Dupond", "Marine", 20, 800, false, 244, "New York");
        
        System.out.println(client1.ToString());
        System.out.println(client1.reductionAge(800));

        



        

































    }
}