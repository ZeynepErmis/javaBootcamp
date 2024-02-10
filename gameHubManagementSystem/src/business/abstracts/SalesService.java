package business.abstracts;

import Entities.concretes.Campaign;
import Entities.concretes.Game;
import Entities.concretes.User;

public interface SalesService {
    void sale(User user, Game game);

    void saleWithCampaign(User user, Game game, Campaign campaign);
}
