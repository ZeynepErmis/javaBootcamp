package dataAccess.concretes;

import Entities.concretes.Campaign;
import dataAccess.abstracts.CampaignDao;

public class HibernateCampaignDao implements CampaignDao {
    @Override
    public void add(Campaign campaign) {
        System.out.println("User added using hibernate : " + campaign.getCampaignName());
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("User added using hibernate : " + campaign.getCampaignName());
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println("User added using hibernate : " + campaign.getCampaignName());
    }
}
