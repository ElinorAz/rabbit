package control;



import java.util.ArrayList;

import javafx.beans.property.Property;
import model.Game;
import model.GeneralVariables;
import model.PlayerInGame;
import model.Question;
import model.Square;

public class PlayerInGameControl {

	public static  boolean RollDice(){ // still not finished
	return false;
	}
	public static int MovePlayer(int  player,int gameNum, int steps ){//to marina - this method needs to return the square num accroding to the steps for the player. 
		
		
		PlayerInGame pig = null;
		ArrayList<PlayerInGame> playersInGame = new ArrayList<>(MonopolyGame.getGameFromArray(gameNum).getPlayersQueqe());

		for(PlayerInGame p : playersInGame)	{
			if(p.getPlayerNum() == player){
				 pig = p;
			}
		}
		if(!(pig == null)){
		int currentSquare = pig.getCurrentSquare().getNum();
		
		if((currentSquare + steps) > GeneralVariables.getNumSquaresInGame())
			currentSquare=(currentSquare + steps) - GeneralVariables.getNumSquaresInGame();
		else
			currentSquare+=steps;
		
		return currentSquare;//the new square the player is in it
		}
		return -1;
	}
	
	public  static String Answer(Question q){// still not finished
		return null;
	}
	
	public static void PurchaseProperty(Property p){// still not finished
		
	}
	
	public static boolean payRent(Property p , PlayerInGame payer){// still not finished
		return false;
	}
	
}
