
public class GameFactory {
	static Game create(String type , Player p1 , Player p2 , int size , String level) {
		IWinnerStrategy strategy = chooseStrategy(type);
		return new Game(strategy , p1 , p2 , size , level);
	}
	
	public static IWinnerStrategy chooseStrategy(String type) {
		if(type == "Default")
			return (new DeafultStrategy());
		else
			return (new ModifiedStrategy());
	}
	
	
}
