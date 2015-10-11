package game;

public class Hercules extends GamePlayer{

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
		return null;
	}
		
}
