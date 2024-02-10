package dataAccess.concretes;

import Entities.concretes.Campaign;
import Entities.concretes.Game;
import Entities.concretes.User;
import dataAccess.abstracts.CampaignDao;
import dataAccess.abstracts.SalesDao;

public class HibernateSalesDao implements SalesDao {
    @Override
    public void sale(User user, Game game) {
        System.out.println("Game and user added using Hibernate");
    }

    @Override
    public void saleWithCampaign(User user, Game game, Campaign campaign) {
        System.out.println("Game, campaign and user added using Hibernate");
    }
}
