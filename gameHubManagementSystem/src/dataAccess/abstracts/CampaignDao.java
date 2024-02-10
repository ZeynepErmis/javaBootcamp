package dataAccess.abstracts;

import Entities.concretes.Campaign;
import Entities.concretes.Game;

public interface CampaignDao {
    void add(Campaign campaign);

    void update(Campaign campaign);

    void delete(Campaign campaign);
}
