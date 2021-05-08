package Entities;

public class Game {

	private int id;
	private String gameName;
	private String gameNumber;
	private double gamePrice;
	
	
	public Game(int id, String gameName, String gameNumber, double gamePrice) {
		this.id = id;
		this.gameName = gameName;
		this.gameNumber = gameNumber;
		this.gamePrice = gamePrice;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getGameName() {
		return gameName;
	}


	public void setGameName(String gameName) {
		this.gameName = gameName;
	}


	public String getGameNumber() {
		return gameNumber;
	}


	public void setGameNumber(String gameNumber) {
		this.gameNumber = gameNumber;
	}


	public double getGamePrice() {
		return gamePrice;
	}


	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}
	
}
