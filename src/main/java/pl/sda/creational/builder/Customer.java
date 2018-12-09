package pl.sda.creational.builder;

import java.time.LocalDate;

public class Customer {
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private String pesel;
    private String profession;
    private String city;
    private String country;

    private Customer() {
    }

    public static Customer createDefault(){ // factory method
        Customer customer = new Customer();
        customer.name = "";
        customer.lastName = "";
        customer.birthDate = LocalDate.now();
        return customer;
    }

    public static Customer createEmpty(){
        return new Customer();
    }

    public static Builder create(String name, String lastName){
        return new Builder(name, lastName);
    }

    public static class Builder {
        private Customer customer = new Customer();

        public Builder(String name, String lastName) {
            customer.name = name;
            customer.lastName = lastName;
            customer.birthDate = LocalDate.now();
        }

        public Builder withName(String name) {
            customer.name = name;
            return this;
        }

        public Builder withLastName(String name) {
            customer.lastName = name;
            return this;
        }

        public Builder bornAtDay(LocalDate birthDate) {
            customer.birthDate = birthDate;
            return this;
        }

        public Builder withPesel(String pesel) {
            customer.pesel = pesel;
            return this;
        }

        public Builder withProfession(String profession) {
            customer.profession = profession;
            return this;
        }

        public Builder bornInCity(String city) {
            customer.city = city;
            return this;
        }

        public Builder bornInCountry(String country) {
            customer.country = country;
            return this;
        }

        public Customer build() {
            return customer;
        }

    }

    // zamiast poniższego można stworzyć powyższego buildera


    public Customer(String name, String lastName, LocalDate birthDate, String pesel, String profession, String city, String country) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.pesel = pesel;
        this.profession = profession;
        this.city = city;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
