package clueGame;

public class HumanPlayer extends Player {

	public HumanPlayer(String playerName) {
		super(playerName);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean isHuman(){
		return true;
	}

}
