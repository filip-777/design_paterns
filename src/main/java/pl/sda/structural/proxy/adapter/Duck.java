package pl.sda.structural.proxy.adapter;

public class Duck implements Animal {

    @Override
    public void makesound() {
        System.out.println("Quack");
    }
}
