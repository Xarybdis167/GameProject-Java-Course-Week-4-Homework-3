package Concrate;

import Abstract.GameSellService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class GameSellManager implements GameSellService{

	@Override
	public void sale(Game game, Customer customer) {
		System.out.println("The " + game.getGameName() + " purchased by " + customer.getUserName() +  " Payment amount : " + game.getGamePrice() + "£");
		
	}

	@Override
	public void campaignSale(Game game, Customer customer, Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " The product of game named " + game.getGameName() + ", purchased by " + customer.getUserName() + " : Payment amaunt : "  + campaign.getCampaignPrice() + "£");
		
	}

}
