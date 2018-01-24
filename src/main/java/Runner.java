import db.DBBreeder;
import db.DBDog;
import db.DBLogin;
import models.Breeder;
import models.Dog;
import models.Login;

/**
 * Created by Finn on 16/01/2018.
 */
public class Runner {

    public static void main(String[] args) {

        DBBreeder.deleteAllBreeders();
        DBDog.deleteAllDogs();
        DBLogin.deleteAllLogins();

        Breeder breeder = new Breeder("Finn", "Porter", "UK");
        DBBreeder.saveBreeder(breeder);
        System.out.println("Orig breeder: " + breeder.getCountry());

        Dog dog1 = new Dog("Nomi", "akcNomi", "DN123456789", "kcNomi", "987654321", 20170314, 'f', "blue merle", 47.0, 18.5, "long", "4:3", "elbows", "eyes", "cea", "gpra", "hsf", "cmr", "mdr", "igs", "dm", "Andie", breeder);
        DBDog.saveDog(dog1);

        Login login = new Login("email@email.com", "password");
        DBLogin.saveLogin(login);

        breeder.setCountry("United Kingdom");
        dog1.setKcRegNum("UK987654321");
        login.setPassword("1234");

        DBBreeder.updateBreederById(breeder.getId());
        System.out.println("Updated Breeder: " + breeder.getCountry());

        DBDog.updateDogById(dog1.getId());
        System.out.println("Updated Dog: " + dog1.getKcRegNum());

        DBLogin.updateLoginById(login.getId());
        System.out.println("Updated login: " + login.getPassword());

        Breeder foundBreeder = DBBreeder.findBreederById(breeder.getId());
        System.out.println("found breeder: " + foundBreeder.getFirstName() + " " + foundBreeder.getLastName());

        Dog foundDog = DBDog.findDogbyId(dog1.getId());
        System.out.println("found dog: " + foundDog.getNickName());

        Login foundLogin = DBLogin.findLoginById(login.getId());
        System.out.println("found login: " + foundLogin.getEmail());

        DBDog.deleteDogById(dog1.getId());
        System.out.println("all dog: " + DBDog.getAllDogs());

        DBBreeder.deleteBreederById(breeder.getId());
        System.out.println("all breeders: " + DBBreeder.getAllBreeders());
    }
}
