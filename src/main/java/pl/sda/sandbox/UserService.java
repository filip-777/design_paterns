package pl.sda.sandbox;

import java.util.Optional;

public class UserService {
    private final UserInMemoryDatabase userDatabase;

    public UserService(UserInMemoryDatabase userDatabase) {
        this.userDatabase = userDatabase;
    }

    public void register(String name, String password, String email, int age, Sex sex) {
        Optional<User> user = userDatabase.getByEmail(email);

        if(user.isPresent()) {
            throw new UserAlreadyExistsException(String.format("The user with %s already exists!", email));
        }

        User userToRegister = new User(name, password, email, age, sex);
        userDatabase.add(userToRegister);
    }
}

