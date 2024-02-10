package dataAccess.abstracts;

import Entities.concretes.Campaign;
import Entities.concretes.Game;
import Entities.concretes.User;

public interface SalesDao {
    void sale(User user, Game game);
    void saleWithCampaign(User user, Game game, Campaign campaign);
}
