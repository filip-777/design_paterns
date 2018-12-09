package pl.sda.sandbox;

import java.util.UUID;

public class User {
    private final UUID id;
    private final String name;
    private final String password;
    private final int age;
    private final Sex sex;
    private final String email;

    public User(String name, String password, String email, int age, Sex sex) {
        id = UUID.randomUUID();
        this.name = name;
        this.password = password;
        this.email = email;
        this.age = age;
        this.sex = sex;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
