package pl.sda.sandbox;

import sun.plugin.dom.exception.InvalidStateException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class UserInMemoryDatabase {
    private final List<User> users;

    public UserInMemoryDatabase() {
        users = new ArrayList<>();
        User user = new User("ASD", "sadasdas", "sad@asfaf.pl",
                20, Sex.MALE);
        users.add(user);
    }

    public void add(User user) {
        if(user != null) {
            users.add(user);
        }
    }

    public User getById(UUID id) {
        for(User user : users) {
            if(user.getId().equals(id)) {
                return user;
            }
        }
        throw new InvalidStateException("User not found");
    }

    public Optional<User> getByEmail(String email) {
        return users.stream().filter(user -> user.getEmail().equals(email)).findFirst();
    }

    public int getUsersCount() {
        return users.size();
    }
}
