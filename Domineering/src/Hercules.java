package domineering;

import game.GameMove;
import game.GamePlayer;
import game.GameState;

public class Hercules extends GamePlayer{

	private int rows = 0;
	private int cols = 0;
	protected DomineeringMove [] openingMoves;
	
	public Hercules(String n) 
	{
		super(n, "Domineering");
		createOpeningMoves();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GamePlayer p = new Hercules("Hercules+");
		p.compete(args, 1);

	}

	public GameMove getMove(GameState state, String lastMove){
		/*The following code is for our opening moves
		 *  Home is horizontal
		 *	Away is Vertical
		 */
		
		return null;
		//End of opening moves.
		
	}
	
	public void createOpeningMoves(){
		if(side.equals("AWAY")){
			for(int i = 0; i < rows -1; i++){
				
			}
		}else if(side.equals("HOME")){
			for(int i = 0; i < cols -1; i++){
				
			}
		}
	}
		
}
