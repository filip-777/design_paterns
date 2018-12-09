package pl.sda.creational.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        Customer customer = Customer.create("Maja", "Dab")
                .withName("John")
                .withLastName("Kowalski")
                .build();

        Customer defaultCustomer = Customer.createDefault();
        Customer emptyCustomer = Customer.createEmpty();

    }

}
