package business.concretes;

import Entities.concretes.Campaign;
import Entities.concretes.Game;
import Entities.concretes.User;
import business.abstracts.SalesService;
import dataAccess.abstracts.SalesDao;

public class SalesManager implements SalesService {

    private SalesDao salesDao;

    public SalesManager(SalesDao salesDao) {
        this.salesDao = salesDao;
    }

    public void sale(User user, Game game) {
        salesDao.sale(user, game);
        System.out.println("the game named " + game.getGameName() + " added to user " + user.userName());
    }

    @Override
    public void saleWithCampaign(User user, Game game, Campaign campaign) {
        salesDao.saleWithCampaign(user, game, campaign);
        System.out.println("the game named " + game.getGameName() + " added to user " + user.userName() + " with campaign " + campaign.getCampaignName());
    }
}
