import db.DBBreeder;
import models.Breeder;

/**
 * Created by Finn on 16/01/2018.
 */
public class Runner {

    public static void main(String[] args) {

        DBBreeder.deleteAllBreeders();

        Breeder breeder = new Breeder("Finn", "Porter", "UK");
        DBBreeder.saveBreeder(breeder);
        System.out.println("Orig breeder: " + breeder.getCountry());


        breeder.setCountry("United Kingdom");

        DBBreeder.updateBreederById(breeder);
        System.out.println("Updated Breeder: " + breeder.getCountry());
    }
}
