package Concrate;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("The game was succesfully added : " + game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("The game was succesfully deleted : " + game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("The game was succesfully updated : " + game.getGameName());
		
	}

}
