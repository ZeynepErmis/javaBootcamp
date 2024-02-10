package business.concretes;

import Entities.concretes.Campaign;
import business.abstracts.CampaignService;
import dataAccess.abstracts.CampaignDao;

public class CampaignManager implements CampaignService {

    CampaignDao campaignDao;

    public CampaignManager(CampaignDao campaignDao) {
        this.campaignDao = campaignDao;
    }

    @Override
    public void add(Campaign campaign) {
        this.campaignDao.add(campaign);
        System.out.println("Campaign added : " + campaign.getCampaignName());
    }
}
