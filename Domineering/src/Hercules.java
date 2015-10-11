package domineering;

import game.*;

public class Hercules extends GamePlayer{
	private int rows = 0;
	private int cols = 0;
	protected DomineeringMove [] openingMoves;
	protected ScoredDomineeringMove [] mvStack;
	
	protected class ScoredDomineeringMove extends DomineeringMove{
		public double score;
		public ScoredDomineeringMove(int r1, int c1, int r2, int c2, int score){
			super(r1, c1, r2, c2);
			this.score = score;
		}
		public void set(int r1, int c1, int r2, int c2, int score){
			this.score = score;
			this.row1 = r1;
			this.row2 = r2;
			this.col1 = c1;
			this.col2 = c2;
		}
	}
	
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
		return mvStack[0];
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
