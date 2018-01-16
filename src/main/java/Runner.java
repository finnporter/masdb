import db.DBBreeder;
import models.Breeder;

/**
 * Created by Finn on 16/01/2018.
 */
public class Runner {

    public static void main(String[] args) {

        Breeder breeder = new Breeder("Finn", "Porter", "UK");
        DBBreeder.saveBreeder(breeder);
    }
}
