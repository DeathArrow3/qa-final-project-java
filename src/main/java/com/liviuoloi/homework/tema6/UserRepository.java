package com.liviuoloi.homework.tema6;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) throws InvadidUserDataException{

        if ( user == null
                || ( user.getUsername() == null || user.getUsername().length() < 3 )
                || user.getAge() < 0) {
            throw new InvadidUserDataException("User invalid ", user.getUsername());

        } else {
            this.users.add(user);

        }
    }

    public List<User> getUsers(){
        return new ArrayList<>(this.users);
    }

}
