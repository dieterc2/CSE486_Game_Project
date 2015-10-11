package domineering;
import java.util.ArrayList;

import game.*;

public class Hercules extends GamePlayer{
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
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GamePlayer p = new Hercules("Hercules+");
		p.compete(args, 1);

	}

	public GameMove getMove(GameState state, String lastMove){
		
		return mvStack[0];
	}
		
}
