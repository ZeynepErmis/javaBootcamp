package Concrate;

import Entities.User;

public class UserManager {

    public void add(User user) {
        System.out.println("User has been added to the system : " + user.userName());
    }

    public void delete(User user) {
        System.out.println("User has been deleted : " + user.userName());
    }

    public void update(User user) {
        System.out.println("User has been updated: " + user.userName());
    }
}
