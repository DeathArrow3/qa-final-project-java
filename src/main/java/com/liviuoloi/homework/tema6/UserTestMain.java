package com.liviuoloi.homework.tema6;

public class UserTestMain {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        User user1 = new User("testuser", 25);
        User user2 = new AdminUser("admin", 30, "full_access");
        User user3 = new User("ab", 22);
        User user4 = new User("baduser", -5);

        try {
            userRepository.addUser(user1);

        } catch (InvalidUserDataException e) {
            System.out.println("Userul este: " + e.getMessage());
        }

        try {
            userRepository.addUser(user2);

        } catch (InvalidUserDataException e) {
            System.out.println("Userul este: " + e.getMessage());
        }

        try {
            userRepository.addUser(user3);

        } catch (InvalidUserDataException e) {
            System.out.println("Userul este: " + e.getMessage());
        }

        try {
            userRepository.addUser(user4);

        } catch (InvalidUserDataException e) {
            System.out.println("Userul este: " + e.getMessage());
        }

        for (User u : userRepository.getUsers()) {
          System.out.println("Userul este: " + u.getUsername() + " cu varsta: " + u.getAge());
        }

    }
}
