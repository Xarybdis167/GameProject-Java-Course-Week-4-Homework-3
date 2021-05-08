import Adapters.MerniceServiceAdapter;
import Concrate.CampaignManager;
import Concrate.CustomerManager;
import Concrate.GameManager;
import Concrate.GameSellManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1, "Xarybdis" , "Emirhan", "Yýlmaz", "0001", "12983771a", "57346350160" , 1999); 
		
		CustomerManager customerManager = new CustomerManager(new MerniceServiceAdapter());
		customerManager.add(customer1);
		customerManager.delete(customer1);
		customerManager.update(customer1);
		
		System.out.println("//////////////////////////////");
		
		Game game1 = new Game(100, "Apex Legends", "0100", 5);
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.delete(game1);
		gameManager.update(game1);
		
		System.out.println("///////////////////////////////");
		
		Campaign campaign1 = new Campaign(1000, "Battle Pass", "1000", 10);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.delete(campaign1);
		campaignManager.update(campaign1);
		
		System.out.println("//////////////////////////////");
		
		GameSellManager gameSellManager = new GameSellManager();
		gameSellManager.campaignSale(game1, customer1, campaign1);
		
		System.out.println("//////////////////////////////");
		
		gameSellManager.sale(game1, customer1);
		
		
	}

}
