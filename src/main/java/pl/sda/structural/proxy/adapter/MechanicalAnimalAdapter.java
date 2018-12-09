package pl.sda.structural.proxy.adapter;

public class MechanicalAnimalAdapter implements Animal {

    private final IMechanicalAnimal adaptedMechanicalAnimal;

    public MechanicalAnimalAdapter(IMechanicalAnimal adaptedMechanicalAnimal) {
        this.adaptedMechanicalAnimal = adaptedMechanicalAnimal;
    }


    @Override
    public void makesound() {
        adaptedMechanicalAnimal.doMechanicalSound();
    }
}
