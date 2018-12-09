import pl.sda.creational.builder.Customer;
import pl.sda.creational.factory.Profession;
import pl.sda.creational.factory.Warrior;
import pl.sda.creational.singleton.SingletonLogger;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Warrior warrior = new Warrior("Bolek",3, Profession.ARCHER);

        Warrior warrior1 = new Warrior("Legolas",5,Profession.SWORDSMAN);

        warrior.changeProfession(Profession.WIZARD);

        SingletonLogger.getInstance().log("logger");
    }
}
