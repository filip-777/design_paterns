package pl.sda.structural.proxy.adapter;

public class MechanicalDuck implements IMechanicalAnimal {

    @Override
    public void doMechanicalSound() {
        System.out.println("fake mechanical Quack");
    }
}
