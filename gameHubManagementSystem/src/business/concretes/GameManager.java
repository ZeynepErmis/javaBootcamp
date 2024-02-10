package business.concretes;

import Entities.concretes.Game;
import business.abstracts.GameService;
import dataAccess.abstracts.GameDao;

public class GameManager implements GameService {

    private GameDao gameDao;

    public GameManager(GameDao gameDao) {
        this.gameDao = gameDao;
    }

    @Override
    public void add(Game game) {
        this.gameDao.add(game);

        System.out.println("Game added to the system" + game.getGameName());
    }
}
