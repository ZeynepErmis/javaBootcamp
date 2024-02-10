package dataAccess.abstracts;

import Entities.concretes.Game;
import Entities.concretes.User;

public interface GameDao {

    void add(Game game);

    void update(Game game);

    void delete(Game game);
}
