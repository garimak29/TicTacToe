
public class Computer extends Player {
	ILevelStrategy ilevelStrategy;
	Computer(ILevelStrategy ilevelStrategy){
		this.ilevelStrategy = ilevelStrategy;
		System.out.println("Computer class created");
	}
	void makeMove() {
		ilevelStrategy.makeMove();
	}
	
}
