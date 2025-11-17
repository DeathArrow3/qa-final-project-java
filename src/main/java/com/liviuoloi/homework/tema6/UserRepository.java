package com.liviuoloi.homework.tema6;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) throws InvalidUserDataException {

        if ( user == null ) {
            throw new InvalidUserDataException("User invalid ");
        }
        if ( (user.getUsername() == null || user.getUsername().length() < 3 )) {
            throw new InvalidUserDataException("User invalid ");
        }
        if ( user.getAge() < 0) {
            throw new InvalidUserDataException("User invalid ");
        }
            this.users.add(user);

    }

    public List<User> getUsers(){
        return new ArrayList<>(this.users);
    }

}
