package Entities;

public class Campaign {

	private int id;
	private String campaignName;
	private String campaignNumber;
	private double campaignPrice;
	
	
	public Campaign(int id, String campaignName, String campaignNumber, double campaignPrice) {
		this.id = id;
		this.campaignName = campaignName;
		this.campaignNumber = campaignNumber;
		this.campaignPrice = campaignPrice;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCampaignName() {
		return campaignName;
	}


	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}


	public String getCampaignNumber() {
		return campaignNumber;
	}


	public void setCampaignNumber(String campaignNumber) {
		this.campaignNumber = campaignNumber;
	}


	public double getCampaignPrice() {
		return campaignPrice;
	}


	public void setCampaignPrice(double campaignPrice) {
		this.campaignPrice = campaignPrice;
	}
	
}
