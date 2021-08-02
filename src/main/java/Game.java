
public class Game {

	IWinnerStrategy iWinnerStrategy;

	Player p1;
	Player p2;
	static long gameId = 0L;
	Board board;
	String level;
	Game(IWinnerStrategy iWinnerStrategy , Player player1, Player player2 ,int size, String level ){
		this.iWinnerStrategy = iWinnerStrategy;
		this.board= new Board(size);
		this.p1=player1;
		this.p2=player2;
		this.gameId++;
		
		this.level = level;
		
		System.out.println("Game created");
	}
	
	void launch() {
		this.iWinnerStrategy.checkWinner();
		this.p1.makeMove();
		this.p2.makeMove();
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new HumanPlayer(new User("gk1" , "gk@test.com"));
		
		
		Game g = GameFactory.create("Default",p1 , new Computer(new HardStrategy()) , 3 ,"Hard");
		g.launch();
		
		Game g1 = GameFactory.create("Modified" , p1 , p1 , 3,  "Easy");	
		g1.launch();

	}

}
