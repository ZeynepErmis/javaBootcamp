package dataAccess.concretes;

import Entities.concretes.Game;
import dataAccess.abstracts.GameDao;

public class HibernateGameDao implements GameDao {
    @Override
    public void add(Game game) {
        System.out.println("User added using hibernate : " + game.getGameName());
    }

    @Override
    public void update(Game game) {
        System.out.println("User added using hibernate : " + game.getGameName());
    }

    @Override
    public void delete(Game game) {
        System.out.println("User added using hibernate : " + game.getGameName());
    }
}
