package pl.sda.creational.factory;

public class Wand extends Weapon {

    public Wand(int damage) {
        super(damage);
    }

    @Override
    public void hit() {
        System.out.println("Casting spell with the wand");
    }
}
