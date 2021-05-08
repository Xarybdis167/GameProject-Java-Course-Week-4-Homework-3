package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface GameSellService {

	void sale(Game game, Customer customer);
	void campaignSale(Game game, Customer customer, Campaign campaign);
}
