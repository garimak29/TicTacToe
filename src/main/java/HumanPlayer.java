
public class HumanPlayer extends Player {
	User user;
	public HumanPlayer(User user) {
		this.user = user;
		// TODO Auto-generated constructor stub
		System.out.println("Human");
		System.out.println(user.toString());
	}
	@Override
	void makeMove() {
		// TODO Auto-generated method stub
		System.out.println("Human makes move");
		
	}

}
