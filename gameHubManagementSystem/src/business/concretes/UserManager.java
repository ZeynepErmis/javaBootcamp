package business.concretes;

import Entities.concretes.User;
import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;

public class UserManager implements UserService {

    private UserDao userDao;

    // Constructor that takes UserDao object as parameter
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    // Method to add a user
    public void add(User user) {
        // Calling add method of UserDao to add user
        this.userDao.add(user);

        // Printing a message indicating that user is added to the system
        System.out.println("User added to the system : " + user.userName());
    }
}
