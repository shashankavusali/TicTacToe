package threeInARow;

public class MasterPlayer extends Player {

	protected MasterPlayer(Player opponent,char mark) {
		super(opponent,mark);
		opponent.setOpponent(this);
	}

	public Move getMove(Board board) {
		// TODO Auto-generated method stub
		return null;
	}

}