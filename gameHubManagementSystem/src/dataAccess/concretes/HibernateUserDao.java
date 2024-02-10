package dataAccess.concretes;

import Entities.concretes.User;
import dataAccess.abstracts.UserDao;

public class HibernateUserDao implements UserDao {
    @Override
    public void add(User user) {
        System.out.println("User added using hibernate : " + user.userName());
    }

    @Override
    public void update(User user) {
        System.out.println("User updated : " + user.userName());
    }

    @Override
    public void delete(User user) {
        System.out.println("User deleted : " + user.userName());
    }
}
