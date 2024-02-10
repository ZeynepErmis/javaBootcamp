import Entities.concretes.Campaign;
import Entities.concretes.Game;
import Entities.concretes.User;
import business.abstracts.GameService;
import business.abstracts.SalesService;
import business.abstracts.UserService;
import business.concretes.GameManager;
import business.concretes.SalesManager;
import business.concretes.UserManager;
import dataAccess.concretes.HibernateGameDao;
import dataAccess.concretes.HibernateSalesDao;
import dataAccess.concretes.HibernateUserDao;

public class Main {

    public static void main(String[] args) {
        SalesService salesService = new SalesManager(new HibernateSalesDao());
        salesService.sale(new User(1, "Zeynep"), new Game(1, "valorant", 50));

        salesService.saleWithCampaign(new User(2, "x"), new Game(1, "csgo", 60), new Campaign(1, "sale", 10));

    }
}
